public class Rectangle {
    private int width = 0;
    private int length = 0;

    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }

    public int area() {
        return width * length;
    }
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(50, 10);
        System.out.println(rect.area() + "cm2");
    }
}
