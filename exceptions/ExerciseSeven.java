public class ExerciseSeven {
    public static void doImportantStuff() {
        int roll = 100 / (int) (Math.random() * 3);
        for (int i = 0; i < roll; ++i) {
            System.out.println("Rolling...");
        }
    }
    
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        try {
            doImportantStuff();
        } catch (ArithmeticException e) {
            System.out.println("Ett fel inträffade. Försökte dela med 0");
        }
        System.out.println(System.currentTimeMillis() - time + "ms");
    }
}

