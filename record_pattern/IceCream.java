import java.util.*;

public record IceCream(String holder, List<String> scoops) {
    public IceCream {
        scoops = List.copyOf(scoops);
    }

    public static void main(String[] args) {
        List<String> scoops = new ArrayList<>();
        scoops.add("Vanilla");
        IceCream iceCream = new IceCream("cone", scoops);
        System.out.println(iceCream);
        scoops.add("Melon");
        System.out.println(iceCream);
    }
}