package factorymethod;

import factorymethod.americancars.AmericanCarManufacture;
import factorymethod.europeancars.EuropeanCarManufacture;

public class FactoryMethodProgram {

    public static void main(String[] args) {
        CarManufacture carManufacture = new AmericanCarManufacture();
        carManufacture.manufactureCar("Volvo");

        carManufacture = new EuropeanCarManufacture();
        carManufacture.manufactureCar("Fso");
    }
}
