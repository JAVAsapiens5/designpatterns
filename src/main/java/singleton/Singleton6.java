package singleton;

public class Singleton6 {

    // Singleton Bill Pught
    // https://dzone.com/articles/singleton-bill-pugh-solution-or-enum

    private static class Singleton {
        private static Singleton6 instance = new Singleton6();
    }

    private Singleton6() {

    }

    public static Singleton6 getInstance() {
        return Singleton.instance;
    }
}
