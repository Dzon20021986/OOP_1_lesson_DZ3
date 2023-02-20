package ru.geekbrains.OOP;

public class Person4 implements PersonBuilder{
    private String firstName;  // имя
    private String lastName;   // Фамилия
    private String middleName;   // Второе имя
    private String country;   // Страна
    private String address;   // адрес
    private String phone;   // Телефон
    private int age;  //  Возвраст
    private String gender; // Пол

    public Person4() {
        super();
    }
    @Override
    public PersonBuilder FirstName() {
        this.firstName = "Ira";
        return this;

    }

    @Override
    public PersonBuilder LastName() {
        this.lastName = "Smirnova";
        return this;
    }

    @Override
    public PersonBuilder MiddleName() {
        this.middleName = "Svetlana";
        return this;
    }

    @Override
    public PersonBuilder Country() {
        this.country = "Russia";
        return this;
    }

    @Override
    public PersonBuilder Address() {
        this.address = "Yaroslavl Leningradsky Prospekt house 5 sq 67";
        return this;
    }

    @Override
    public PersonBuilder Phone() {
        this.phone = "+79535648713";
        return this;
    }

    @Override
    public PersonBuilder Age() {
        this.age = 33;
        return this;
    }

    @Override
    public PersonBuilder Gender() {
        this.gender = "Woman";
        return this;
    }

    @Override
    public Person build() {
        Person person = new Person(firstName, lastName, middleName, country, address, phone, age, gender);
        if (person.doQualityCheck()) {
            return person;
        } else {
            System.out.println("There is no person");
        }
        return null;
    }
}
