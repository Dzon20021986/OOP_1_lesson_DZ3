package ru.geekbrains.OOP;

public class Person1 implements PersonBuilder{
    private String firstName;  // имя
    private String lastName;   // Фамилия
    private String middleName;   // Второе имя
    private String country;   // Страна
    private String address;   // адрес
    private String phone;   // Телефон
    private int age;  //  Возвраст
    private String gender; // Пол

    public Person1() {
        super();
    }

    @Override
    public PersonBuilder FirstName() {
        this.firstName = "Andrey";
        return this;

    }

    @Override
    public PersonBuilder LastName() {
        this.lastName = "Petrov";
        return this;
    }

    @Override
    public PersonBuilder MiddleName() {
        this.middleName = "Sergey";
        return this;
    }

    @Override
    public PersonBuilder Country() {
        this.country = "Russia";
        return this;
    }

    @Override
    public PersonBuilder Address() {
        this.address = "Moscow region Nakhabino Panfilova street d 46 sq 5";
        return this;
    }

    @Override
    public PersonBuilder Phone() {
        this.phone = "+79035648713";
        return this;
    }

    @Override
    public PersonBuilder Age() {
        this.age = 36;
        return this;
    }

    @Override
    public PersonBuilder Gender() {
        this.gender = "Male";
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
