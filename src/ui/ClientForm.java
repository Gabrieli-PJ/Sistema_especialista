package ui;

import especialista.Fact;
import especialista.Motor;
import especialista.BC;
import model.Car;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ClientForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField orcamentoField, passageirosField, bagagemField, anoMinField;
    private JComboBox<String> faixaEtariaBox, estagioVidaBox, usoBox, prioridadeBox, condicaoBox;

    public ClientForm() {
        super("Perfil do Cliente");

        setLayout(new GridLayout(10, 2, 5, 5));

        faixaEtariaBox = new JComboBox<>(new String[]{"Jovem", "Adulto", "Idoso"});
        estagioVidaBox = new JComboBox<>(new String[]{"Solteiro", "Casado", "Com filhos"});
        usoBox = new JComboBox<>(new String[]{"Urbano", "Rodoviário", "Off-road", "Esportivo"});
        prioridadeBox = new JComboBox<>(new String[]{"Econômico", "Desempenho", "Tecnologia", "Conforto"});
        condicaoBox = new JComboBox<>(new String[]{"Novo", "Usado"});

        orcamentoField = new JTextField();
        passageirosField = new JTextField();
        bagagemField = new JTextField();
        anoMinField = new JTextField();

        add(new JLabel("Faixa Etária:"));
        add(faixaEtariaBox);
        add(new JLabel("Estágio de Vida:"));
        add(estagioVidaBox);
        add(new JLabel("Orçamento Disponível:"));
        add(orcamentoField);
        add(new JLabel("Tipo de Uso:"));
        add(usoBox);
        add(new JLabel("Passageiros:"));
        add(passageirosField);
        add(new JLabel("Bagagem (1-5):"));
        add(bagagemField);
        add(new JLabel("Prioridade:"));
        add(prioridadeBox);
        add(new JLabel("Condição:"));
        add(condicaoBox);
        add(new JLabel("Ano Mínimo:"));
        add(anoMinField);

        JButton enviar = new JButton("Obter Recomendação");
        enviar.addActionListener(e -> processar());

        add(new JLabel());
        add(enviar);

        setSize(450, 450);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void processar() {
        try {
            String faixaEtaria = faixaEtariaBox.getSelectedItem().toString();
            String estagioVida = estagioVidaBox.getSelectedItem().toString();
            double orcamento = Double.parseDouble(orcamentoField.getText());
            String uso = usoBox.getSelectedItem().toString();
            int passageiros = Integer.parseInt(passageirosField.getText());
            int bagagem = Integer.parseInt(bagagemField.getText());
            String prioridade = prioridadeBox.getSelectedItem().toString();
            String condicao = condicaoBox.getSelectedItem().toString();
            int anoMinimo = Integer.parseInt(anoMinField.getText());

            Fact fato = new Fact(faixaEtaria, estagioVida, orcamento, uso,
                                 passageiros, bagagem, prioridade, condicao, anoMinimo);
            Motor motor = new Motor(new BC());
            List<Car> recomendados = motor.recomendar(fato);

            dispose();
            new Result(recomendados);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos corretamente.");
        }
    }
}
