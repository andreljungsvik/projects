import java.util.*;

public class ExerciseTwo{
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(10));
        shapes.add(new Circle(15));
        shapes.add(new Triangle(2, 12));
        shapes.add(new Triangle(7, 8));

        for (Shape shape : shapes) {
            System.out.println(shape);
        }

    }
}
