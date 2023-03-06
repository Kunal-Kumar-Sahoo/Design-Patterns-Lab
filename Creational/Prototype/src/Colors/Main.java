package Colors;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ColorStore.getColor("blue").addColor();
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("blue").addColor();
        ColorStore.getColor("black").addColor();
    }
}
