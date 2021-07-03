package factorymethod.americancars;

import factorymethod.Car;
import factorymethod.CarManufacture;
import factorymethod.americancars.AmericanAudi;
import factorymethod.americancars.AmericanBmw;
import factorymethod.americancars.AmericanFso;
import factorymethod.americancars.AmericanVolvo;

public class AmericanCarManufacture extends CarManufacture {

    @Override
    public Car createCar(String name) {
        if (name.equals("Audi")) {
            return new AmericanAudi();
        } else if (name.equals("Volvo")) {
            return new AmericanVolvo();
        } else if (name.equals("Fso")) {
            return new AmericanFso();
        } else if (name.equals("BMW")) {
            return new AmericanBmw();
        } else {
            throw new IllegalArgumentException("Unknown car type");
        }
    }
}
