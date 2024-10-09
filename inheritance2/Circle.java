public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        super("Cricle");
        this.radius = radius;
    }

    public String toString() {
        return super.toString() + " with a radius of " + radius;
    }
}
