
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Pair<Integer> par1 = new Pair<>(1, 2);
        // Pair<Integer> par2 = new Pair<>(1, 2);
        // Pair<Integer> par3 = new Pair<>(2, 1);

        List<String> lista = new ArrayList<>();
        lista.add("bajs");
        lista.add("kiss");


        System.out.println("Är alla objekt unika i listan: " + Pair.uniqueList(lista)); //förväntat true


        // System.out.println("Is list odd: " + Pair.oddList(lista));

        // System.out.println("par1: " + par1);
        // System.out.println("par2: " + par2);
        // System.out.println("par3: " + par3);

        // System.out.println("par1 equals par 2: " + par1.equals(par2)); // expect true
        // System.out.println("par1 equals par 2: " + par1.equals(par3)); // expect false

        // System.out.println("par1 hashCode: " + par1.hashCode());
        // System.out.println("par2 hashCode: " + par2.hashCode());
        // System.out.println("par3 hashCode: " + par3.hashCode());

        // System.out.println("pair1.compareTo(pair2): " + par1.compareTo(par2)); // bör vara 0
        // System.out.println("pair1.compareTo(pair3): " + par1.compareTo(par3)); // bör vara negativt
        // System.out.println("pair2.compareTo(pair3): " + par2.compareTo(par3)); // bör vara negativt
        // System.out.println("pair1.compareTo(pair1): " + par1.compareTo(par1)); // bör vara 0

        // System.out.println("par1 och par2 har samma hashCode: " + (par1.hashCode() == par2.hashCode()));


    }
}