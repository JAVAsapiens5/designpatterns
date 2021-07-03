package strategy.calculator;

public class Calculator {

    private OperationStrategy operationStrategy;

    public void setOperationStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public int calculate(int a, int b) {

        if (operationStrategy == null) {
            throw new IllegalArgumentException("Unknown strategy");
        }

        return operationStrategy.calculate(a, b);
    }
}
