package com.main.view.screen;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UploadDataPanel extends JPanel {

	private static final long serialVersionUID = -3107347302627848798L;
	private JTextField locationField;
	private Font segouUI = new Font("segou ui", Font.PLAIN, 16);

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
		locationField.setBounds(0, 5, 480, 30);
		uploadPanel.add(locationField);
		locationField.setColumns(10);
		
		JButton browseBtn = new JButton("Browse");
		browseBtn.setBounds(490, 5, 90, 30);
		browseBtn.setFont(segouUI);
		uploadPanel.add(browseBtn);
		
		browseBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int returnVal = jfc.showOpenDialog(UploadDataPanel.this);
				/*locationField.setText(jfc.getSelectedFile().getAbsolutePath());
				System.out.println(jfc.getSelectedFile().getAbsolutePath());
				try {
					System.out.println(jfc.getSelectedFile().getCanonicalPath());
				} catch (IOException e) {
					e.printStackTrace();
				}*/
			}
		});
		
		JButton uploadBtn = new JButton("Upload");
		uploadBtn.setBounds(490, 259, 100, 30);
		uploadBtn.setFont(segouUI);
		add(uploadBtn);
		
		JLabel titlelbl = new JLabel("UPLOAD DATA");
		titlelbl.setBounds(10, 10, 150, 30);
		titlelbl.setFont(segouUI);
		add(titlelbl);
	}
}
