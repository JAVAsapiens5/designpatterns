package factorymethod.americancars;

import factorymethod.Car;

public class AmericanVolvo extends Car {
    @Override
    public void start() {
        System.out.println("start AmericanVolvo");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate AmericanVolvo");
    }

    @Override
    public void stop() {
        System.out.println("stop AmericanVolvo");
    }
}
