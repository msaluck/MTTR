package com.main.view.screen;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class UploadDataPanel extends JPanel {

	private static final long serialVersionUID = -3107347302627848798L;
	private JTextField locationField;

	public UploadDataPanel() {
		setSize(600, 300);
		setLayout(null);
		
		final JFileChooser jfc = new JFileChooser();
		add(jfc);
		
		JPanel uploadPanel = new JPanel();
		uploadPanel.setBounds(10, 120, 580, 40);
		uploadPanel.setLayout(null);
		add(uploadPanel);
		
		locationField = new JTextField();
		locationField.setBounds(0, 0, 468, 30);
		uploadPanel.add(locationField);
		locationField.setColumns(10);
		
		JButton browseBtn = new JButton("Browse");
		browseBtn.setBounds(479, 4, 91, 30);
		uploadPanel.add(browseBtn);
		
		browseBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int returnVal = jfc.showOpenDialog(UploadDataPanel.this);
				
			}
		});
		
		JButton uploadBtn = new JButton("Upload");
		uploadBtn.setBounds(200, 223, 91, 30);
		add(uploadBtn);
		
		JButton backBtn = new JButton("Back");
		backBtn.setBounds(525, 270, 75, 30);
		backBtn.setFont(new Font("segou ui", Font.PLAIN, 16));
		backBtn.setVerticalAlignment(SwingConstants.CENTER);
		add(backBtn);
		
		backBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				removeAll();
				revalidate();
				add(new HomeScreen());
				repaint();
				validate();
			}
		});
	}
}
