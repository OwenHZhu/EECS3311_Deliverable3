package main.models;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import main.enums.AccountStatus;

public class HeadLabAccountPage extends JFrame {

	private JPanel contentPane;
	private User currentUser;

	public HeadLabAccountPage(User currentUser) {
		this.currentUser = currentUser;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 839);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(138, 55, 84));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(218, 163, 181));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 929, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 930, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 553, GroupLayout.PREFERRED_SIZE))
		);

		// --- Top bar ---
		JLabel lblTitle = new JLabel("ACCOUNT");
		lblTitle.setFont(new Font("Trebuchet MS", Font.BOLD, 44));
		lblTitle.setForeground(new Color(255, 255, 255));

		JButton btnBack = new JButton("<- Find more lab equipment item");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage mainPage = new MainPage(currentUser);
				mainPage.setVisible(true);
				mainPage.pack();
				mainPage.setLocationRelativeTo(null);
				setVisible(false);
			}
		});
		btnBack.setForeground(new Color(146, 54, 72));
		btnBack.setBackground(new Color(239, 239, 239));
		btnBack.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		btnBack.setHorizontalAlignment(SwingConstants.LEFT);

		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(43)
					.addComponent(lblTitle, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(662, Short.MAX_VALUE))
				.addComponent(btnBack, GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(btnBack)
					.addGap(31)
					.addComponent(lblTitle, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(58, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);

		// --- Account info area ---
		JLabel lblLogo = new JLabel("New label");
		lblLogo.setIcon(IconUtil.loadIcon("/main/Pics/UB_Logos_26.png"));

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(239, 239, 239));

		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 518, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(27)
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 853, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(49, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(48)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
					.addGap(46)
					.addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);

		JLabel lblName   = new JLabel("Name: "       + currentUser.getName());
		JLabel lblId     = new JLabel("User ID: "    + currentUser.getIdOrCertificationNumber());
		JLabel lblStatus = new JLabel("Status: "     + currentUser.getStatus());
		JLabel lblEmail  = new JLabel("Email: "      + currentUser.getEmail());
		JLabel lblDept   = new JLabel("Department: " + currentUser.getDepartment());
		for (JLabel l : new JLabel[]{lblName, lblId, lblStatus, lblEmail, lblDept})
			l.setFont(new Font("Trebuchet MS", Font.PLAIN, 24));

		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblName,   Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
						.addComponent(lblId,     Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
						.addComponent(lblStatus, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
						.addComponent(lblEmail,  Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
						.addComponent(lblDept,   Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE))
					.addGap(30))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(22)
					.addComponent(lblName)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblId)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblStatus)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblEmail,  GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblDept,   GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(76, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		panel_2.setLayout(gl_panel_2);

		// --- Sidebar buttons ---

		// ACCOUNT
		JPanel panel_3_1_2 = new JPanel();
		panel_3_1_2.setForeground(Color.WHITE);
		panel_3_1_2.setBackground(new Color(218, 163, 181));
		JButton btnAccount = new JButton("ACCOUNT");
		btnAccount.addActionListener(e -> { /* already here */ });
		btnAccount.setHorizontalAlignment(SwingConstants.RIGHT);
		btnAccount.setForeground(new Color(138, 55, 84));
		btnAccount.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		GroupLayout gl_3_1_2 = new GroupLayout(panel_3_1_2);
		gl_3_1_2.setHorizontalGroup(gl_3_1_2.createParallelGroup(Alignment.TRAILING)
			.addGap(0, 291, Short.MAX_VALUE)
			.addGroup(gl_3_1_2.createSequentialGroup().addContainerGap()
				.addComponent(btnAccount, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE).addContainerGap()));
		gl_3_1_2.setVerticalGroup(gl_3_1_2.createParallelGroup(Alignment.LEADING)
			.addGap(0, 83, Short.MAX_VALUE)
			.addGroup(gl_3_1_2.createSequentialGroup().addContainerGap()
				.addComponent(btnAccount, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panel_3_1_2.setLayout(gl_3_1_2);

		// MY RESERVATION
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(218, 163, 181));
		JButton btnMyReservation = new JButton("MY RESERVATION");
		btnMyReservation.addActionListener(e -> {
			MyReservationPage f = new MyReservationPage(currentUser);
			f.setVisible(true); f.pack(); f.setLocationRelativeTo(null); setVisible(false);
		});
		btnMyReservation.setForeground(new Color(138, 55, 84));
		btnMyReservation.setHorizontalAlignment(SwingConstants.RIGHT);
		btnMyReservation.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		GroupLayout gl_3_1 = new GroupLayout(panel_3_1);
		gl_3_1.setHorizontalGroup(gl_3_1.createParallelGroup(Alignment.LEADING)
			.addGroup(Alignment.TRAILING, gl_3_1.createSequentialGroup().addContainerGap()
				.addComponent(btnMyReservation, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE).addContainerGap()));
		gl_3_1.setVerticalGroup(gl_3_1.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_3_1.createSequentialGroup().addContainerGap()
				.addComponent(btnMyReservation, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panel_3_1.setLayout(gl_3_1);

		// PAYMENT
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBackground(new Color(218, 163, 181));
		JButton btnPayment = new JButton("PAYMENT");
		btnPayment.addActionListener(e -> {
			PaymentPage f = new PaymentPage(currentUser);
			f.setVisible(true); f.pack(); f.setLocationRelativeTo(null); setVisible(false);
		});
		btnPayment.setForeground(new Color(138, 55, 84));
		btnPayment.setHorizontalAlignment(SwingConstants.RIGHT);
		btnPayment.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		GroupLayout gl_3_1_1 = new GroupLayout(panel_3_1_1);
		gl_3_1_1.setHorizontalGroup(gl_3_1_1.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_3_1_1.createSequentialGroup().addContainerGap()
				.addComponent(btnPayment, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_3_1_1.setVerticalGroup(gl_3_1_1.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_3_1_1.createSequentialGroup().addContainerGap()
				.addComponent(btnPayment, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panel_3_1_1.setLayout(gl_3_1_1);

		// ADD NEW MANAGER
		JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setBackground(new Color(218, 163, 181));
		JButton btnAddNewManager = new JButton("ADD NEW MANAGER");
		btnAddNewManager.addActionListener(e -> {
			AddLabManagerDialog dialog = new AddLabManagerDialog(this);
			dialog.setLocationRelativeTo(this);
			dialog.setVisible(true);
		});
		btnAddNewManager.setHorizontalAlignment(SwingConstants.RIGHT);
		btnAddNewManager.setForeground(new Color(138, 55, 84));
		btnAddNewManager.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		GroupLayout gl_3_1_1_1 = new GroupLayout(panel_3_1_1_1);
		gl_3_1_1_1.setHorizontalGroup(gl_3_1_1_1.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_3_1_1_1.createSequentialGroup().addContainerGap()
				.addComponent(btnAddNewManager, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_3_1_1_1.setVerticalGroup(gl_3_1_1_1.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_3_1_1_1.createSequentialGroup().addContainerGap()
				.addComponent(btnAddNewManager)
				.addContainerGap(35, Short.MAX_VALUE)));
		panel_3_1_1_1.setLayout(gl_3_1_1_1);

		// APPROVE USERS
		JPanel panel_approve = new JPanel();
		panel_approve.setBackground(new Color(218, 163, 181));
		JButton btnApproveUsers = new JButton("APPROVE USERS");
		btnApproveUsers.addActionListener(e -> {
			ReservationFacade facade = AppBackend.getInstance().getFacade();
			List<User> allUsers = facade.getAllUsers();
			List<User> pending = new ArrayList<>();
			for (User u : allUsers) {
				if (u.getStatus() == AccountStatus.PendingApproval) pending.add(u);
			}
			if (pending.isEmpty()) {
				JOptionPane.showMessageDialog(this, "No pending approvals.");
				return;
			}
			String[] names = pending.stream()
				.map(u -> u.getName() + " (" + u.getEmail() + ")")
				.toArray(String[]::new);
			String chosen = (String) JOptionPane.showInputDialog(
				this, "Select user to approve:", "Approve Users",
				JOptionPane.PLAIN_MESSAGE, null, names, names[0]);
			if (chosen == null) return;
			int idx = Arrays.asList(names).indexOf(chosen);
			facade.approveUser(pending.get(idx), true);
			JOptionPane.showMessageDialog(this, pending.get(idx).getName() + " has been approved!");
		});
		btnApproveUsers.setHorizontalAlignment(SwingConstants.RIGHT);
		btnApproveUsers.setForeground(new Color(138, 55, 84));
		btnApproveUsers.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		GroupLayout gl_approve = new GroupLayout(panel_approve);
		gl_approve.setHorizontalGroup(gl_approve.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_approve.createSequentialGroup().addContainerGap()
				.addComponent(btnApproveUsers, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_approve.setVerticalGroup(gl_approve.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_approve.createSequentialGroup().addContainerGap()
				.addComponent(btnApproveUsers)
				.addContainerGap(35, Short.MAX_VALUE)));
		panel_approve.setLayout(gl_approve);

		// SIGN OUT
		JPanel panel_signout = new JPanel();
		panel_signout.setBackground(new Color(218, 163, 181));
		JButton btnSignOut = new JButton("SIGN OUT");
		btnSignOut.addActionListener(e -> {
			AppBackend.getInstance().getSession().setCurrentUser(null);
			Login login = new Login();
			login.setVisible(true); login.pack(); login.setLocationRelativeTo(null);
			dispose();
		});
		btnSignOut.setHorizontalAlignment(SwingConstants.RIGHT);
		btnSignOut.setForeground(new Color(138, 55, 84));
		btnSignOut.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		GroupLayout gl_signout = new GroupLayout(panel_signout);
		gl_signout.setHorizontalGroup(gl_signout.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_signout.createSequentialGroup().addContainerGap()
				.addComponent(btnSignOut, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_signout.setVerticalGroup(gl_signout.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_signout.createSequentialGroup().addContainerGap()
				.addComponent(btnSignOut)
				.addContainerGap(35, Short.MAX_VALUE)));
		panel_signout.setLayout(gl_signout);

		// --- Assemble sidebar ---
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_3_1_2,   GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3_1,     GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3_1_1,   GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3_1_1_1, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_approve,  GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_signout,  GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(33, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(40)
					.addComponent(panel_3_1_2,   GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3_1,     GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3_1_1,   GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_3_1_1_1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_approve,  GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_signout,  GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(150, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e)  { if (e.isPopupTrigger()) showMenu(e); }
			public void mouseReleased(MouseEvent e) { if (e.isPopupTrigger()) showMenu(e); }
			private void showMenu(MouseEvent e) { popup.show(e.getComponent(), e.getX(), e.getY()); }
		});
	}
}