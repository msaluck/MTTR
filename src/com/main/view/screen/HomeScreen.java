package com.main.view.screen;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class HomeScreen extends JPanel{

	private static final long serialVersionUID = -3307786826579055917L;
	public JPanel workspacePanel;
	public UploadDataPanel uploadDataPanel;
	public ViewGraphicPanel viewGraphicPanel;
	public ViewRawDataPanel viewRawDataPanel;
	
	public HomeScreen() {
		setSize(800, 600);
		setLayout(null);
		uploadDataPanel = new UploadDataPanel();
		viewGraphicPanel = new ViewGraphicPanel();
		viewRawDataPanel = new ViewRawDataPanel();
		
		JLabel titleLbl = new JLabel("MTTR MONITORING SERPO");
		titleLbl.setBounds(10, 10, 250, 50);
		titleLbl.setFont(new Font("segui ui", Font.PLAIN, 16));
		titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		add(titleLbl);
		
		JButton uploadViewBtn = new JButton("Upload Data");
		uploadViewBtn.setBounds(10, 450, 250, 50);
		uploadViewBtn.setFont(new Font("segui ui", Font.PLAIN, 16));
		add(uploadViewBtn);
		
		uploadViewBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				workspacePanel.add(uploadDataPanel);
				workspacePanel.repaint();
			}
		});
		
		JButton graphicViewBtn = new JButton("View Graphic");
		graphicViewBtn.setBounds(270, 450, 250, 50);
		graphicViewBtn.setFont(new Font("segui ui", Font.PLAIN, 16));
		add(graphicViewBtn);
		
		graphicViewBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				workspacePanel.add(viewGraphicPanel);
				workspacePanel.repaint();
				
			}
		});
		
		JButton rawDataViewBtn = new JButton("View Raw Data");
		rawDataViewBtn.setBounds(530, 450, 250, 50);
		rawDataViewBtn.setFont(new Font("segui ui", Font.PLAIN, 16));
		add(rawDataViewBtn);
		
		workspacePanel = new JPanel();
		workspacePanel.setBounds(0, 70, 800, 300);
		add(workspacePanel);
		
		JLabel versionLbl = new JLabel("ver 0.0.1");
		versionLbl.setBounds(744, 575, 46, 14);
		add(versionLbl);
		
		rawDataViewBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				workspacePanel.add(viewRawDataPanel);
				workspacePanel.repaint();
			}
		});
	}
	
	protected void back() {
		JPanel home = new JPanel();
		home.setSize(800, 300);
		home.setLayout(null);
		workspacePanel.add(home);
		repaint();
	}
}
