package especialista;

import java.util.ArrayList;
import java.util.List;

public class Motor {
    private BC baseConhecimento;

    // Construtor que recebe a base de conhecimento
    public Motor(BC baseConhecimento) {
        this.baseConhecimento = baseConhecimento;
    }

    // Método de inferência: percorre as regras e, se a condição for satisfeita, coleta as recomendações
    public List<String> infer(Fact fact) {
        List<String> recommendations = new ArrayList<>();
        for (Rule rule : baseConhecimento.getRules()) {
            if (rule.evaluate(fact)) {
                recommendations.add(rule.getRecommendation());
            }
        }
        return recommendations;
    }
}
