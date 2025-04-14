package especialista;

import model.Car;
import java.util.ArrayList;
import java.util.List;

public class Motor {
    private BC baseConhecimento;

    public Motor(BC baseConhecimento) {
        this.baseConhecimento = baseConhecimento;
    }

    public List<Car> recomendar(Fact fato) {
        List<Car> recomendados = new ArrayList<>();
        
        for (Car car : baseConhecimento.getCars()) {
            String condCar = car.getCondicao().trim().toLowerCase();
            String condDesejada = fato.getCondicaoDesejada().trim().toLowerCase();

            if (!condCar.equals(condDesejada)) {
                continue; 
            }
            if (car.getAno() < fato.getAnoMinimo()) {
                continue; 
            }
            if (car.getPreco() > fato.getOrcamento()) {
                continue; 
            }

            boolean match = false;

            if (fato.getPrioridade().trim().equalsIgnoreCase("econômico")) {
                if (car.getPerfilRecomendado().trim().equalsIgnoreCase("econômico")) {
                    match = true;
                }
            }

            if ((fato.getPassageiros() >= 5 || fato.getBagagem() >= 4 || fato.getEstagioVida().trim().equalsIgnoreCase("com filhos"))) {
                if (car.getPerfilRecomendado().trim().equalsIgnoreCase("familiar")) {
                    match = true;
                }
            }

            if (fato.getPrioridade().trim().equalsIgnoreCase("desempenho")) {
                if (car.getPerfilRecomendado().trim().equalsIgnoreCase("desportivo")) {
                    match = true;
                }
            }

            if (fato.getUso().trim().equalsIgnoreCase("urbano")) {
                if (car.getPerfilRecomendado().trim().equalsIgnoreCase("versátil")) {
                    match = true;
                }
            }

            if (match) {
                recomendados.add(car);
            }
        }
        
        if (recomendados.isEmpty()) {
            for (Car car : baseConhecimento.getCars()) {
                if (car.getCondicao().trim().equalsIgnoreCase(fato.getCondicaoDesejada().trim()) &&
                    car.getAno() >= fato.getAnoMinimo() &&
                    car.getPreco() <= fato.getOrcamento()) {
                        recomendados.add(car);
                }
            }
        }

        return recomendados;
    }
}
