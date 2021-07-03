package builder;

public class ClassicCarBuilder implements CarBuilder {

    private String chassis;
    private String body;
    private String paint;
    private String interior;

    @Override
    public CarBuilder buildChassis() {
        System.out.println("Build classic chassis");
        this.chassis = "Classic Chassis";
        return this;
    }

    @Override
    public CarBuilder buildBody() {
        System.out.println("Build classic body");
        this.body = "Classic Body";
        return this;
    }

    @Override
    public CarBuilder paint() {
        System.out.println("Paint classic colour");
        this.paint = "White Pearl";
        return this;
    }

    @Override
    public CarBuilder buildInterior() {
        System.out.println("Build classic interior");
        this.interior = "Classic Interior";
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
