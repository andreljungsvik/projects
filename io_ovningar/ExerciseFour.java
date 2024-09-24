import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        while(true){

            System.out.print("Ange antal poäng: ");

            int points = scanner.nextInt();

            if (points >= 25 && points <= 34)
            {
                System.out.println("Du fick betyg: G");
                break;
            } else if(points >= 35 && points <= 44){
                System.out.println("Du fick betyg: VG");
                break;
            } else if(points >= 45 && points <= 50){
                System.out.println("Du fick betyg: MVG");
                break;
            } else if(points > 50){
                System.out.println("Max antal poäng är 50.");
            } else{
                System.out.println("Underkänt.");
                break;
            }
            
        }
    }
}
