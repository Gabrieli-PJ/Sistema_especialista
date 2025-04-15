package ui;

import model.Car;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Result extends JFrame {
    private static final long serialVersionUID = 1L;

	public Result(List<Car> recomendados) {
        setTitle("Carros Recomendados");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JTextArea area = new JTextArea();
        area.setEditable(false);

        if (recomendados.isEmpty()) {
            area.setText("Nenhum carro encontrado com os critérios informados.");
        } else {
            StringBuilder sb = new StringBuilder();
            for (Car car : recomendados) {
                sb.append("🔹 ").append(car.getModelo())
                  .append(" (").append(car.getAno()).append(")")
                  .append(" - R$").append(car.getPreco())
                  .append(" | ").append(car.getCombustivel())
                  .append(" | ").append(car.getTipo())
                  .append(" | Perfil: ").append(car.getPerfilRecomendado())
                  .append(" | Condição: ").append(car.getCondicao())
                  .append("\n\n");
            }
            area.setText(sb.toString());
        }

        add(new JScrollPane(area), BorderLayout.CENTER);
        setVisible(true);
    }
}
