package especialista;

import java.util.function.Predicate;

public class Rule {
    private Predicate<Fact> condition;
    private String recommendation;

    public Rule(Predicate<Fact> condition, String recommendation) {
        this.condition = condition;
        this.recommendation = recommendation;
    }

    public boolean evaluate(Fact fact) {
        return condition.test(fact);
    }

    public String getRecommendation() {
        return recommendation;
    }
}
