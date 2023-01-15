package kata5p2.view;

import kata5p2.model.Histogram;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

import javax.swing.*;
import java.awt.*;

public class HistogramDisplay extends ApplicationFrame {

    private final Histogram<String> histogram;

    public HistogramDisplay(String title, Histogram<String> histogram) {
        super(title);
        this.histogram = histogram;
        setContentPane(createPanel());
        pack();
    }

    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataSet()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataSet) {
        return ChartFactory.createBarChart(getTitle(), "Dominios emails",
                "Nº emails", dataSet, PlotOrientation.VERTICAL,false, false,
                rootPaneCheckingEnabled);
    }

    private DefaultCategoryDataset createDataSet() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        histogram.keySet().forEach(key -> dataSet.addValue(histogram.get(key), "", key));
        return dataSet;
    }

    public void execute() {
        setVisible(true);
    }
}
