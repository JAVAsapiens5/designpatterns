package abstractfactory;

public class EconomyTire implements Tire {
    @Override
    public void produce() {
        System.out.println("Economy Tire");
    }
}
