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
	
	public HomeScreen() {
		setSize(800, 600);
		setLayout(null);
		
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
				removeAll();
				add(new UploadDataPanel());
				repaint();
				revalidate();
			}
		});
		
		JButton graphicViewBtn = new JButton("View Graphic");
		graphicViewBtn.setBounds(270, 450, 250, 50);
		graphicViewBtn.setFont(new Font("segui ui", Font.PLAIN, 16));
		add(graphicViewBtn);
		
		graphicViewBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ViewGraphicPanel viewGraphicPanel = new ViewGraphicPanel();
				removeAll();
				add(viewGraphicPanel);
				repaint();
				revalidate();
			}
		});
		
		JButton rawDataViewBtn = new JButton("View Raw Data");
		rawDataViewBtn.setBounds(530, 450, 250, 50);
		rawDataViewBtn.setFont(new Font("segui ui", Font.PLAIN, 16));
		add(rawDataViewBtn);
		
		rawDataViewBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ViewRawDataPanel viewRawDataPanel = new ViewRawDataPanel();
				removeAll();
				viewRawDataPanel.setBounds((getWidth() - viewRawDataPanel.getWidth())/2, (getHeight() - viewRawDataPanel.getHeight())/2, viewRawDataPanel.getWidth(), viewRawDataPanel.getHeight());
				add(viewRawDataPanel);
				repaint();
				revalidate();
			}
		});
	}
}
