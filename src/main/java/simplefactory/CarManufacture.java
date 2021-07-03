package simplefactory;

public class CarManufacture {

//    private SimpleFactory factory;
//
//    public CarManufacture(SimpleFactory factory) {
//        this.factory = factory;
//    }

    public void manufacureCar(String name) {

        Car car = SimpleFactory.createCar(name);

        car.start();
        car.accelerate();
        car.stop();
    }
}
