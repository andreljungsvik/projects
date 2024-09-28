package objects;

import intefacep.*;
import players.*;

public class Rock implements Interactive {
    public void interact(Player player) {
        System.out.println("Stenen är kall.");
    }

    public String getName() {
        return "en svart sten";
    }
}
