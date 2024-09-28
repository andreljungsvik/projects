package objects;

import intefacep.*;
import players.*;

public class Mirror implements Interactive{
    public void interact(Player player) {
        System.out.println("Du ser " + player.getName() + " i spegeln!");
    }

    public String getName() {
        return "en spegel";
    }
}
