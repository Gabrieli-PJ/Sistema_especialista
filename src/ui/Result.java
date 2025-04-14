package ui;

import model.Car;

import javax.swing.*;
import java.util.List;

public class Result extends JFrame {

	private static final long serialVersionUID = 1L;

	public Result(List<Car> recomendados) {
        super("Carros Recomendados");

        JTextArea area = new JTextArea();
        area.setEditable(false);

        if (recomendados.isEmpty()) {
            area.setText("Nenhum carro encontrado com base no perfil informado.");
        } else {
            StringBuilder sb = new StringBuilder();
            for (Car c : recomendados) {
                sb.append("ID: ").append(c.getId()).append("\n")
                  .append("Modelo: ").append(c.getModelo()).append("\n")
                  .append("Ano: ").append(c.getAno()).append("\n")
                  .append("Preço: R$").append(c.getPreco()).append("\n")
                  .append("Combustível: ").append(c.getCombustivel()).append("\n")
                  .append("Tipo: ").append(c.getTipo()).append("\n")
                  .append("Perfil Recomendado: ").append(c.getPerfilRecomendado()).append("\n")
                  .append("Condição: ").append(c.getCondicao()).append("\n")
                  .append("--------------------------\n");
            }
            area.setText(sb.toString());
        }

        JScrollPane scroll = new JScrollPane(area);
        add(scroll);

        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
