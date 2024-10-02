import java.util.*;

public class RandomInt {

    public int[] intArray(int arraySize) {
        Random rand = new Random();
        int[] randomArray = new int[arraySize];
        int sum = 0;
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rand.nextInt(100) + 1;
        }
        return randomArray;
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            int arraySize = Integer.valueOf(args[0]);

            RandomInt bajs = new RandomInt();
            int[] randomBajskorv = bajs.intArray(arraySize);

            for (int i : randomBajskorv) {
                System.out.println(i);
            }
        } else {
            System.out.println("Ange ett heltal som argument.");
        }

    }
}