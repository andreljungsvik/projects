import java.util.*;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ange ditt namn: ");
        String name = input.nextLine();

        System.out.println("Ange din ålder: ");
        int age = input.nextInt();

        System.out.println("Ange din längd i cm: ");
        int height = input.nextInt();

        if (age < 13) {
            System.out.println("Jag får inte behandla din information");
        } else {
            System.out.printf("Namn: %s%nLängd: %dcm%n", name, height);
            if (height > 174) {
                System.out.println("Du är längre än medelsvensson");
            }
        }
        input.close();
    }
}