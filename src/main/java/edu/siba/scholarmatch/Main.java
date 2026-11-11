package edu.siba.scholarmatch;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.JOptionPane;
import edu.siba.scholarmatch.ui.MainFrame;

public final class Main {
    private Main() { }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ignored) {
                // Use the default Swing look and feel when the system one is unavailable.
            }
            try {
                new MainFrame().setVisible(true);
            } catch (RuntimeException ex) {
                JOptionPane.showMessageDialog(null, "Unable to start ScholarMatch: " + ex.getMessage(),
                        "Startup error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
