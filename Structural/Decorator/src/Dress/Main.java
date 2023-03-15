package Dress;

public class Main {
    public static void main(String[] args) {
        Dress sportyDress = new SportyDress(new BasicDress());
//        sportyDress.assemble();
        System.out.println();

        Dress fancyDress = new FancyDress(sportyDress);
        fancyDress.assemble();
    }
}
