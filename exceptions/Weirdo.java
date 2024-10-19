public class Weirdo {
    public static int imBadYouKnowIt(int value) {
        Integer[] arr = { Integer.valueOf(0), null, Integer.valueOf(2) };
        int i = (int) (Math.random() * 5);
        return value / arr[i];
    }

    public static void main(String[] args) {
        try {
            System.out.println(imBadYouKnowIt(2));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Letar utanför array index. Fel: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Försökte dela med 0. Fel: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Försökte dela med null Fel: " + e.getMessage());
        }

    }
}
