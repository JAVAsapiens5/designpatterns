package builder;

public class SportCarBuilder implements CarBuilder {

    private String chassis;
    private String body;
    private String paint;
    private String interior;

    @Override
    public CarBuilder buildChassis() {
        System.out.println("Build sporty chassis");
        this.chassis = "Sporty Chassis";
        return this;
    }

    @Override
    public CarBuilder buildBody() {
        System.out.println("Build sporty body");
        this.body = "Sporty Body";
        return this;
    }

    @Override
    public CarBuilder paint() {
        System.out.println("Paint sporty red colour");
        this.paint = "Red Colour";
        return this;
    }

    @Override
    public CarBuilder buildInterior() {
        System.out.println("Build sporty interior");
        this.interior = "Sporty Interior";
        return this;
    }

    @Override
    public Car build() {
        Car car = new Car(chassis, body, paint, interior);
        if (car.qualityCheck()) {
            return car;
        } else {
            System.out.println("Car assembly is incomplete.");
        }

        return null;
    }
}
