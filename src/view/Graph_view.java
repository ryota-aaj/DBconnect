package view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Graph_view extends Frame implements ActionListener,WindowListener {

	
	public Graph_view(){
		addWindowListener(this);
		setTitle("Graph");
		DefaultCategoryDataset data = new DefaultCategoryDataset();
		 data.addValue(300, "USA", "2005");
		 data.addValue(500, "USA", "2006");
		 data.addValue(120, "USA", "2007");
		 
		 data.addValue(200, "China", "2005");
		 data.addValue(400, "China", "2006");
		 data.addValue(320, "China", "2007");

		JFreeChart chart = 
				ChartFactory.createLineChart("Import Volume",
                                      "Year",
                                       "Ton",
                                       data,
                                        PlotOrientation.VERTICAL,
                                        true,
                                        false,
                                        false);
		  ChartPanel cpanel = new ChartPanel(chart);
		  add(cpanel, BorderLayout.CENTER);	  
		
		
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

}
