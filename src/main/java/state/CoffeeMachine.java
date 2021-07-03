package state;

public class CoffeeMachine {

    private CoffeeMachineState state;
    private int coffeeCost;

    public void setState(CoffeeMachineState state) {
        this.state = state;
    }

    public void buyCoffee(int cost) {
        coffeeCost = cost;
        state.getProduct(cost, this);
    }

    public void takeCoffee() {
        state.getProduct(coffeeCost, this);
    }
}
