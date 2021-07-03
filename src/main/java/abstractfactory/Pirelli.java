package abstractfactory;

public class Pirelli implements Tire {
    @Override
    public void produce() {
        System.out.println("Pirelli");
    }
}
