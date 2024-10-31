import java.util.*;
import javax.print.attribute.standard.PresentationDirection;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> person = new TreeSet<>();
        Random rand = new Random();
        int random = rand.nextInt(5);
        while(true) {
            String addPerson = scanner.nextLine();
            if (addPerson.equals("")) {
                break;
            }
            person.add(addPerson);
        }

        for(int i = 0; i <= random; i++) {

        }
    }
}
