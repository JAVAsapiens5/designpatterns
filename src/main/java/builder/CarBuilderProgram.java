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
    }
}
