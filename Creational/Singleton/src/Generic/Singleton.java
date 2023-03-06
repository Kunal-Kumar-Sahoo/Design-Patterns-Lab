package Generic;

public class Singleton {
    private static Singleton singleInstance = new Singleton();
    public int i;

    private Singleton() {
        System.out.println("Single instance created");
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public static void setSingleInstance(Singleton singleInstance) {
        Singleton.singleInstance = singleInstance;
    }

    public static Singleton getSingleInstance() {
        return singleInstance;
    }
}
