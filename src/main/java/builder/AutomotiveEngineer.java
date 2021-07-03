package builder;

public class AutomotiveEngineer {

    CarBuilder carBuilder;

    public AutomotiveEngineer(CarBuilder carBuilder) {
        if (carBuilder == null) {
            throw new IllegalArgumentException("Automotive Engineer is not set");
        }

        this.carBuilder = carBuilder;
    }

    public Car buildCar() {
        return carBuilder
                .buildChassis()
                .buildBody()
                .paint()
                .buildInterior()
                .build();
    }

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }
}
