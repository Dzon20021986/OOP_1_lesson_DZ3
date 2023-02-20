package ru.geekbrains.OOP;

public class Automotive {

    private PersonBuilder builder;

    public Automotive(PersonBuilder builder) {
        super();
        this.builder = builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("There is no way to create a person!");
        }
    }

    public Person creationPerson() {
        return builder.FirstName().LastName().MiddleName().Country().Address().Phone().Age().Gender().build();
    }

}
