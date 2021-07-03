package abstractfactory;

public class HalogenLight implements Light {

    @Override
    public void produce() {
        System.out.println("Halogen Light");
    }
}
