public class CheckingAccount extends BankAccount {
    private double fee;

    public CheckingAccount(int accountNumber, double fee) {
        super(accountNumber);
        this.fee = fee;
    }

    public void deductFee() {
        if(fee <= getBalance()) {
            withdraw(fee);
        } else {
            System.out.println("Balance too low to deduct fee"); 
        }
    }
}
