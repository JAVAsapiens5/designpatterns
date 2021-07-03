public class EngineClient {

    public static void main(String[] args) {

        Engine engine = new SUV();
        engine.start();

        engine.stop();

        Car cabrio = new Car(new EngineChecker());

//        cabrio.getObject().getObject2().getObject3().doSmth();
//
//        cabrio.doSmth();

        // TODO.. jaką logika


    }
}
