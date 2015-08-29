package com.main.view.screen;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class HomeScreen extends JPanel{

	private static final long serialVersionUID = -3307786826579055917L;
	public UploadDataPanel uploadDataPanel = new UploadDataPanel();
	public ViewGraphicPanel viewGraphicPanel = new ViewGraphicPanel();
	public ViewRawDataPanel viewRawDataPanel = new ViewRawDataPanel();
	public Menu menu;
	
	public HomeScreen() {
		setSize(800, 600);
		setLayout(null);
		menu = new Menu();
		menu.setVisible(false);
		
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
				for (Component c : menu.jPanel.getComponents()) {
					if (c instanceof ViewRawDataPanel || c instanceof ViewGraphicPanel) {
						menu.jPanel.remove(c);
						menu.jPanel.add(uploadDataPanel);
						menu.repaint();
						menu.revalidate();
						menu.setTitle("Upload Data");
						menu.setVisible(true);
					}
				}
				menu.setTitle("Upload Data");
				menu.jPanel.add(uploadDataPanel);
				menu.jPanel.repaint();
				menu.setVisible(true);
			}
		});
		
		JButton graphicViewBtn = new JButton("View Graphic");
		graphicViewBtn.setBounds(270, 450, 250, 50);
		graphicViewBtn.setFont(new Font("segui ui", Font.PLAIN, 16));
		add(graphicViewBtn);
		
		graphicViewBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (Component c : menu.jPanel.getComponents()) {
					if (c instanceof UploadDataPanel || c instanceof ViewRawDataPanel) {
						menu.jPanel.remove(c);
						menu.jPanel.add(viewGraphicPanel);
						menu.repaint();
						menu.revalidate();
						menu.setTitle("View Graphic");
						menu.setVisible(true);
					}
				}
				menu.setTitle("View Graphic");
				menu.jPanel.add(viewGraphicPanel);
				menu.jPanel.repaint();
				menu.setVisible(true);
			}
		});
		
		JButton rawDataViewBtn = new JButton("View Raw Data");
		rawDataViewBtn.setBounds(530, 450, 250, 50);
		rawDataViewBtn.setFont(new Font("segui ui", Font.PLAIN, 16));
		add(rawDataViewBtn);
		
		JLabel versionLbl = new JLabel("ver 0.0.1");
		versionLbl.setBounds(744, 575, 46, 14);
		add(versionLbl);
		
		rawDataViewBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (Component c : menu.jPanel.getComponents()) {
					if (c instanceof UploadDataPanel || c instanceof ViewGraphicPanel) {
						menu.jPanel.remove(c);
						menu.jPanel.add(viewRawDataPanel);
						menu.repaint();
						menu.revalidate();
						menu.setTitle("View Raw Data");
						menu.setVisible(true);
					}
				}
				menu.setTitle("View Raw Data");
				menu.jPanel.add(viewRawDataPanel);
				menu.jPanel.repaint();
				menu.setVisible(true);
			}
		});
	}
}
