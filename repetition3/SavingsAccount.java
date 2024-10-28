public class SavingsAccount extends BankAccount {
    private double interest;

    public SavingsAccount(int accountNumber, double interest) {
        super(accountNumber);
        this.interest = interest;
    }

    public void addInterest() {
        double interestAmount = getBalance() * interest;
        deposit(interestAmount);
    }
}
