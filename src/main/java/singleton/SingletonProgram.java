package singleton;

public class SingletonProgram {

    public static void main(String[] args) {

        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton11 = Singleton1.getInstance();

        if (singleton11 == singleton1) {
            System.out.println("To są te same obiekty");
        }

        Singleton2 singleton2 = Singleton2.getInstance();
        Singleton2 singleton21 = Singleton2.getInstance();

        if (singleton2 == singleton21) {
            System.out.println("To są te same obiekty");
        }

        Singleton3 singleton3 = Singleton3.getInstance();
        Singleton3 singleton31 = Singleton3.getInstance();

        if (singleton3 == singleton31) {
            System.out.println("To są te same obiekty");
        }

        Singleton4 singleton4 = Singleton4.getInstance();
        Singleton4 singleton41 = Singleton4.getInstance();

        if (singleton4 == singleton41) {
            System.out.println("To są te same obiekty");
        }

        Singleton5 singleton5 = Singleton5.getInstance();
        Singleton5 singleton51 = Singleton5.getInstance();

        if (singleton5 == singleton51) {
            System.out.println("To są te same obiekty");
        }

        Singleton6 singleton6 = Singleton6.getInstance();
        Singleton6 singleton61 = Singleton6.getInstance();

        if (singleton6 == singleton61) {
            System.out.println("To są te same obiekty");
        }

        Singleton7 singleton7 = Singleton7.INSTANCE;
        Singleton7 singleton71 = Singleton7.INSTANCE;

        if (singleton7 == singleton71) {
            System.out.println("To są te same obiekty (enum)");
        }
    }
}
