package com.main.view.screen;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class HomeScreen extends JPanel{

	private static final long serialVersionUID = -3307786826579055917L;
	
	public HomeScreen() {
		setSize(800, 600);
		setLayout(null);
		
		JLabel titleLbl = new JLabel("MTTR MONITORING SERPO");
		titleLbl.setBounds(10, 10, 150, 30);
		add(titleLbl);
		
		JButton uploadViewBtn = new JButton("Upload Data");
		uploadViewBtn.setBounds(10, 450, 250, 50);
		add(uploadViewBtn);
		
		JButton graphicViewBtn = new JButton("View Graphic");
		graphicViewBtn.setBounds(270, 450, 250, 50);
		add(graphicViewBtn);
		
		JButton rawDataViewBtn = new JButton("View Raw Data");
		rawDataViewBtn.setBounds(530, 450, 250, 50);
		add(rawDataViewBtn);
	}
}
