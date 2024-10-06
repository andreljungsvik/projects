public class MathUtils {
    public static boolean allEven(int[] numbers) {
        for (int number : numbers) {
            if (number % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30 };
        System.out.println(allEven(numbers));
    }
}