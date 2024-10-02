public class MathUtils {
    public static boolean allEven(int[] numbers) {
        for (int number : numbers) {
            if (number % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
