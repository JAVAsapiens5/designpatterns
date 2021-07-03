package factorymethodpizza;

public abstract class Pizzeria {

    public Pizza zamowPizza(String type) {
        Pizza pizza = createPizza(type);

        // TODO

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
