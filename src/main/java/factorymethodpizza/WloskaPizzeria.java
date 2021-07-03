package factorymethodpizza;

public class WloskaPizzeria extends Pizzeria {

    public Pizza createPizza(String type) {

        if (type == "serowa") {
            return new WloskaPizzaSerowa();
        }

        return null;
    }
}
