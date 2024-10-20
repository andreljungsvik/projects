public class Test {
    public static void main(String[] args) {
        try {
            minMetod();
        } catch (MyException e) {
            System.out.println("Jag fångade detta: " + e.getMessage());
        }

    }
    public static void minMetod() throws MyException{
        throw new MyException("Detta är ett undantag.");
    }
}
