package factorymethod.europeancars;

import factorymethod.Car;

public class EuropeanBmw extends Car {
    @Override
    public void start() {
        System.out.println("start EuropeanBmw");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate EuropeanBmw");
    }

    @Override
    public void stop() {
        System.out.println("stop EuropeanBmw");
    }
}
