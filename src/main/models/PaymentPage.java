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

public class PaymentPage extends JFrame {

	private JPanel contentPane;
	private User currentUser;

	public PaymentPage(User currentUser) {
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
		
		
		JLabel lblNewLabel = new JLabel("PAYMENT");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 44));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		JButton btnNewButton = new JButton("<- Find more lab equipment item ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage MainPage = new MainPage(currentUser);
				MainPage.setVisible(true);
				MainPage.pack();
				MainPage.setLocationRelativeTo(null);
				setVisible(false);
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setForeground(new Color(146, 54, 72));
		btnNewButton.setBackground(new Color(239, 239, 239));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(43)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(662, Short.MAX_VALUE))
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
							.addGap(50)
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 819, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(60, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(52)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
					.addGap(40)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JLabel lblNewLabel_2 = new JLabel("Payment method: " + currentUser.getPayments());
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 24));
		
		JButton btnNewButton_1 = new JButton("Edit");
		btnNewButton_1.setForeground(new Color(146, 54, 72));
		btnNewButton_1.setBackground(new Color(218, 163, 181));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_panel_3.createSequentialGroup()
							.addGap(35)
							.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addContainerGap(724, Short.MAX_VALUE)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)))
					.addGap(27))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
					.addGap(34)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
					.addComponent(btnNewButton_1)
					.addContainerGap())
		);
		panel_3.setLayout(gl_panel_3);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(218, 163, 181));
		panel_3_1.setForeground(new Color(255, 255, 255));
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBackground(new Color(218, 163, 181));
		
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
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_3_1_2, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3_1, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3_1_1, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(33, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(126)
					.addComponent(panel_3_1_2, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3_1, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3_1_1, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(383, Short.MAX_VALUE))
		);
		
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
		btnMyReservation.addActionListener(e -> {
			return;
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