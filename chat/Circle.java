public class Circle {

    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public double area(){
        return (radius * radius * Math.PI);
    }
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.area());
    }
}
