public class MathUtils {
    public static boolean allEven(int[] numbers) {
        for (int number : numbers) {
            if (number % 2 != 0) {
                return false;
            }
        }
        return true;
    }
<<<<<<< HEAD

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30 };
        System.out.println(allEven(numbers));
    }
}
=======
}
>>>>>>> f13b6262dcafdcf18407a3a7458370ead83a03d0
