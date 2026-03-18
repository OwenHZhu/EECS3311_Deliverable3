package main.models;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CancelReservationPopUp extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private final JLabel lblNewLabel = new JLabel("Are you sure to cancel the reservation?");
	private JButton okButton;
	private JButton cancelButton;
	private ReservationChangesPage parentPage;

	public CancelReservationPopUp(ReservationChangesPage parentPage) {
	    this.parentPage = parentPage;
		
		
		lblNewLabel.setForeground(new Color(146, 54, 72));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 24));
		setBounds(100, 100, 647, 189);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap(98, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 515, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPanel.createSequentialGroup()
					.addGap(39)
					.addComponent(lblNewLabel)
					.addContainerGap(41, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				    okButton = new JButton("YES");
			        okButton.setBackground(new Color(218, 163, 181));
			        okButton.setForeground(new Color(146, 54, 72));
			        okButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
			        okButton.setActionCommand("YES");
			        okButton.addActionListener(e -> {
			        
			        // logic starts
			        	
			        // logic ends	
			       
			        	 dispose();
			        	 parentPage.dispose();

			        	 ReservationChangesConfirmation confirm = new ReservationChangesConfirmation();
			        	 confirm.setLocationRelativeTo(null);
			        	 confirm.setVisible(true);
			        });
			    
			}
			    {
			        cancelButton = new JButton("NO");
			        cancelButton.setBackground(new Color(218, 163, 181));
			        cancelButton.setForeground(new Color(146, 54, 72));
			        cancelButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
			        cancelButton.setActionCommand("NO");
			        cancelButton.addActionListener(e -> dispose());
			}
			GroupLayout gl_buttonPane = new GroupLayout(buttonPane);
			gl_buttonPane.setHorizontalGroup(
				gl_buttonPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_buttonPane.createSequentialGroup()
						.addGap(164)
						.addComponent(okButton, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
						.addGap(51)
						.addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
						.addGap(195))
			);
			gl_buttonPane.setVerticalGroup(
				gl_buttonPane.createParallelGroup(Alignment.LEADING)
					.addGroup(Alignment.TRAILING, gl_buttonPane.createSequentialGroup()
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_buttonPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(okButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addComponent(cancelButton, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
						.addContainerGap())
			);
			buttonPane.setLayout(gl_buttonPane);
		}
		}
	}


