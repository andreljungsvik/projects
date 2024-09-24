import java.util.*;

public class ExerciseFour {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNum1 = 123;
        int randomNum2 = 0;
        int count = 0;

        while (randomNum1 != randomNum2) {
            randomNum2 = random.nextInt(1000) + 1;
            count++;
        }

        System.out.println("Det tog " + count + " gånger innan slumpen gav oss talet " + randomNum1 + ".");

    }
}
