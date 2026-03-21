package main.models;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import main.enums.ReservationStatus;

public class MyReservationPage extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private final ReservationFacade facade = AppBackend.getInstance().getFacade();
	private final UserSession session = AppBackend.getInstance().getSession();
	private User currentUser;

	public MyReservationPage(User currentUser) {
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
		JLabel lblTitle = new JLabel("MY RESERVATION");
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
		btnBack.setHorizontalAlignment(SwingConstants.LEFT);
		btnBack.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));

		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(43)
					.addComponent(lblTitle, GroupLayout.PREFERRED_SIZE, 436, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(451, Short.MAX_VALUE))
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

		// --- Main content ---
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
							.addGap(36)
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 844, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(49, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(72)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					.addGap(41))
		);

		JScrollPane scrollPane = new JScrollPane();

		// Make Changes button
		JLabel lblHint = new JLabel("Want to make changes? Choose a reservation and click here!");
		lblHint.setForeground(new Color(146, 54, 72));
		lblHint.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));

		JButton btnMakeChanges = new JButton("Make Changes");
		btnMakeChanges.addActionListener(e -> {
			int selectedRow = table.getSelectedRow();
			if (selectedRow == -1) {
				ReservationNotChosenError dialog = new ReservationNotChosenError();
				dialog.setLocationRelativeTo(this);
				dialog.setVisible(true);
				return;
			}
			String reservationId = String.valueOf(table.getValueAt(selectedRow, 0));
			ReservationEditDialog dialog = new ReservationEditDialog(this, facade, reservationId, this::refreshReservations);
			dialog.setLocationRelativeTo(this);
			dialog.setVisible(true);
		});
		btnMakeChanges.setForeground(new Color(146, 54, 72));
		btnMakeChanges.setBackground(new Color(218, 163, 181));
		btnMakeChanges.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));

		// Record Arrival button (Req 4)
		JLabel lblArrivalHint = new JLabel("Select a reservation and record arrival:");
		lblArrivalHint.setForeground(new Color(146, 54, 72));
		lblArrivalHint.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));

		JButton btnRecordArrival = new JButton("Record Arrival");
		btnRecordArrival.setForeground(new Color(146, 54, 72));
		btnRecordArrival.setBackground(new Color(218, 163, 181));
		btnRecordArrival.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		btnRecordArrival.addActionListener(e -> {
			int selectedRow = table.getSelectedRow();
			if (selectedRow == -1) {
				ReservationNotChosenError dialog = new ReservationNotChosenError();
				dialog.setLocationRelativeTo(this);
				dialog.setVisible(true);
				return;
			}
			String reservationId = String.valueOf(table.getValueAt(selectedRow, 0));
			String input = JOptionPane.showInputDialog(
				this,
				"Enter arrival time (yyyy-MM-ddTHH:mm)\n\nTip: enter within 20 min of start = deposit deducted\nEnter after 20 min = deposit forfeited",
				"Record Arrival",
				JOptionPane.PLAIN_MESSAGE
			);
			if (input == null || input.trim().isEmpty()) return;
			try {
				LocalDateTime arrivalTime = LocalDateTime.parse(input.trim());
				String result = facade.recordArrival(reservationId, arrivalTime);
				refreshReservations();
				JOptionPane.showMessageDialog(this, result, "Arrival Recorded", JOptionPane.INFORMATION_MESSAGE);
			} catch (DateTimeParseException ex) {
				JOptionPane.showMessageDialog(this,
					"Invalid date format. Use yyyy-MM-ddTHH:mm (e.g. 2026-03-21T10:15)",
					"Error", JOptionPane.ERROR_MESSAGE);
			}
		});

		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblHint, GroupLayout.PREFERRED_SIZE, 560, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnMakeChanges, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblArrivalHint, GroupLayout.PREFERRED_SIZE, 560, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnRecordArrival, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHint)
						.addComponent(btnMakeChanges))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblArrivalHint)
						.addComponent(btnRecordArrival))
					.addGap(20))
		);

		table = new JTable();
		table.setShowVerticalLines(false);
		scrollPane.setViewportView(table);
		table.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		table.setForeground(new Color(0, 0, 0));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {},
			new String[] { "Reservation ID", "Equipment Item", "User ID", "Start Time", "End Time", "Status", "Deposit ($)" }
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Object.class, Object.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) { return columnTypes[columnIndex]; }
			public boolean isCellEditable(int r, int c) { return false; }
		});
		refreshReservations();
		table.getColumnModel().getColumn(0).setPreferredWidth(84);
		table.getColumnModel().getColumn(1).setPreferredWidth(90);
		panel_3.setLayout(gl_panel_3);
		panel_2.setLayout(gl_panel_2);

		// --- Sidebar ---
		JPanel panel_3_1_2 = new JPanel();
		panel_3_1_2.setForeground(Color.WHITE);
		panel_3_1_2.setBackground(new Color(218, 163, 181));
		JButton btnAccount = new JButton("ACCOUNT");
		btnAccount.addActionListener(e -> {
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
		btnAccount.setHorizontalAlignment(SwingConstants.RIGHT);
		btnAccount.setForeground(new Color(138, 55, 84));
		btnAccount.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		GroupLayout gl_panel_3_1_2 = new GroupLayout(panel_3_1_2);
		gl_panel_3_1_2.setHorizontalGroup(
			gl_panel_3_1_2.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 291, Short.MAX_VALUE)
				.addGroup(gl_panel_3_1_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnAccount, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_3_1_2.setVerticalGroup(
			gl_panel_3_1_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 83, Short.MAX_VALUE)
				.addGroup(gl_panel_3_1_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnAccount, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_3_1_2.setLayout(gl_panel_3_1_2);

		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(218, 163, 181));
		JButton btnMyReservation = new JButton("MY RESERVATION");
		btnMyReservation.addActionListener(e -> { /* already here */ });
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

		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBackground(new Color(218, 163, 181));
		JButton btnPayment = new JButton("PAYMENT");
		btnPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaymentPage paymentFrame = new PaymentPage(currentUser);
				paymentFrame.setVisible(true);
				paymentFrame.pack();
				paymentFrame.setLocationRelativeTo(null);
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

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_3_1_2, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3_1,   GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3_1_1, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_signout, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(33, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(126)
					.addComponent(panel_3_1_2, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3_1,   GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3_1_1, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_signout, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(321, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}

	private void refreshReservations() {
		if (table == null) return;
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		String userId = session.getCurrentUserId();
		if (userId == null) return;
		List<Reservation> rs = facade.listReservationsByUserId(userId);
		for (Reservation r : rs) {
			String equipmentItem = r.getEquipment() == null ? "" : r.getEquipment().getEquipmentId();
			String uid = r.getUser() == null ? "" : r.getUser().getUserId();
			model.addRow(new Object[]{
				r.getReservationId(),
				equipmentItem,
				uid,
				r.getStartTime(),
				r.getEndTime(),
				r.getStatus().toString(),
				String.format("%.2f", r.getDepositAmount())
			});
		}
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e)  { if (e.isPopupTrigger()) showMenu(e); }
			public void mouseReleased(MouseEvent e) { if (e.isPopupTrigger()) showMenu(e); }
			private void showMenu(MouseEvent e) { popup.show(e.getComponent(), e.getX(), e.getY()); }
		});
	}
}