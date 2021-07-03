package factorymethodpizza;

public class AmerykanskaPizzeria extends Pizzeria {
    @Override
    public Pizza createPizza(String type) {
        if (type == "serowa") {
            return new AmerykanskaPizzaSerowa();
        }

        return null;
    }
}
