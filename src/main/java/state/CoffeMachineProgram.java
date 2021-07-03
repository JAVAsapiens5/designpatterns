package state;

public class CoffeMachineProgram {

    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.setState(new WaitForMoneyState());

        coffeeMachine.buyCoffee(5);
        coffeeMachine.takeCoffee();

        coffeeMachine.buyCoffee(6);
        coffeeMachine.takeCoffee();

        coffeeMachine.buyCoffee(2);
        coffeeMachine.buyCoffee(2);
        coffeeMachine.buyCoffee(2);
    }
}
