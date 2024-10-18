public class Weirdo {
    public static int imBadYouKnowIt(int value) {
        Integer[] arr = { Integer.valueOf(0), null, Integer.valueOf(2) };
        int i = (int) (Math.random() * 5);
        return value / arr[i];
    }

    public static void main(String[] args) {
        try {
            System.out.println(imBadYouKnowIt(5));
        } catch (RuntimeException e) {

        }

    }
}
