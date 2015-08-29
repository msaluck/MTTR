package com.main.view.screen;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

public class ViewRawDataPanel extends JPanel {

	private static final long serialVersionUID = -8925334828788223551L;
	private Font segouUI = new Font("segou ui", Font.PLAIN, 16);

	public ViewRawDataPanel() {
		setSize(600, 300);
		setLayout(null);
		
		JLabel titlelbl = new JLabel("VIEW RAW DATA");
		titlelbl.setBounds(10, 10, 150, 30);
		titlelbl.setFont(segouUI);
		add(titlelbl);
		
		JLabel titleScreen = new JLabel("SELECT DATA");
		titleScreen.setBounds(225, 40, 150, 50);
		titleScreen.setHorizontalAlignment(SwingConstants.CENTER);
		titleScreen.setVerticalAlignment(SwingConstants.CENTER);
		titleScreen.setFont(segouUI);
		add(titleScreen);
		
		JDateChooser startDateChooser = new JDateChooser();
		startDateChooser.setBounds(155, 100, 100, 35);
		add(startDateChooser);
		
		JDateChooser endDateChooser = new JDateChooser();
		endDateChooser.setBounds(345, 100, 100, 35);
		add(endDateChooser);
		
		JLabel toLbl = new JLabel("to");
		toLbl.setFont(segouUI);
		toLbl.setBounds(275, 100, 50, 35);
		toLbl.setVerticalAlignment(SwingConstants.CENTER);
		toLbl.setHorizontalAlignment(SwingConstants.CENTER);
		add(toLbl);
		
		JLabel selectRangeLbl = new JLabel("Select Range");
		selectRangeLbl.setFont(new Font("segou ui", Font.PLAIN, 16));
		selectRangeLbl.setBounds(10, 100, 100, 35);
		selectRangeLbl.setVerticalAlignment(SwingConstants.CENTER);
		add(selectRangeLbl);
		
		JButton goBtn = new JButton("go");
		goBtn.setBounds(350, 200, 100, 30);
		goBtn.setFont(segouUI);
		goBtn.setVerticalAlignment(SwingConstants.CENTER);
		add(goBtn);
		
		JButton backBtn = new JButton("Back");
		backBtn.setBounds(715, 259, 75, 30);
		backBtn.setFont(segouUI);
		backBtn.setVerticalAlignment(SwingConstants.CENTER);
		add(backBtn);
	}
}
