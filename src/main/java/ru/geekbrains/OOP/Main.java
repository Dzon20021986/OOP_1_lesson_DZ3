package ru.geekbrains.OOP;

public class Main {
    public static void main(String[] args) {
        PersonBuilder builder = new Person1();
        Automotive creation = new Automotive(builder);
        Person person = creation.creationPerson();
        if (person != null) {
            System.out.println("Person created: ");
            System.out.println("=========================================");
            System.out.println(person);
            System.out.println("=========================================");
        }

    }
}
