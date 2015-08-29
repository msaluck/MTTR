package com.main.view.screen;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;
import com.util.Datapool;

public class ViewGraphicPanel extends JPanel {

	private static final long serialVersionUID = 6604448661667286690L;
	private Font segouUI = new Font("segou ui", Font.PLAIN, 16);

	public ViewGraphicPanel() {
		setSize(600, 300);
		setLayout(null);

		JLabel titlelbl = new JLabel("VIEW GRAPHIC");
		titlelbl.setBounds(10, 11, 150, 30);
		titlelbl.setFont(segouUI);
		add(titlelbl);

		JLabel titleScreen = new JLabel("SELECT DATA");
		titleScreen.setBounds(225, 40, 150, 50);
		titleScreen.setHorizontalAlignment(SwingConstants.CENTER);
		titleScreen.setVerticalAlignment(SwingConstants.CENTER);
		titleScreen.setFont(segouUI);
		add(titleScreen);

		final JDateChooser startDateChooser = new JDateChooser();
		startDateChooser.setBounds(155, 100, 100, 35);
		add(startDateChooser);

		final JDateChooser endDateChooser = new JDateChooser();
		endDateChooser.setBounds(345, 100, 100, 35);
		add(endDateChooser);

		JLabel toLbl = new JLabel("to");
		toLbl.setFont(new Font("segou ui", Font.PLAIN, 16));
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
		goBtn.setBounds(490, 259, 100, 30);
		goBtn.setFont(new Font("segou ui", Font.PLAIN, 16));
		goBtn.setVerticalAlignment(SwingConstants.CENTER);
		add(goBtn);



		JLabel label = new JLabel("Select Range");
		label.setVerticalAlignment(SwingConstants.CENTER);
		label.setFont(segouUI);
		label.setBounds(10, 185, 100, 35);
		add(label);

		Datapool.init();
		
		final JComboBox serpoCmb = new JComboBox();
		serpoCmb.setBounds(155, 190, 300, 30);
		serpoCmb.setModel(new DefaultComboBoxModel(Datapool.initSerpoName().toArray()));
		add(serpoCmb);


		goBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
	}
}
