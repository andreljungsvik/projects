import java.util.*;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ange tal 1: ");
        int from = input.nextInt();

        System.out.print("Ange tal 2: ");
        int to = input.nextInt();

        if (from > to) {
            int temp = from;
            from = to;
            to = temp;
        }
        
        if (to % 2 != 0) {
            to--;
        }

        if (from % 2 != 0) {
            from++;
        }

        for(int i = from; i <= to; i += 2) {
            System.out.println(i);
        }
        input.close();
    }
}
