public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String surName, int age) {
        this.firstName = firstName;
        this.lastName = surName;
        this.age = age;
    }

    public String toString() {
        return "First name: " + firstName + "\n" + "Last name: " + lastName + "\n" + "Age: " + age;
    }
}
