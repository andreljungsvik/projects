import java.util.*;

public class Company {
    @SuppressWarnings("unused")
    private String companyName;
    @SuppressWarnings("unused")
    private double orgNum;
    private String ceoName;

    private double totalAssets;

    private double totalDebt;

    Scanner input = new Scanner(System.in);

    Company(String companyName, double orgNum, String ceoName) {
        this.companyName = companyName;
        this.orgNum = orgNum;
        this.ceoName = ceoName;
    }

    public void setAssets(double totalAssets) {
        this.totalAssets = totalAssets;
    }

    public void setDebt(double totalDebt) {
        this.totalDebt = totalDebt;
    }

    public void setCeo(String ceoName) {
        this.ceoName = ceoName;
    }

    public String getCeoName() {
        return ceoName;
    }

    public double getTotalAssets() {
        return totalAssets;
    }

    public double getTotalDebt() {
        return totalDebt;
    }

    public void companyMenu() {
        while (true) {
            System.out
                    .println(String.format("Vad vill du ändra? %n1. Totala tillgångar %n2. Total skuld %n3. VD"));
            System.out.println("Ange 1, 2 eller 3 (0 för att avsluta):");
            int changeValue = input.nextInt();
            input.nextLine();

            switch (changeValue) {
                case 1:
                    System.out.println("Ange totala tillgångar: ");
                    double changeAssets = input.nextDouble();
                    setAssets(changeAssets);
                    System.out.printf("Totala tillgångar: %,.2fkr %n", getTotalAssets());
                    continue;
                case 2:
                    System.out.println("Ange total skuld: ");
                    double changeDebt = input.nextDouble();
                    setDebt(changeDebt);
                    System.out.printf("Totala skuld: %,.2fkr%n", getTotalDebt());
                    continue;

                case 3:
                    System.out.println("Ange nya VD'n: ");
                    String changeCeo = input.nextLine();
                    setCeo(changeCeo);
                    System.out.println("VD: " + getCeoName());
                    continue;

                case 0:
                    System.out.println("Hejdå loser");
                    break;
            }
            break;
        }
        input.close();
    }
}
