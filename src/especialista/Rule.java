package especialista;

import model.Car;
import model.Client;

import java.util.function.Predicate;

public class Rule {
    private String nome;
    private Predicate<Car> condicao;

    public Rule(String nome, Predicate<Car> condicao) {
        this.nome = nome;
        this.condicao = condicao;
    }

    public boolean aplicar(Car carro, Client client) {
        return condicao.test(carro);
    }

    public String getNome() {
        return nome;
    }
}
