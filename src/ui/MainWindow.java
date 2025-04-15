package ui;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow() {
        setTitle("AutoAtendimento - Concessionária Benjamin");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JLabel title = new JLabel("Bem-vindo à Concessionária Benjamin", SwingConstants.CENTER);
        JButton iniciarButton = new JButton("Iniciar Atendimento");

        iniciarButton.addActionListener(e -> {
            dispose();
            new ClientForm();
        });

        add(title, BorderLayout.CENTER);
        add(iniciarButton, BorderLayout.SOUTH);

        setVisible(true);
    }
}
