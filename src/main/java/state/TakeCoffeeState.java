package state;

public class TakeCoffeeState extends CoffeeMachineState {

    @Override
    public void changeCoffeeMachineState(CoffeeMachine context) {
        context.setState(new WaitForMoneyState());
    }

    @Override
    public void getProduct(int cost, CoffeeMachine context) {
        System.out.println("Money delivered, amount " + cost);
        changeCoffeeMachineState(context);
    }
}
