package objects;
import intefacep.*;
import players.*;

public class Horse implements Interactive{
    public void interact(Player player) {
        System.out.println("Hästen frustar.");
    }

    public String getName() {
        return "en snel hest";
    }
}
