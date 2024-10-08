public class FighterRobot {
    private String name;
    private int strength;
    private String weapon;

    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public String displayInfo() {
        return String.format("Name: %s%nStrength: %d%nWeapon: %s%n", name, strength, weapon);
    }

}
