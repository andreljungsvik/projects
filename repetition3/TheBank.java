public class TheBank {
    public static void main(String[] args) {
        CheckingAccount checkAcc = new CheckingAccount(133769, 70);
        SavingsAccount saveAcc = new SavingsAccount(666123, 0.05);
        printAccountDetails(saveAcc);
        saveAcc.addInterest();
        printAccountDetails(saveAcc);

        printAccountDetails(checkAcc);
        checkAcc.deductFee();
        printAccountDetails(checkAcc);
    }

    public static void printAccountDetails(BankAccount account) {
        System.out.println("Kontonummer: " + account.getAccountNumber());
        System.out.println("Saldo: " + account.getBalance());
    }
}
