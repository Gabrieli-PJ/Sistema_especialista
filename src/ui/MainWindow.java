package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MainWindow extends JFrame {

    public MainWindow() {
        setTitle("Autoatendimento - Concessionária do Benjamin");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        JLabel titulo = new JLabel("Bem-vindo à Concessionária do Benjamin! Aqui vamos te ajudar a achar o carro perfeito para você", SwingConstants.CENTER);
        titulo.setFont(new Font("Poppins", Font.BOLD, 16));
        add(titulo, BorderLayout.CENTER);
     
        JButton btnIniciar = new JButton("Iniciar atendimento");
        btnIniciar.addActionListener((ActionEvent e) -> {
            new ClientForm(this);
            this.setVisible(false);
        });

        titulo.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));
        btnIniciar.setPreferredSize(new Dimension(200, 40));
        btnIniciar.setFont(new Font("SansSerif", Font.PLAIN, 14));
        
        add(btnIniciar, BorderLayout.SOUTH);

        setVisible(true);
    }
}
