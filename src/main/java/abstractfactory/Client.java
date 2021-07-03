package abstractfactory;

public class Client {

    public static void main(String[] args) {
        createCarEquipmnent(new EconomyCarEquipmentFactory());
        System.out.println("******************");
        createCarEquipmnent(new PremiumCarEquipmentFactory());
    }

    private static void createCarEquipmnent(CarEquipmentFactory carEquipmentFactory) {
        Engine engine = carEquipmentFactory.createEngine();
        engine.produce();

        Light light = carEquipmentFactory.createLight();
        light.produce();

        Tire tire = carEquipmentFactory.createTire();
        tire.produce();
    }
}
