import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ange längd på brevet: ");
            int length = scanner.nextInt();

            System.out.println("Ange bredd på på brevet: ");
            int width = scanner.nextInt();

            System.out.println("Ange tjocklek på brevet: ");
            int thickness = scanner.nextInt();

            if (length + width + thickness > 900) {
                System.out.println("Bredd + tjocklek + längd får inte överstiga 900m");
                break;
            } else if (length < 140 || length > 600) {
                System.out.println("Max längd: 600mm. Min längd: 140mm.");
                break;
            } else if (width < 90) {
                System.out.println("Min bredd 90mm.");
                break;
            } else if (thickness > 100) {
                System.out.println("Maximala tjockleken är 100mm");
                break;
            }

            
            System.out.println("Brevets dimensioner är accepterade.");
            scanner.close();
            break;
        }

    }
}
