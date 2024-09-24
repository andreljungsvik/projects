import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mata in första talet: ");
        int num1 = input.nextInt();

        System.out.print("Mata in andra talet: ");
        int num2 = input.nextInt();

        int greatest;
        int smallest;

        if (num1 < num2) {
            smallest = num1;
            greatest = num2;
        } else {
            smallest = num2;
            greatest = num1;
        }

        for (int i = smallest; i <= greatest; i++) {
            System.out.print(i);
            if (i < greatest) {
                System.out.print(" ");
            }
        }
        input.close();
    }
}