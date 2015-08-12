package com.main.view.screen;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;

public class ViewGraphicPanel extends JPanel {

	private static final long serialVersionUID = 6604448661667286690L;

	public ViewGraphicPanel() {
		setSize(600, 300);
		setLayout(null);
		
		JLabel titleScreen = new JLabel("SELECT DATA");
		titleScreen.setBounds(0, 30, 600, 50);
		titleScreen.setHorizontalAlignment(SwingConstants.CENTER);
		titleScreen.setVerticalAlignment(SwingConstants.CENTER);
		titleScreen.setFont(new Font("segou ui", Font.PLAIN, 16));
		add(titleScreen);
		
		JDateChooser startDateChooser = new JDateChooser();
		startDateChooser.setBounds(150, 100, 100, 35);
		add(startDateChooser);
		
		JDateChooser endDateChooser = new JDateChooser();
		endDateChooser.setBounds(350, 100, 100, 35);
		add(endDateChooser);
		
		JLabel toLbl = new JLabel("to");
		toLbl.setFont(new Font("segou ui", Font.PLAIN, 16));
		toLbl.setBounds(275, 100, 50, 35);
		toLbl.setVerticalAlignment(SwingConstants.CENTER);
		toLbl.setHorizontalAlignment(SwingConstants.CENTER);
		add(toLbl);
		
		JLabel selectRangeLbl = new JLabel("Select Range");
		selectRangeLbl.setFont(new Font("segou ui", Font.PLAIN, 16));
		selectRangeLbl.setBounds(30, 100, 100, 35);
		selectRangeLbl.setVerticalAlignment(SwingConstants.CENTER);
		add(selectRangeLbl);
		
		JButton goBtn = new JButton("go");
		goBtn.setBounds(250, 250, 100, 30);
		goBtn.setFont(new Font("segou ui", Font.PLAIN, 16));
		goBtn.setVerticalAlignment(SwingConstants.CENTER);
		add(goBtn);
		
		JLabel label = new JLabel("Select Range");
		label.setVerticalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Dialog", Font.PLAIN, 16));
		label.setBounds(30, 190, 100, 35);
		add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(150, 190, 300, 30);
		add(comboBox);
		
		JButton backBtn = new JButton("Back");
		backBtn.setBounds(525, 270, 75, 30);
		backBtn.setFont(new Font("segou ui", Font.PLAIN, 16));
		backBtn.setVerticalAlignment(SwingConstants.CENTER);
		add(backBtn);
	}
}
