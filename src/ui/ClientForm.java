package ui;

import model.Client;
import especialista.Fact;
import especialista.BC;
import especialista.Motor;
import model.Car;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ClientForm extends JFrame {
    private static final long serialVersionUID = 1L;
	private JTextField orcamentoField;
    private JTextField anoMinField;
    private JComboBox<String> prioridadeBox, usoBox, tipoBox, combustivelBox, condicaoBox;

    public ClientForm() {
        setTitle("Cadastro do Cliente");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(0, 2));

        // Campos do formulário
        add(new JLabel("Orçamento (R$):"));
        orcamentoField = new JTextField();
        add(orcamentoField);

        add(new JLabel("Ano mínimo do carro:"));
        anoMinField = new JTextField();
        add(anoMinField);

        add(new JLabel("Prioridade:"));
        prioridadeBox = new JComboBox<>(new String[]{"Econômico", "Familiar", "Desportivo", "Versátil"});
        add(prioridadeBox);

        add(new JLabel("Tipo de uso:"));
        usoBox = new JComboBox<>(new String[]{"Urbano", "Rodoviário", "Off-road"});
        add(usoBox);

        add(new JLabel("Combustível:"));
        combustivelBox = new JComboBox<>(new String[]{"Flex", "Gasolina", "Diesel", "Elétrico"});
        add(combustivelBox);

        add(new JLabel("Condição do carro:"));
        condicaoBox = new JComboBox<>(new String[]{"Novo", "Usado"});
        add(condicaoBox);

        JButton enviar = new JButton("Buscar Carros");
        enviar.addActionListener(e -> processar());
        add(enviar);

        setVisible(true);
    }

    private void processar() {
        try {
            double orcamento = Double.parseDouble(orcamentoField.getText());
            int anoMin = Integer.parseInt(anoMinField.getText());

            // Atualização na criação do cliente
            Client client = new Client(
                (String) prioridadeBox.getSelectedItem(),
                (String) usoBox.getSelectedItem(),
                (String) combustivelBox.getSelectedItem(),
                "",
                orcamento,
                anoMin,
                (String) condicaoBox.getSelectedItem()
            );

            Fact fact = new Fact(client);
            List<Car> carros = new Motor().recomendar(fact, BC.carregarCarros());

            dispose();
            new Result(carros);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Digite valores válidos para orçamento e ano.");
        }
    }
}
