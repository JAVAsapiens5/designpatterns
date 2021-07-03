package factorymethod.europeancars;

import factorymethod.Car;

public class EuropeanVolvo extends Car {
    @Override
    public void start() {
        System.out.println("start EuropeanVolvo");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate EuropeanVolvo");
    }

    @Override
    public void stop() {
        System.out.println("stop EuropeanVolvo");
    }
}
