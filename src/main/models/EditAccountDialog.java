package main.models;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditAccountDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField nameField;
	private JTextField emailField;
	private JFrame parent;
	private User currentUser;

	
	public EditAccountDialog(JFrame parent, User currentUser) {
		this.parent = parent;
		this.currentUser = currentUser;
		setBounds(100, 100, 570, 272);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		nameField = new JTextField();
		nameField.setColumns(10);
		emailField = new JTextField();
		emailField.setColumns(10);
		JLabel lblNewLabel_1 = new JLabel("Editing Account");
		lblNewLabel_1.setForeground(new Color(146, 54, 72));
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		JButton btnNewButton = new JButton("Change");
		btnNewButton.addActionListener(e -> {
			String name = nameField.getText().trim();
			String email = emailField.getText().trim();
			
			if (name == null || email == null) {
				JOptionPane.showMessageDialog(this, "Cannot leave the new name or email empty.");
				return;
			} else {
				currentUser.setName(name);
				currentUser.setEmail(email);
			}
			
			JOptionPane.showMessageDialog(this, "The changes are made!");
			dispose();
			
		});
		btnNewButton.setBackground(new Color(218, 163, 181));
		btnNewButton.setForeground(new Color(146, 54, 72));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(e -> {
			dispose();
		});
		btnCancel.setBackground(new Color(218, 163, 181));
		btnCancel.setForeground(new Color(146, 54, 72));
		btnCancel.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap(34, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(nameField, GroupLayout.PREFERRED_SIZE, 399, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(emailField, GroupLayout.PREFERRED_SIZE, 399, GroupLayout.PREFERRED_SIZE)
										.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
											.addGap(25)
											.addComponent(btnNewButton)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
											.addGap(69)))))
							.addGap(32))
						.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
							.addGap(152))))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1)
					.addGap(27)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(nameField, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(emailField, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addContainerGap())
		);
		contentPanel.setLayout(gl_contentPanel);
	}

}
