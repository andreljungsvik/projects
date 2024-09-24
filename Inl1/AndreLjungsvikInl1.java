public class AndreLjungsvikInl1 {
    public static void main(String[] args) {
        int basicSalary = 20000;
        int commissionPerSale = 500;
        int totalSales = 15;
        double healthBonusMultiplier = 1.02;
        double taxRate = 0.3345;

        double totalSalaryBeforeTax = ((basicSalary + commissionPerSale * totalSales) * healthBonusMultiplier);

        double totalSalaryAfterTax = totalSalaryBeforeTax * (1 - taxRate);

        System.out.printf("Salary paid: %,.2f kr", totalSalaryAfterTax);
    }
}