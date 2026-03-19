package main.models;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Font;

public class AddLabManagerDialog extends JDialog {
    private final ReservationFacade facade;

    private JTextField nameField;
    private JTextField emailField;
    private JTextField idOrCertField;
    private JTextField departmentField;
    private JPasswordField passwordField;
    private JPasswordField passwordField2;

    public AddLabManagerDialog(JFrame parent) {
        super(parent, "Add Lab Manager", true);
        this.facade = AppBackend.getInstance().getFacade();
        initUi();
    }

    private void initUi() {
        setSize(560, 360);
        setLayout(null);

        JLabel nameLabel = new JLabel("Full Name:");
        nameLabel.setBounds(20, 20, 120, 25);
        nameLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(150, 20, 360, 25);
        add(nameField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(20, 55, 120, 25);
        emailLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(150, 55, 360, 25);
        add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20, 90, 120, 25);
        passwordLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 90, 360, 25);
        add(passwordField);

        JLabel passwordLabel2 = new JLabel("Re-type Password:");
        passwordLabel2.setBounds(20, 125, 200, 25);
        passwordLabel2.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
        add(passwordLabel2);

        passwordField2 = new JPasswordField();
        passwordField2.setBounds(150, 125, 360, 25);
        add(passwordField2);

        JLabel idLabel = new JLabel("ID / Certification:");
        idLabel.setBounds(20, 160, 180, 25);
        idLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
        add(idLabel);

        idOrCertField = new JTextField();
        idOrCertField.setBounds(200, 160, 310, 25);
        add(idOrCertField);

        JLabel deptLabel = new JLabel("Department:");
        deptLabel.setBounds(20, 195, 120, 25);
        deptLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
        add(deptLabel);

        departmentField = new JTextField();
        departmentField.setBounds(150, 195, 360, 25);
        add(departmentField);

        JButton addButton = new JButton("Create Manager");
        addButton.setBounds(190, 245, 180, 35);
        addButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
        addButton.addActionListener(e -> onCreate());
        add(addButton);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(390, 245, 90, 35);
        cancelButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
        cancelButton.addActionListener(e -> dispose());
        add(cancelButton);
    }

    private void onCreate() {
        String name = safeTrim(nameField);
        String email = safeTrim(emailField);
        String idOrCert = safeTrim(idOrCertField);
        String department = safeTrim(departmentField);
        String pass1 = new String(passwordField.getPassword());
        String pass2 = new String(passwordField2.getPassword());

        if (name.isEmpty() || email.isEmpty() || idOrCert.isEmpty() || department.isEmpty() || pass1.isEmpty() || pass2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill out all fields.");
            return;
        }
        if (!pass1.equals(pass2)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match.");
            return;
        }

        boolean ok = facade.createLabManagerAccountFromHead(name, email, pass1, idOrCert, department);
        if (!ok) {
            JOptionPane.showMessageDialog(this, "Could not create manager. Ensure you're logged in as Head and the password is strong and email is unique.");
            return;
        }
        JOptionPane.showMessageDialog(this, "Lab manager created!");
        dispose();
    }

    private String safeTrim(JTextField field) {
        return field == null || field.getText() == null ? "" : field.getText().trim();
    }
}

