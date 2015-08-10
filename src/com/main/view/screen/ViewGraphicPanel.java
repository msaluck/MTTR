package com.main.view.screen;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class ViewGraphicPanel extends JPanel {

	private static final long serialVersionUID = 6604448661667286690L;

	public ViewGraphicPanel() {
		setSize(600, 300);
		setLayout(null);
		
		JLabel jLabel = new JLabel();
		jLabel.setBounds(0, 30, 600, 50);
		jLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		jLabel.setVerticalTextPosition(SwingConstants.CENTER);
		jLabel.setText("SELECT DATA");
		add(jLabel);
		
		JDateChooser fromJdc = new JDateChooser();
		fromJdc.setBounds(141, 91, 100, 50);
		add(fromJdc);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(312, 91, 100, 50);
		add(dateChooser);
		
		JLabel lblTo = new JLabel("to");
		lblTo.setBounds(251, 110, 46, 14);
		add(lblTo);
		
		JLabel lblSelectRange = new JLabel("Select Range");
		lblSelectRange.setBounds(44, 110, 46, 14);
		add(lblSelectRange);
		
		JLabel lblNewLabel = new JLabel("Select serpo");
		lblNewLabel.setBounds(44, 196, 46, 14);
		add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(141, 192, 271, 22);
		add(comboBox);
		
		JButton btnGo = new JButton("go");
		btnGo.setBounds(231, 266, 91, 23);
		add(btnGo);
	}
}
