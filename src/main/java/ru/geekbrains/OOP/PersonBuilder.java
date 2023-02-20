package ru.geekbrains.OOP;

public interface PersonBuilder {

    // Этап 1
    public PersonBuilder FirstName();

    // Этап 2
    public PersonBuilder LastName();

    // Этап 3
    public PersonBuilder MiddleName();

    // Этап 4
    public PersonBuilder Country();

    // Этап 5
    public PersonBuilder Address();

    // Этап 6
    public PersonBuilder Phone();

    // Этап 7
    public PersonBuilder Age();

    // Этап 8
    public PersonBuilder Gender();

    // Выпуск автомобиля
    public Person build();
}


