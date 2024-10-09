public class Triangle extends Shape {
    private int height;
    private int width;

    public Triangle(int height, int width) {
        super("Triangle");
        this.height = height;
        this.width = width;
    }

    public String toString() {
        return super.toString() + " with a width of " + width + " and a height of " + height;
    }
}
