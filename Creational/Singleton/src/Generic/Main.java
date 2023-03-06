package Generic;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleInstance();
        Singleton s2 = Singleton.getSingleInstance();
        s1.setI(5);
        s2.setI(10);
        System.out.println(s1.getI());
        s2.i = s1.i + s2.i;
        System.out.println(s2.getI());
        print("S1", s1);
        print("S2", s2);
    }

    private static void print(String s, Singleton obj) {
        System.out.println("Object: " + s + "\tAddress: " + obj.hashCode());
    }
}
