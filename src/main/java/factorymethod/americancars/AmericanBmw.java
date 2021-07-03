package factorymethod.americancars;

import factorymethod.Car;

public class AmericanBmw extends Car {
    @Override
    public void start() {
        System.out.println("start AmericanBmw");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate AmericanBmw");
    }

    @Override
    public void stop() {
        System.out.println("stop AmericanBmw");
    }
}
