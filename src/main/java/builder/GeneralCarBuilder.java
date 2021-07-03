package builder;

public class GeneralCarBuilder {

    private String chassis;
    private String body;
    private String paint;
    private String interior;

    public GeneralCarBuilder buildChassis(String chassis) {
        System.out.println("Build " + chassis);
        this.chassis = chassis;
        return this;
    }

    public GeneralCarBuilder buildBody(String body) {
        System.out.println("Build " + body);
        this.body = body;
        return this;
    }

    public GeneralCarBuilder paint(String paint) {
        System.out.println("Paint " + paint);
        this.paint = paint;
        return this;
    }

    public GeneralCarBuilder buildInterior(String interior) {
        System.out.println("Build " + interior);
        this.interior = interior;
        return this;
    }

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
