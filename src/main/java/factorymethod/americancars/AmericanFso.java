package factorymethod.americancars;

import factorymethod.Car;

public class AmericanFso extends Car {
    @Override
    public void start() {
        System.out.println("start AmericanFso");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate AmericanFso");
    }

    @Override
    public void stop() {
        System.out.println("stop AmericanFso");
    }
}
