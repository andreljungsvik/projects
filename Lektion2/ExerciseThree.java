public class ExerciseThree {
    public static void main(String[] args) {
        float radius = 1e20f;
        float circumference = 2 * (float) StrictMath.PI * radius;
        float area = (float) StrictMath.PI * radius * radius;
        System.out.printf("Omkretsen på cirkeln är %.2f.\n", circumference);
        System.out.printf("Arean på cirkeln är %.2f.\n", area);
    }
}