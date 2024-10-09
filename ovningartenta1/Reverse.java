public class Reverse {
    public void reverseString(String reverse) {
        for (int i = reverse.length() - 1; i >= 0; i--) {
            System.out.println(reverse.charAt(i));
        }
    }
    public static void main(String[] args) {
        Reverse bajs = new Reverse();
        bajs.reverseString("bajs");
    }
}
