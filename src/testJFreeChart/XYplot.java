package testJFreeChart;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javafx.scene.chart.Chart;

public class XYplot extends JPanel{
	public XYplot(){
		super();
		// create a dataset
		XYSeries series1 = new XYSeries("Plot1");
		series1.add(1.0,1.0);
		series1.add(2.0,4.0);
		series1.add(3.0, -5.0);
		series1.add(4.0, 5.0);
		series1.add(6.0, 7.0);
		series1.add(7.0, 10.0);
		
		XYSeries series2 = new XYSeries("Plot2");
		series2.add(1.0,5.0);
		series2.add(2.0,3.0);
		series2.add(3.0,-3.0);
		series2.add(4.0,5.0);
		series2.add(6.0,2.0);
		series2.add(7.0,4.0);
		
		XYSeries series3 = new XYSeries("Plot3");
		series3.add(1.0,2.0);
		series3.add(2.0,7.0);
		series3.add(3.0,-9.0);
		series3.add(4.0,10.0);
		series3.add(6.0,11.0);
		series3.add(7.0,3.0);
		
		XYSeriesCollection dataset = new XYSeriesCollection();
		dataset.addSeries(series1);
		dataset.addSeries(series2);
		dataset.addSeries(series3);
		
		
		
		JFreeChart chart = ChartFactory.createXYAreaChart("Line chart demo", "X", "Y", dataset);
		ChartPanel chartPanel = new ChartPanel(chart);	
		 add(chartPanel);
		
	}
public static void main(String[] args){
	JFrame frame = new JFrame("Chart one");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane();
	frame.pack();
	frame.setVisible(true);
}
}
