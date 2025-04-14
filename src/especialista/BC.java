package especialista;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Car;

public class BC {
    private List<Car> cars = new ArrayList<>();
    private List<Rule> rules = new ArrayList<>();

    public BC() {
        carregarDados();
    }

    private void carregarDados() {
        String path = "data/Carros.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 8) {
                    int id = Integer.parseInt(partes[0].trim());
                    String modelo = partes[1].trim();
                    int ano = Integer.parseInt(partes[2].trim());
                    double preco = Double.parseDouble(partes[3].trim());
                    String combustivel = partes[4].trim();
                    String tipo = partes[5].trim();
                    String perfilRecomendado = partes[6].trim();
                    String condicao = partes[7].trim();

                    cars.add(new Car(id, modelo, ano, preco, combustivel, tipo, perfilRecomendado, condicao));
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao carregar os dados dos carros: " + e.getMessage());
        }
    }
    public List<Car> getCars() {
        return cars;
    }

    public List<Rule> getRules() {
        return rules;
    }
}
