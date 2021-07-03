package factorymethod;

public abstract class CarManufacture {

    public void manufactureCar(String name) {
        Car car = createCar(name);

        car.start();
        car.accelerate();
        car.stop();
    }

    public abstract Car createCar(String name);
}
