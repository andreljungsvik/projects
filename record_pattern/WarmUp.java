public class WarmUp {
    public static void main(String[] args) {
        User b1 = new User("XxxBoxxX", "Bosse Bredsladd",
                "bosse@lammindustries.com");
        User b2 = new User("XxxBoxxX", "Bosse Bredsladd",
                "bosse@lammindustries.com");
        User l1 = new User("lammet", "Lena Lamm", "lena@lammindustries.com");
        // use toString
        System.out.println(b1);
        System.out.println(l1);
        // use getter
        System.out.println(b1.name());
        System.out.println(l1.name());
        System.out.printf("Is %s equal to %s? %b%n", b1, b2, b1.equals(b2));
    }
}