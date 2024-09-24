public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area(){
        return (width * height);
    }

    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(50, 20);
        System.out.println(rec1.area() + "cm2bajs");
    }
}
