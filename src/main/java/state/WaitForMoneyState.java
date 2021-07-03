package state;

public class WaitForMoneyState extends CoffeeMachineState {

    private int money;

    @Override
    public void changeCoffeeMachineState(CoffeeMachine context) {
        context.setState(new TakeCoffeeState());
    }

    @Override
    public void getProduct(int cost, CoffeeMachine context) {
        money += cost;
        System.out.println("Thrown into machine " + cost + " summary " + money);

        if (money == 5) {
            System.out.println("Pyment accepted");
            changeCoffeeMachineState(context);
        } else if (money > 5) {
            int sum = money - 5;
            System.out.println("Payment accepted, pay the rest of money " + sum);
            changeCoffeeMachineState(context);
        } else {
            System.out.println("Not enough money");
        }
    }
}
