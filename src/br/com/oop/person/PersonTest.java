package src.br.com.oop.person;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "John";
        person.age = 30;

        person.printAttributes();
    }
}
