import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        InventoryItem item1 = new InventoryItem("fork", 123, 3, 45);
        InventoryItem item2 = new InventoryItem("napkin", 153, 55, 254);
        InventoryItem item3 = new InventoryItem("coffe beans", 113, 12, 199);
        InventoryItem item4 = new InventoryItem("frying pan", 166, 6, 222);
        
        List<InventoryItem> lista = new ArrayList<>();
        lista.add(item1);
        lista.add(item2);
        lista.add(item3);
        lista.add(item4);

        lista.sort(InventoryItem.sortByPrice());
        

        for (InventoryItem bajs : lista) {
            System.out.println(bajs);
        }
    }
}
