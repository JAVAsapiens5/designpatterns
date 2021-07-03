package state;

public abstract class CoffeeMachineState {

    public abstract void changeCoffeeMachineState(CoffeeMachine coffeeMachine);

    public abstract void getProduct(int cost, CoffeeMachine coffeeMachine);
}
