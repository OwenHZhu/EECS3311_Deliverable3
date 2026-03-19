package main.models;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

import main.enums.AccountStatus;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JList categoryList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1150, 727);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(138, 55, 84));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 550, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		
		JLabel lblNewLabel = new JLabel("Sign Up");
		lblNewLabel.setForeground(new Color(138, 55, 84));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 34));
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setForeground(new Color(138, 55, 84));
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		
		textField = new JTextField();
		textField.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(new Color(138, 55, 84));
		lblNewLabel_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		
		JLabel lblNewLabel_2 = new JLabel("Please create password with: Uppercase, LowerCase, Numbers, and Symbols");
		lblNewLabel_2.setForeground(new Color(138, 55, 84));
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Re-type password");
		lblNewLabel_1_1_1.setForeground(new Color(138, 55, 84));
		lblNewLabel_1_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Categories");
		lblNewLabel_1_1_1_1.setForeground(new Color(138, 55, 84));
		lblNewLabel_1_1_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.setBackground(new Color(138, 55, 84));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnNewButton.setOpaque(true);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(true);
		btnNewButton.addActionListener(ev -> {
			String email = textField.getText() == null ? "" : textField.getText().trim();
			String pass1 = new String(passwordField.getPassword());
			String pass2 = new String(passwordField_1.getPassword());
			String name = textField_3.getText() == null ? "" : textField_3.getText().trim();

			if (email.isEmpty() || pass1.isEmpty() || pass2.isEmpty() || name.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Please fill email, password, and ID/name.");
				return;
			}
			if (!pass1.equals(pass2)) {
				JOptionPane.showMessageDialog(this, "Passwords do not match.");
				return;
			}

			Object selected = categoryList == null ? null : categoryList.getSelectedValue();
			if (!(selected instanceof String)) {
				JOptionPane.showMessageDialog(this, "Please select a category.");
				return;
			}
			String selectedLabel = (String) selected;
			String userType = switch (selectedLabel) {
				case "Student" -> "student";
				case "Faculty member" -> "faculty";
				case "Researcher" -> "researcher";
				case "Guest" -> "guest";
				default -> null;
			};
			if (userType == null) {
				JOptionPane.showMessageDialog(this, "Unknown category: " + selectedLabel);
				return;
			}

			try {
				User created = AppBackend.getInstance().getFacade().registerUserAutoId(
						userType,
						name,
						email,
						pass1,
						name,
						"EECS"
				);

				if (created.getStatus() == AccountStatus.Active) {
					JOptionPane.showMessageDialog(this, "Account created and approved. You can login now.");
					AppBackend.getInstance().getSession().setCurrentUser(created);
					MainPage main = new MainPage(created);
					main.setVisible(true);
					main.pack();
					main.setLocationRelativeTo(null);
					dispose();
				} else {
					JOptionPane.showMessageDialog(this, "Account created. You may need department approval before login.");
					Login login = new Login();
					login.setVisible(true);
					login.pack();
					login.setLocationRelativeTo(null);
					dispose();
				}
			} catch (RuntimeException ex) {
				JOptionPane.showMessageDialog(this, "Sign up failed: " + ex.getMessage());
			}
		});

		JButton btnBackToLogin = new JButton("Back to Login");
		btnBackToLogin.setBackground(new Color(255, 255, 255));
		btnBackToLogin.setForeground(new Color(138, 55, 84));
		btnBackToLogin.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnBackToLogin.setOpaque(true);
		btnBackToLogin.setBorderPainted(false);
		btnBackToLogin.setContentAreaFilled(true);
		btnBackToLogin.addActionListener(ev -> {
			Login login = new Login();
			login.setVisible(true);
			login.pack();
			login.setLocationRelativeTo(null);
			dispose();
		});
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Full Name:");
		lblNewLabel_1_1_1_2.setForeground(new Color(138, 55, 84));
		lblNewLabel_1_1_1_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Trebuchet MS", Font.PLAIN, 24));
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 24));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(61)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(20)
									.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField, GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
										.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
										.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE)
										.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE))
									.addGap(347))
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnBackToLogin, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 423, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_1_1_2, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(184)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_2)
					.addGap(31)
					.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(lblNewLabel_1_1_1_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnBackToLogin, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(37))
		);
		
		categoryList = new JList();
		scrollPane.setViewportView(categoryList);
		categoryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		categoryList.setValueIsAdjusting(true);
		categoryList.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		categoryList.setVisibleRowCount(4);
		categoryList.setModel(new AbstractListModel() {
			String[] values = new String[] {"Student", "Faculty member", "Researcher", "Guest"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		categoryList.setToolTipText("");
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(IconUtil.loadIcon("/main/Pics/UB_Logos_26.png"));
		
		JLabel lblNewLabel_4 = new JLabel("Lab Equipment Service");
		lblNewLabel_4.setForeground(new Color(239, 239, 239));
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		
		JLabel lblNewLabel_5 = new JLabel("Welcome!");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD, 44));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(31)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 502, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(37, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(172, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 257, GroupLayout.PREFERRED_SIZE))
					.addGap(141))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(33)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addGap(155)
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
					.addComponent(lblNewLabel_4)
					.addGap(19))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
