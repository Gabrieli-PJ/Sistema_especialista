package app;

import javax.swing.SwingUtilities;
import ui.MainWindow;

public class Main {
    public static void main(String[] args) {
        // Execução na thread da UI para evitar race conditions e garantir responsividade
        SwingUtilities.invokeLater(() -> {
            MainWindow window = new MainWindow();
            window.setVisible(true);
        });
    }
}
