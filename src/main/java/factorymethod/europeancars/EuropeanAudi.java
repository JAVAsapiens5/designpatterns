package factorymethod.europeancars;

import factorymethod.Car;

public class EuropeanAudi extends Car {
    @Override
    public void start() {
        System.out.println("start EuropeanAudi");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate EuropeanAudi");
    }

    @Override
    public void stop() {
        System.out.println("stop EuropeanAudi");
    }
}
