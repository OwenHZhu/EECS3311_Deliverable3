package main.models;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Button;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.util.List;

public class MainPage extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private final ReservationFacade facade = AppBackend.getInstance().getFacade();
	private final UserSession session = AppBackend.getInstance().getSession();
	private User currentUser;

	public MainPage(User currenUser) {
		this.currentUser = currenUser;
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
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(IconUtil.loadIcon("/main/Pics/UB_Logos_26.png"));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(31)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 518, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(381, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(36)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(41, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_4 = new JPanel();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(38)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 844, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(47, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(31)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 483, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(39, Short.MAX_VALUE))
		);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnNewButton_1 = new JButton("Make Reservation");
		btnNewButton_1.addActionListener(e -> {
			int selectedRow = table.getSelectedRow();
			if (selectedRow == -1) {
				ReservationNotChosenError dialog = new ReservationNotChosenError();
				dialog.setLocationRelativeTo(this);
				dialog.setVisible(true);
				return;
			}
			String equipmentId = String.valueOf(table.getValueAt(selectedRow, 0));
			String userId = session.getCurrentUserId();
			if (userId == null) {
				JOptionPane.showMessageDialog(this, "Please login first.");
				return;
			}
			MakeReservationDialog dialog = new MakeReservationDialog(
					this, facade, userId, equipmentId, this::refreshEquipmentTable);
			dialog.setLocationRelativeTo(this);
			dialog.setVisible(true);
		});
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnNewButton_1.setBackground(new Color(218, 163, 181));
		btnNewButton_1.setForeground(new Color(146, 54, 72));
		
		JLabel lblNewLabel_2 = new JLabel("Want to make a reservation? Choose an item and click here!");
		lblNewLabel_2.setForeground(new Color(146, 54, 72));
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 568, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 776, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(35, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(32)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addGap(66))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {},
			new String[] { "Equipment ID", "Description", "Location", "Status" }
		));
		table.setShowVerticalLines(false);
		table.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		scrollPane.setViewportView(table);
		refreshEquipmentTable();
		panel_4.setLayout(gl_panel_4);
		panel_2.setLayout(gl_panel_2);
		
		JLabel lblNewLabel = new JLabel("Hello, ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 32));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(218, 163, 181));
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(218, 163, 181));
		panel_3_1.setForeground(new Color(255, 255, 255));
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBackground(new Color(218, 163, 181));

		// --- SIGN OUT panel ---
		JPanel panel_signout = new JPanel();
		panel_signout.setBackground(new Color(218, 163, 181));

		JButton btnSignOut = new JButton("SIGN OUT");
		btnSignOut.addActionListener(e -> {
			AppBackend.getInstance().getSession().setCurrentUser(null);
			Login login = new Login();
			login.setVisible(true);
			login.pack();
			login.setLocationRelativeTo(null);
			dispose();
		});
		btnSignOut.setHorizontalAlignment(SwingConstants.RIGHT);
		btnSignOut.setForeground(new Color(138, 55, 84));
		btnSignOut.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		GroupLayout gl_panel_signout = new GroupLayout(panel_signout);
		gl_panel_signout.setHorizontalGroup(
			gl_panel_signout.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_signout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnSignOut, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_signout.setVerticalGroup(
			gl_panel_signout.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_signout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnSignOut)
					.addContainerGap(35, Short.MAX_VALUE))
		);
		panel_signout.setLayout(gl_panel_signout);
		// --- END SIGN OUT panel ---

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_3_1, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_3_1_1, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_signout, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(59)
							.addComponent(lblNewLabel)))
					.addContainerGap(33, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(50)
					.addComponent(lblNewLabel)
					.addGap(38)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3_1, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3_1_1, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_signout, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(321, Short.MAX_VALUE))
		);
		
		JButton btnNewButton = new JButton("ACCOUNT\r\n");
		btnNewButton.addActionListener(e -> {
			JFrame next;
			if (currentUser instanceof HeadLabCoordinator) {
				next = new HeadLabAccountPage(currentUser);
			} else if (currentUser instanceof LabManagerUser) {
				next = new LabManagerAccountPage(currentUser);
			} else {
				next = new AccountPage(currentUser);
			}
			next.setVisible(true);
			next.pack();
			next.setLocationRelativeTo(null);
			dispose();
		});
		btnNewButton.setForeground(new Color(138, 55, 84));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		btnNewButton.setHorizontalAlignment(SwingConstants.RIGHT);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_3.setLayout(gl_panel_3);
		
		JButton btnPayment = new JButton("PAYMENT");
		btnPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaymentPage PaymentFrame = new PaymentPage(currentUser);
				PaymentFrame.setVisible(true);
				PaymentFrame.pack();
				PaymentFrame.setLocationRelativeTo(null);
				setVisible(false);
			}
		});
		btnPayment.setForeground(new Color(138, 55, 84));
		btnPayment.setHorizontalAlignment(SwingConstants.RIGHT);
		btnPayment.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		GroupLayout gl_panel_3_1_1 = new GroupLayout(panel_3_1_1);
		gl_panel_3_1_1.setHorizontalGroup(
			gl_panel_3_1_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3_1_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnPayment, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_3_1_1.setVerticalGroup(
			gl_panel_3_1_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3_1_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnPayment, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_3_1_1.setLayout(gl_panel_3_1_1);
		
		JButton btnMyReservation = new JButton("MY RESERVATION");
		btnMyReservation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyReservationPage ReservationFrame = new MyReservationPage(currentUser);
				ReservationFrame.setVisible(true);
				ReservationFrame.pack();
				ReservationFrame.setLocationRelativeTo(null);
				setVisible(false);
			}
		});
		btnMyReservation.setForeground(new Color(138, 55, 84));
		btnMyReservation.setHorizontalAlignment(SwingConstants.RIGHT);
		btnMyReservation.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		GroupLayout gl_panel_3_1 = new GroupLayout(panel_3_1);
		gl_panel_3_1.setHorizontalGroup(
			gl_panel_3_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_3_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnMyReservation, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_3_1.setVerticalGroup(
			gl_panel_3_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnMyReservation, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_3_1.setLayout(gl_panel_3_1);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}

	private void refreshEquipmentTable() {
		if (table == null) return;
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		List<Equipment> equipment = facade.listEquipment();
		for (Equipment e : equipment) {
			model.addRow(new Object[] { e.getEquipmentId(), e.getDescription(), e.getLocation(), e.getStatus().toString() });
		}
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) showMenu(e);
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) showMenu(e);
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}