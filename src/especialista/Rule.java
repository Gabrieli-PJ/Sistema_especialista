package especialista;

import model.Car;
import java.util.function.Predicate;

public class Rule {
    private Predicate<Car> condition;

    public Rule(Predicate<Car> condition) {
        this.condition = condition;
    }

    public boolean evaluate(Car car) {
        return condition.test(car);
    }
}
