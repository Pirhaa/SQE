package edu.siba.scholarmatch.ui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Dimension;

/** Initial application shell; feature screens will be added in later iterations. */
public class MainFrame extends JFrame {
    public MainFrame() {
        super("ScholarMatch System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(720, 480));
        setLocationRelativeTo(null);

        JPanel content = new JPanel(new BorderLayout(12, 12));
        content.add(new JLabel("ScholarMatch System", SwingConstants.CENTER), BorderLayout.CENTER);
        content.add(new JLabel("Scholarship discovery and rule-based eligibility matching",
                SwingConstants.CENTER), BorderLayout.SOUTH);
        setContentPane(content);
    }
}
