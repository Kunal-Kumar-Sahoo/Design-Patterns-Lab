package Dress;

public class SportyDress extends DressDecorator {
    public SportyDress(Dress dress) {
        super(dress);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("adding sporty dress features");
    }
}
