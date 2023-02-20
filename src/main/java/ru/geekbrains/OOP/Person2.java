package ru.geekbrains.OOP;

public class Person2 implements PersonBuilder{
    private String firstName;  // имя
    private String lastName;   // Фамилия
    private String middleName;   // Второе имя
    private String country;   // Страна
    private String address;   // адрес
    private String phone;   // Телефон
    private int age;  //  Возвраст
    private String gender; // Пол

    public Person2() {
        super();
    }

    @Override
    public PersonBuilder FirstName() {
        this.firstName = "Fridrich";
        return this;
    }

    @Override
    public PersonBuilder LastName() {
        this.lastName = "Scholz";
        return this;
    }

    @Override
    public PersonBuilder MiddleName() {
        this.middleName = "Avgust";
        return this;
    }

    @Override
    public PersonBuilder Country() {
        this.country = "Deutsch";
        return this;
    }

    @Override
    public PersonBuilder Address() {
        this.address = "Dusseldorf Flower Alley street house 7";
        return this;
    }

    @Override
    public PersonBuilder Phone() {
        this.phone = "+79095648713";
        return this;
    }

    @Override
    public PersonBuilder Age() {
        this.age = 32;
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
