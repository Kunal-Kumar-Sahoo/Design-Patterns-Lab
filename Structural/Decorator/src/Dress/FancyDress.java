package Dress;

public class FancyDress extends DressDecorator {
    public FancyDress(Dress dress) {
        super(dress);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("adding fancy dress features");
    }
}
