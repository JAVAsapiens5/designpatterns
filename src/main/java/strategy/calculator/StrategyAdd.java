package strategy.calculator;

public class StrategyAdd implements OperationStrategy {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
