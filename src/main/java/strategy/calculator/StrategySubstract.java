package strategy.calculator;

public class StrategySubstract implements OperationStrategy {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
