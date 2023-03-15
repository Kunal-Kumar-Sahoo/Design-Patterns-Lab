package Shapes;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        System.out.println("Before decoration");
        circle.draw();
        rectangle.draw();

        circle = new RedShapeDecorator(circle);
        rectangle = new RedShapeDecorator(rectangle);
        System.out.println("After decoration");
        circle.draw();
        rectangle.draw();
    }
}
