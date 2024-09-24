import java.util.*;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange bredd: ");
        double width = scanner.nextDouble();

        System.out.println("Ange höjd: ");
        double height = scanner.nextDouble();

        double circumference = width * 2 + height * 2;
        double area = width * height;

        System.out.println("Omkrets: " + circumference + " Area: " + area);
    }
}