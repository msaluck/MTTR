package com.main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class Chart extends JPanel {

	/**
	 * Create the panel.
	 */
	public Chart() {
		setLayout(null);
		setSize(300, 200);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 11, 91, 23);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();
				categoryDataset.setValue(10, "X", "Y");
				categoryDataset.setValue(15, "X", "Y");
				categoryDataset.setValue(20, "X", "Y");
				categoryDataset.setValue(25, "X", "Y");
				JFreeChart jFreeChart = ChartFactory.createLineChart("Test", "X", "Y", categoryDataset);
				CategoryPlot oCategoryPlot = new CategoryPlot();
				oCategoryPlot.setRangeGridlinePaint(Color.BLUE);
				ChartFrame chartFrame = new ChartFrame("Test", jFreeChart);
				chartFrame.setSize(300, 200);
				chartFrame.setVisible(true);
			}
		});
		add(btnNewButton);
	}
}
