package especialista;

import model.Car;
import model.Client;

import java.util.ArrayList;
import java.util.List;

public class Motor {
    public List<Car> recomendar(Fact fato, List<Car> carrosDisponiveis) {
        Client client = fato.getClient();
        List<Car> recomendados = new ArrayList<>();

        for (Car car : carrosDisponiveis) {
            if (car.getPreco() <= client.getOrcamento()
                && car.getAno() >= client.getAnoMinimo()
                && car.getCondicao().equalsIgnoreCase(client.getCondicao())
                && car.getCombustivel().equalsIgnoreCase(client.getCombustivel())
                && car.getPerfilRecomendado().equalsIgnoreCase(client.getPrioridade())) {
                
                recomendados.add(car);
            }
        }

        return recomendados;
    }
}
