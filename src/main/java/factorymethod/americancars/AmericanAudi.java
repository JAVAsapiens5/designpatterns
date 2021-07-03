package factorymethod.americancars;

import factorymethod.Car;

public class AmericanAudi extends Car {
    @Override
    public void start() {
        System.out.println("start AmericanAudi");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate AmericanAudi");
    }

    @Override
    public void stop() {
        System.out.println("stop AmericanAudi");
    }
}
