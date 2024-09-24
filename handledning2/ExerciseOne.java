public class ExerciseOne {
    public static void main(String[] args) {
        Book bok1 = new Book("Pippi Långstrump", "Astrid Lindgren", "1945");
        bok1.upvote(10);
        bok1.downvote(2);
        System.out.println(bok1.displayInfo());

        Book bok2 = new Book("Lasse-Majas detektivbyrå","Martin Widmark", "2004");
        bok2.upvote(1);
        bok2.downvote(5);
        System.out.println(bok2.displayInfo());
    }
}
