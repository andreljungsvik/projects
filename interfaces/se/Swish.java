public class Swish implements PaymentMethod{
    public void makePayment(double amount) {
        System.out.println("Betalning genomförd. " + amount + "kr. Betalningsmetod: Swish");
    }
}
