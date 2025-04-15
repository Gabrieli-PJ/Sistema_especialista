package especialista;

import model.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BC {
    // Método para carregar os carros do arquivo Carros.txt
    public static List<Car> carregarCarros() {
        List<Car> carros = new ArrayList<>();
        String fileName = "Data/Carros.txt";  // Caminho do arquivo de carros

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                // Dividindo os dados da linha por ";"
                String[] dados = linha.split(";");

                // Criando o objeto Car a partir dos dados
                int id = Integer.parseInt(dados[0].trim());
                String modelo = dados[1].trim();
                int ano = Integer.parseInt(dados[2].trim());
                double preco = Double.parseDouble(dados[3].trim());
                String combustivel = dados[4].trim();
                String tipo = dados[5].trim();
                String perfilRecomendado = dados[6].trim();
                String condicao = dados[7].trim();

                // Adicionando o carro à lista
                Car carro = new Car(id, modelo, ano, preco, combustivel, tipo, perfilRecomendado, condicao);
                carros.add(carro);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return carros;
    }
}
