package especialista;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Car;

public class BC {

    private List<Car> cars;
    private List<Rule> rules;

    public BC() {
        cars = new ArrayList<>();
        rules = new ArrayList<>();
        carregarCarros();
        carregarRegras();
    }

    private void carregarCarros() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Data/Carros.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dadosCarro = linha.split(";");
                if (dadosCarro.length == 6) {
                    String nome = dadosCarro[0];
                    int preco = Integer.parseInt(dadosCarro[1]);
                    String prioridade = dadosCarro[2];
                    String uso = dadosCarro[3];
                    String combustivel = dadosCarro[4];
                    String porte = dadosCarro[5];
                    
                    cars.add(new Car(nome, preco, prioridade, uso, combustivel, porte));
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar os dados dos carros: " + e.getMessage());
        }
    }

    private void carregarRegras() {
        rules.add(new Rule(
            (fact) -> fact.getPrioridade().equalsIgnoreCase("econômico") &&
                      fact.getUso().equalsIgnoreCase("urbano"),
            "Fiat Mobi"
        ));

        rules.add(new Rule(
            (fact) -> fact.getPrioridade().equalsIgnoreCase("conforto") &&
                      fact.getTamanhoFamilia() > 3,
            "Jeep Compass"
        ));

    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Rule> getRules() {
        return rules;
    }
}
