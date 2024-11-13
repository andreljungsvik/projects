
import java.util.*;

public class InventoryItem implements Comparable<InventoryItem> {
    private String name;
    private int articleNumber;
    private int stock;
    private int price;

    public InventoryItem(String name, int articleNumber, int stock, int price) {
        this.name = name;
        this.articleNumber = articleNumber;
        this.stock = stock;
        this.price = price;
    }

    public static Comparator<InventoryItem> sortByPrice() {
        return Comparator.comparing(InventoryItem::getPrice);
    }

    public String getName() {
        return name;
    }

    public int getArticleNumber() {
        return articleNumber;
    }

    public int getStock() {
        return stock;
    }

    public int getPrice() {
        return price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + articleNumber;
        result = prime * result + stock;
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        InventoryItem other = (InventoryItem) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (articleNumber != other.articleNumber)
            return false;
        if (stock != other.stock)
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "InventoryItem [name=" + name + ", articleNumber=" + articleNumber + ", stock=" + stock + ", price="
                + price + "]";
    }

    @Override
    public int compareTo(InventoryItem o) {
        return Integer.compare(this.articleNumber, o.articleNumber);
    }
}