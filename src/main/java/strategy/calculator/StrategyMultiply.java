package strategy.calculator;

public class StrategyMultiply implements OperationStrategy {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}
