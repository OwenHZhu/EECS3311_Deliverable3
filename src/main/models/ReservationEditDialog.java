package main.models;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Font;
import java.time.LocalDateTime;

public class ReservationEditDialog extends JDialog {
    private final ReservationFacade facade;
    private final String reservationId;
    private final Runnable onSuccess;

    private JTextField modifyStartField;
    private JTextField modifyEndField;
    private JTextField extendEndField;

    public ReservationEditDialog(JFrame parent,
                                  ReservationFacade facade,
                                  String reservationId,
                                  Runnable onSuccess) {
        super(parent, "Reservation Changes", true);
        this.facade = facade;
        this.reservationId = reservationId;
        this.onSuccess = onSuccess;
        initUi();
    }

    private void initUi() {
        setSize(560, 340);
        setLayout(null);

        Reservation r = facade.getReservationById(reservationId);

        JLabel idLabel = new JLabel("Reservation ID: " + reservationId);
        idLabel.setBounds(20, 20, 520, 25);
        idLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
        add(idLabel);

        JLabel modifyStartLabel = new JLabel("New start:");
        modifyStartLabel.setBounds(20, 60, 120, 25);
        add(modifyStartLabel);
        modifyStartField = new JTextField();
        modifyStartField.setBounds(130, 60, 170, 25);
        if (r != null && r.getStartTime() != null) {
            modifyStartField.setText(r.getStartTime().toString().substring(0, 16));
        }
        add(modifyStartField);

        JLabel modifyEndLabel = new JLabel("New end:");
        modifyEndLabel.setBounds(320, 60, 120, 25);
        add(modifyEndLabel);
        modifyEndField = new JTextField();
        modifyEndField.setBounds(400, 60, 120, 25);
        if (r != null && r.getEndTime() != null) {
            modifyEndField.setText(r.getEndTime().toString().substring(0, 16));
        }
        add(modifyEndField);

        JLabel extendEndLabel = new JLabel("Extend to end:");
        extendEndLabel.setBounds(20, 105, 170, 25);
        add(extendEndLabel);
        extendEndField = new JTextField();
        extendEndField.setBounds(190, 105, 330, 25);
        if (r != null && r.getEndTime() != null) {
            extendEndField.setText(r.getEndTime().toString().substring(0, 16));
        }
        add(extendEndField);

        JButton modifyButton = new JButton("Modify");
        modifyButton.setBounds(20, 160, 150, 35);
        modifyButton.addActionListener(e -> onModify());
        add(modifyButton);

        JButton extendButton = new JButton("Extend");
        extendButton.setBounds(190, 160, 150, 35);
        extendButton.addActionListener(e -> onExtend());
        add(extendButton);

        JButton cancelButton = new JButton("Cancel Reservation");
        cancelButton.setBounds(360, 160, 170, 35);
        cancelButton.addActionListener(e -> onCancel());
        add(cancelButton);
    }

    private void onModify() {
        try {
            LocalDateTime start = parseDateTime(modifyStartField.getText());
            LocalDateTime end = parseDateTime(modifyEndField.getText());
            boolean ok = facade.modifyReservation(reservationId, start, end, LocalDateTime.now());
            if (!ok) {
                JOptionPane.showMessageDialog(this, "Modify failed. Likely conflicts or past reservation start.");
                return;
            }
            if (onSuccess != null) onSuccess.run();
            dispose();
        } catch (RuntimeException ex) {
            JOptionPane.showMessageDialog(this, "Invalid date format. Use ISO like 2026-03-20T10:00.");
        }
    }

    private void onExtend() {
        try {
            LocalDateTime newEnd = parseDateTime(extendEndField.getText());
            boolean ok = facade.extendReservation(reservationId, newEnd);
            if (!ok) {
                JOptionPane.showMessageDialog(this, "Extend failed. Equipment may be busy for that period.");
                return;
            }
            if (onSuccess != null) onSuccess.run();
            dispose();
        } catch (RuntimeException ex) {
            JOptionPane.showMessageDialog(this, "Invalid date format. Use ISO like 2026-03-20T10:00.");
        }
    }

    private void onCancel() {
        boolean ok = facade.cancelReservation(reservationId, LocalDateTime.now());
        if (!ok) {
            JOptionPane.showMessageDialog(this, "Cancel failed. Cancellation is only allowed before reservation start time.");
            return;
        }
        if (onSuccess != null) onSuccess.run();
        dispose();
    }

    private LocalDateTime parseDateTime(String raw) {
        String s = raw == null ? "" : raw.trim();
        // Users may input "yyyy-MM-dd HH:mm".
        s = s.replace(' ', 'T');
        if (s.length() == 16 && !s.contains("T")) {
            // Should not happen with replace, but keep robust.
            s = s.substring(0, 10) + "T" + s.substring(11);
        }
        return LocalDateTime.parse(s);
    }
}

