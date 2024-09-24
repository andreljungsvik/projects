import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange bredd: ");
        double width = scanner.nextDouble();

        System.out.println("Ange höjd: ");
        double height = scanner.nextDouble();

        double circumference = width * 2 + height * 2;
        double area = width * height;

        if (area > 1000) {
            System.out.println("Rektangeln är jättestor");
        } else {
            System.out.println("Omkrets: " + circumference + " Area: " + area);
        }

    }
}