package main.models;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class EquipmentManagementPage extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private final ReservationFacade facade = AppBackend.getInstance().getFacade();
	private final UserSession session = AppBackend.getInstance().getSession();
	private User currentUser;

	public EquipmentManagementPage(User currentUser) {
		this.currentUser = currentUser;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 839);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(218, 163, 181));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 1263, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(11)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 1262, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 553, GroupLayout.PREFERRED_SIZE))
		);
		
		JLabel lblNewLabel = new JLabel("LAB EQUIPMENT");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 44));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		JButton btnNewButton = new JButton("<- Find more lab equipment item");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage MainPage = new MainPage(currentUser);
				MainPage.setVisible(true);
				MainPage.pack();
				MainPage.setLocationRelativeTo(null);
				setVisible(false);
			}
		});
		btnNewButton.setForeground(new Color(146, 54, 72));
		btnNewButton.setBackground(new Color(239, 239, 239));
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(43)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 436, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(451, Short.MAX_VALUE))
				.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(btnNewButton)
					.addGap(31)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(58, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(IconUtil.loadIcon("/main/Pics/UB_Logos_26.png"));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(239, 239, 239));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 518, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(36)
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 1188, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(38, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(24)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnNewButton_1 = new JButton("Enable");
		btnNewButton_1.addActionListener(e -> {
			int selectedRow = table.getSelectedRow();

		    if (selectedRow == -1) {
		    	  EquipmentNotChosenError dialog = new EquipmentNotChosenError();
		    	  dialog.setLocationRelativeTo(this);
		          dialog.setVisible(true);
		          return;
		    }
			String equipmentId = String.valueOf(table.getValueAt(selectedRow, 0));
			boolean ok = facade.enableEquipment(equipmentId);
			if (!ok) {
				JOptionPane.showMessageDialog(this, "Only lab managers can manage equipment (or you're not logged in correctly).");
			}
			refreshEquipmentTable();
		});
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnNewButton_1.setBackground(new Color(218, 163, 181));
		btnNewButton_1.setForeground(new Color(146, 54, 72));
		
		JButton btnNewButton_1_1 = new JButton("Disable");
		btnNewButton_1_1.addActionListener(e -> {
			int selectedRow = table.getSelectedRow();

		    if (selectedRow == -1) {
		    	  EquipmentNotChosenError dialog = new EquipmentNotChosenError();
		    	  dialog.setLocationRelativeTo(this);
		          dialog.setVisible(true);
		          return;
		    }
			String equipmentId = String.valueOf(table.getValueAt(selectedRow, 0));
			boolean ok = facade.disableEquipment(equipmentId);
			if (!ok) {
				JOptionPane.showMessageDialog(this, "Only lab managers can manage equipment (or you're not logged in correctly).");
			}
			refreshEquipmentTable();
		});
		btnNewButton_1_1.setForeground(new Color(146, 54, 72));
		btnNewButton_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnNewButton_1_1.setBackground(new Color(218, 163, 181));
		
		JButton btnNewButton_1_2 = new JButton("Maintenance");
		btnNewButton_1_2.addActionListener(e -> {
			int selectedRow = table.getSelectedRow();

		    if (selectedRow == -1) {
		    	  EquipmentNotChosenError dialog = new EquipmentNotChosenError();
		    	  dialog.setLocationRelativeTo(this);
		          dialog.setVisible(true);
		          return;
		    }
			String equipmentId = String.valueOf(table.getValueAt(selectedRow, 0));
			boolean ok = facade.markEquipmentUnderMaintenance(equipmentId);
			if (!ok) {
				JOptionPane.showMessageDialog(this, "Only lab managers can manage equipment (or you're not logged in correctly).");
			}
			refreshEquipmentTable();
		});
		btnNewButton_1_2.setForeground(new Color(146, 54, 72));
		btnNewButton_1_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnNewButton_1_2.setBackground(new Color(218, 163, 181));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(46)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 1095, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(47, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
					.addGap(156)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
					.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addGap(157)
					.addComponent(btnNewButton_1_2, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
					.addGap(154))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(23)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(39, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setShowVerticalLines(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Equipment ID", "Description", "Location", "Status"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				true, true, false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		scrollPane.setViewportView(table);
		refreshEquipmentTable();
		
		JButton btnNewButton_2 = new JButton("Add +");
		btnNewButton_2.setBackground(new Color(218, 163, 181));
		btnNewButton_2.setForeground(new Color(146, 54, 72));
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		scrollPane.setRowHeaderView(btnNewButton_2);
		
		
		panel_3.setLayout(gl_panel_3);
		panel_2.setLayout(gl_panel_2);
		contentPane.setLayout(gl_contentPane);
	}

	private void refreshEquipmentTable() {
		if (table == null) {
			return;
		}
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		for (Equipment e : facade.listEquipment()) {
			model.addRow(new Object[] { e.getEquipmentId(), e.getDescription(), e.getLocation(), e.getStatus().toString() });
		}
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
