public class ExerciseThree {
    public static void main(String[] args) {

        float maxFloat = MathFunctions.max(5.0f, 12.0f);
        System.out.println("Max of given float numbers: " + maxFloat);

        float minFloat = MathFunctions.min(5.0f, 12.0f);
        System.out.println("Min of given float numbers: " + minFloat);

        float avgFloat = MathFunctions.average(5.0f, 12.0f);
        System.out.println("Average of given float numbers: " + avgFloat);

        int maxInt = MathFunctions.max(10, 30);
        System.out.println("Max of given integer numbers: " + maxInt);

        int minInt = MathFunctions.min(10, 30);
        System.out.println("Min of given integer numbers " + minInt);

        int avgInt = MathFunctions.average(10, 30);
        System.out.println("Average of given integer numbers " + avgInt);
        System.out.println("test123");
    }
}
