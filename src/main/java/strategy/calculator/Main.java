package strategy.calculator;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.setOperationStrategy(new StrategyAdd());
        int result = calculator.calculate(1, 2);
        System.out.println(result);

        calculator.setOperationStrategy(new StrategySubstract());
        result = calculator.calculate(10, 5);
        System.out.println(result);

        calculator.setOperationStrategy(new StrategyMultiply());
        result = calculator.calculate(10, 2);
        System.out.println(result);

        try {
            calculator.setOperationStrategy(new StrategyDivide());
            result = calculator.calculate(10, 0);
            System.out.println(result);
        } catch (ArithmeticException exception) {
            System.out.println("Nie można dzielić przez 0");
        }
    }
}
