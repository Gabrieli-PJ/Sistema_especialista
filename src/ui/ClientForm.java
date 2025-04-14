package ui;

import especialista.*;
import model.Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ClientForm extends JFrame {

    private JTextField nomeField, idadeField, familiaField;
    private JComboBox<String> prioridadeBox, usoBox;

    private JFrame previousWindow;

    public ClientForm(JFrame previous) {
        this.previousWindow = previous;

        setTitle("Perfil do Cliente");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2, 5, 5));

        nomeField = new JTextField();
        idadeField = new JTextField();
        familiaField = new JTextField();

        prioridadeBox = new JComboBox<>(new String[]{"econômico", "conforto", "potência"});
        usoBox = new JComboBox<>(new String[]{"urbano", "estrada", "misto"});

        add(new JLabel("Nome:"));
        add(nomeField);
        add(new JLabel("Idade:"));
        add(idadeField);
        add(new JLabel("Tamanho da Família:"));
        add(familiaField);
        add(new JLabel("Prioridade:"));
        add(prioridadeBox);
        add(new JLabel("Uso:"));
        add(usoBox);

        JButton enviarBtn = new JButton("Enviar");
        enviarBtn.addActionListener(this::processarCliente);
        add(enviarBtn);

        JButton voltarBtn = new JButton("Voltar");
        voltarBtn.addActionListener(e -> {
            previousWindow.setVisible(true);
            this.dispose();
        });
        add(voltarBtn);

        setVisible(true);
    }

    private void processarCliente(ActionEvent e) {
        try {
            String nome = nomeField.getText();
            int idade = Integer.parseInt(idadeField.getText());
            int familia = Integer.parseInt(familiaField.getText());
            String prioridade = (String) prioridadeBox.getSelectedItem();
            String uso = (String) usoBox.getSelectedItem();

            Client cliente = new Client(nome, idade, null, prioridade, uso, null, null, familia);

            Fact fact = new Fact(prioridade, uso, familia);
            BC base = new BC();
            Motor motor = new Motor(base);

            var recomendacoes = motor.infer(fact);

            new Result(this, recomendacoes);
            this.setVisible(false);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha os campos corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
