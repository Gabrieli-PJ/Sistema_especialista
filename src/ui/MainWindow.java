package ui;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainWindow() {
        super("Concessionária Benjamin - Sistema Especialista");

        JButton iniciarButton = new JButton("Iniciar Autoatendimento");

        iniciarButton.addActionListener(e -> {
            dispose();
            new ClientForm();
        });

        setLayout(new FlowLayout());
        add(iniciarButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 120);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
