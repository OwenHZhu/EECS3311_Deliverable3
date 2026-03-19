package main.models;

import main.enums.PaymentMethod;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Font;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

public class MakeReservationDialog extends JDialog {
    private final ReservationFacade facade;
    private final String userId;
    private final String equipmentId;
    private final Runnable onSuccess;

    private JTextField startTimeField;
    private JTextField endTimeField;
    private JComboBox<PaymentMethod> paymentMethodBox;

    public MakeReservationDialog(JFrame parent,
                                   ReservationFacade facade,
                                   String userId,
                                   String equipmentId,
                                   Runnable onSuccess) {
        super(parent, "Make Reservation", true);
        this.facade = facade;
        this.userId = userId;
        this.equipmentId = equipmentId;
        this.onSuccess = onSuccess;
        initUi();
    }

    private void initUi() {
        setSize(520, 280);
        setLayout(null);

        JLabel startLabel = new JLabel("Start time (yyyy-MM-ddTHH:mm):");
        startLabel.setBounds(20, 20, 360, 25);
        startLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
        add(startLabel);

        startTimeField = new JTextField();
        startTimeField.setBounds(20, 50, 260, 25);
        add(startTimeField);

        JLabel endLabel = new JLabel("End time (yyyy-MM-ddTHH:mm):");
        endLabel.setBounds(20, 85, 340, 25);
        endLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
        add(endLabel);

        endTimeField = new JTextField();
        endTimeField.setBounds(20, 115, 260, 25);
        add(endTimeField);

        JLabel paymentLabel = new JLabel("Payment method:");
        paymentLabel.setBounds(300, 50, 150, 25);
        paymentLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
        add(paymentLabel);

        paymentMethodBox = new JComboBox<>(PaymentMethod.values());
        paymentMethodBox.setBounds(300, 80, 170, 25);
        add(paymentMethodBox);

        JButton reserveButton = new JButton("Reserve");
        reserveButton.setBounds(300, 150, 170, 30);
        reserveButton.addActionListener(e -> onReserve());
        add(reserveButton);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(20, 150, 120, 30);
        cancelButton.addActionListener(e -> dispose());
        add(cancelButton);
    }

    private void onReserve() {
        try {
            LocalDateTime start = parseDateTime(startTimeField.getText());
            LocalDateTime end = parseDateTime(endTimeField.getText());
            PaymentMethod method = (PaymentMethod) paymentMethodBox.getSelectedItem();

            boolean ok = facade.reserveReservation(userId, equipmentId, start, end, method);
            if (!ok) {
                JOptionPane.showMessageDialog(this, "Reservation failed (time conflict, unavailable equipment, or inactive user).");
                return;
            }
            if (onSuccess != null) {
                onSuccess.run();
            }
            dispose();
        } catch (IllegalArgumentException | DateTimeParseException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Use ISO like 2026-03-20T10:00.");
        }
    }

    private LocalDateTime parseDateTime(String raw) {
        if (raw == null) {
            throw new IllegalArgumentException("time is null");
        }
        String s = raw.trim();
        // Allow a common alternative separator.
        s = s.replace(' ', 'T');
        return LocalDateTime.parse(s);
    }
}

