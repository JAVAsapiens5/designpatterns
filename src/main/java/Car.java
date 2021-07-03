public class Car {

    protected String type;

    private EngineCheckerInterface engineChecker;

    public Car(EngineCheckerInterface engineChecker) {
        this.engineChecker = engineChecker;
    }

    public void checkEngine() {
        engineChecker.checkEngine();
    }
}
