package factorymethod.europeancars;

import factorymethod.Car;

public class EuropeanFso extends Car {
    @Override
    public void start() {
        System.out.println("start EuropeanFso");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate EuropeanFso");
    }

    @Override
    public void stop() {
        System.out.println("stop EuropeanFso");
    }
}
