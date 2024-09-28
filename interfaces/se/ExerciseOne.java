public class ExerciseOne {
    public static void main(String[] args) {
        PaymentMethod methodOne = new CreditCard();
        PaymentMethod methodTwo = new Swish();
        methodOne.makePayment(1000);
        methodTwo.makePayment(2000);
    }
}