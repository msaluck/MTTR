package com.main.view;

import java.awt.EventQueue;

import javax.swing.JFrame;

import com.main.view.screen.HomeScreen;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = -7976781332998630339L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
					frame.setTitle("MTTR Monitoring Serpo");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 600);
		setLocationRelativeTo(null);
		setContentPane(new HomeScreen());
	}

}
