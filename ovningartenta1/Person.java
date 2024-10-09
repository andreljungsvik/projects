public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println("Namn: " + name + "\n" + "Ålder: " + age);
    }
    public static void main(String[] args) {
        Person lars = new Person("Lars", 44);
        lars.print();
    }
}
