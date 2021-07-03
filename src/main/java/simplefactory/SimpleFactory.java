package simplefactory;

public class SimpleFactory {

    public static Car createCar(String name) {

        if (name.equals("Audi")) {
            return new Audi();
        } else if (name.equals("Volvo")) {
            return new Volvo();
        } else if (name.equals("Fso")) {
            return new Fso();
        } else if (name.equals("BMW")) {
            return new Bmw();
        } else {
            throw new IllegalArgumentException("Unknown car type");
        }
    }
}
