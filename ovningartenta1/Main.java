import shapes.*;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(50.1, 20.5);
        Circle circ = new Circle(20.55);

        System.out.println("Circle area: " + circ.area());
        System.out.println("Circle perimeter: " + circ.perimeter());
        System.out.println("Rectangle area: " + rect.area());
        System.out.println("Rectangle perimeter: " + rect.perimeter());
    }
}
