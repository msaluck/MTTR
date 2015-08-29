package com.main.view.screen;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu extends JFrame {
	
	public JPanel jPanel;
	
	public Menu() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(620, 350);
		setLocationRelativeTo(null);
		jPanel = new JPanel();
		jPanel.setBounds(10, 10, 600, 300);
		jPanel.setLayout(null);
		setContentPane(jPanel);
	}

}
