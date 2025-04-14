package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;

public class Result extends JFrame {

    public Result(JFrame previous, List<String> recomendacoes) {
        setTitle("Resultado da Recomendação");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        StringBuilder texto = new StringBuilder();

        if (recomendacoes.isEmpty()) {
            texto.append("Nenhum carro recomendado com base no perfil fornecido.");
        } else {
            texto.append("Carros recomendados:\n");
            for (String r : recomendacoes) {
                texto.append("• ").append(r).append("\n");
            }
        }

        JTextArea resultadoArea = new JTextArea(texto.toString());
        resultadoArea.setEditable(false);
        resultadoArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        add(new JScrollPane(resultadoArea), BorderLayout.CENTER);

        JButton btnFechar = new JButton("Fechar");
        btnFechar.addActionListener((ActionEvent e) -> {
            previous.dispose();
            this.dispose();
            System.exit(0);
        });

        add(btnFechar, BorderLayout.SOUTH);

        setVisible(true);
    }
}
