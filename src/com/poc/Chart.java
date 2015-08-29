package com.main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;

import com.mttr.dao.RawDataDAO;
import com.mttr.model.RawData;

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
				RawDataDAO rawDataDAO = new RawDataDAO();
				List<RawData> rawDatas = rawDataDAO.retrieve("select * from mttr where serpo = 'Basecamp bekasi' order by recovery_date asc");
				
				/*for (RawData rawData : rawDatas) {
					categoryDataset.setValue((double) rawData.getRecoveryTime(), "recovery time", rawData.getPeriodeRecoveryDate());
					System.out.println(rawData.getRecoveryTime()+""+rawData.getPeriodeRecoveryDate());
				}*/
				System.out.println(rawDatas.size());
				
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
