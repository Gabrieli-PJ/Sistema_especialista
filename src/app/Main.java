package app;

import javax.swing.SwingUtilities;
import ui.MainWindow;
import util.Theme;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Theme.apply();
            new MainWindow();
        });
    }
}
