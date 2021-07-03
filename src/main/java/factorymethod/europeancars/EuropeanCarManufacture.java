package factorymethod.europeancars;

import factorymethod.Car;
import factorymethod.CarManufacture;
import factorymethod.europeancars.EuropeanAudi;
import factorymethod.europeancars.EuropeanBmw;
import factorymethod.europeancars.EuropeanFso;
import factorymethod.europeancars.EuropeanVolvo;

public class EuropeanCarManufacture extends CarManufacture {

    @Override
    public Car createCar(String name) {
        if (name.equals("Audi")) {
            return new EuropeanAudi();
        } else if (name.equals("Volvo")) {
            return new EuropeanVolvo();
        } else if (name.equals("Fso")) {
            return new EuropeanFso();
        } else if (name.equals("BMW")) {
            return new EuropeanBmw();
        } else {
            throw new IllegalArgumentException("Unknown car type");
        }
    }
}
