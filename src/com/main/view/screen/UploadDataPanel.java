package com.main.view.screen;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class UploadDataPanel extends JPanel {

	private static final long serialVersionUID = -3107347302627848798L;
	private JTextField locationField;
	private Font segouUI = new Font("segou ui", Font.PLAIN, 16);

	public UploadDataPanel() {
		setSize(800, 300);
		setLayout(null);
		
		final JFileChooser jfc = new JFileChooser();
		add(jfc);
		
		JPanel uploadPanel = new JPanel();
		uploadPanel.setBounds(100, 120, 600, 40);
		uploadPanel.setLayout(null);
		add(uploadPanel);
		
		locationField = new JTextField();
		locationField.setBounds(0, 5, 500, 30);
		uploadPanel.add(locationField);
		locationField.setColumns(10);
		
		JButton browseBtn = new JButton("Browse");
		browseBtn.setBounds(510, 4, 90, 30);
		browseBtn.setFont(segouUI);
		uploadPanel.add(browseBtn);
		
		browseBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int returnVal = jfc.showOpenDialog(UploadDataPanel.this);
				
			}
		});
		
		JButton uploadBtn = new JButton("Upload");
		uploadBtn.setBounds(350, 223, 100, 30);
		uploadBtn.setFont(segouUI);
		add(uploadBtn);
		
		JButton backBtn = new JButton("Back");
		backBtn.setBounds(715, 259, 75, 30);
		backBtn.setFont(segouUI);
		backBtn.setVerticalAlignment(SwingConstants.CENTER);
		add(backBtn);
		
		JLabel titlelbl = new JLabel("UPLOAD DATA");
		titlelbl.setBounds(10, 10, 150, 30);
		titlelbl.setFont(segouUI);
		add(titlelbl);
		
		backBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
	}
}
