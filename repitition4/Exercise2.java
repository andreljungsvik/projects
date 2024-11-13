import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        Name lars = new Name("Lars", "Larsa", "Bengtsson");
        Name per = new Name("Per", "Perra", "Tengsson");
        Name magnus = new Name("Magnus", "Mange", "Larsson");
        Name duplicateLars = new Name("Lars", "Larsa", "Bengtsson");
    
        List<Name> lista = new ArrayList<>();
        lista.add(lars);
        lista.add(per);
        lista.add(magnus);

        lista.sort(null);

        for (Name namn : lista) {
            System.out.println(namn);
        }
    
        System.out.println("Is lars equal to per? " + lars.equals(per));
        System.out.println("Is lars equal to duplicateLars? " + lars.equals(duplicateLars));
    }
}