public class Pets {
    int pets;

    public Pets(int pets) {
        this.pets = pets;
    }

    public String petCount() {
        if (pets == 0) {
            return "Lugnt och skönt";
        } else if (pets >= 1 && pets <= 3) {
            return "Ganska vanligt";
        } else {
            return "Oj, det var rejält";
        }
    }
    public static void main(String[] args) {
        Pets lars = new Pets(0);
        System.out.println(lars.petCount());
    }
}
