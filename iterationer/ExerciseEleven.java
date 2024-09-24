import java.util.Scanner;

public class ExerciseEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vilken storlek på din enhetsmatris? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
        scanner.close();
    }
}
