public class MathFunctions {

    public static float min(float num1, float num2) {
        float min;
        if (num1 < num2) {
            min = num1;
        } else {
            min = num2;
        }
        return min;
    }

    public static float max(float num1, float num2) {
        float max;
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }
        return max;
    }

    public static float average(float num1, float num2) {
        float average = (num1 + num2) / 2;
        return average;
    }

    public static int min(int num1, int num2) {
        int min;
        if (num1 < num2) {
            min = num1;
        } else {
            min = num2;
        }
        return min;
    }

    public static int max(int num1, int num2) {
        int max;
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }
        return max;
    }

    public static int average(int num1, int num2) {
        int average = (num1 + num2) / 2;
        return average;
    }

}
