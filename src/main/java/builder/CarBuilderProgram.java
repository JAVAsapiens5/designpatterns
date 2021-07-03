package builder;

public class CarBuilderProgram {

    public static void main(String[] args) {

        Car car = new Car("Classic Chassis", "Classic Body", "White Pearl Color", "Classic Interior");

        if (car.qualityCheck()) {
            System.out.println(car);
        } else {
            System.out.println("not created");
        }

        CarBuilder classicCarBuilder = new ClassicCarBuilder();
        AutomotiveEngineer engineer = new AutomotiveEngineer(classicCarBuilder);
        Car car2 = engineer.buildCar();
        System.out.println(car2);

        engineer.setCarBuilder(new SportCarBuilder());
        car2 = engineer.buildCar();
        System.out.println(car2);

        GeneralCarBuilder generalCarBuilder = new GeneralCarBuilder();
        Car car3 = generalCarBuilder
                .buildChassis("Modern chassis")
                .buildBody("Modern mody")
                .paint("Black metallic colour")
                .buildInterior("Modern Interior")
                .build();
        System.out.println(car3);

        Car car4 = Car.builder()
                .chassis("Future chassis")
                .body("Future body")
                .paint("Fancy silver")
                .interior("Future interior")
                .build();
        System.out.println(car4);
    }
}
