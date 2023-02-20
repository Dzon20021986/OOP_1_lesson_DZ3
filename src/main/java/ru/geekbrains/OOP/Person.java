package ru.geekbrains.OOP;

public class Person {
    private String firstName;  // имя
    private String lastName;   // Фамилия
    private String middleName;   // Второе имя
    private String country;   // Страна
    private String address;   // адрес
    private String phone;   // Телефон
    private int age;  //  Возвраст
    private String gender; // Пол

    public Person() {
        super();
    }

    public Person(String firstName, String lastName, String middleName, String country, String address, String phone, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.country = country;
        this.address = address;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
    }


    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) {this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getMiddleName() { return middleName;}

    public void setMiddleName(String middleName) { this.middleName = middleName; }

    public String getCountry() { return country; }

    public void setCountry(String country) { this.country = country; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public String getPhone() { return phone;}

    public void setPhone(String phone) { this.phone = phone;}

    public int getAge() { return age;}

    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender;}

    public boolean doQualityCheck() {  // проверочный код
        return (firstName != null && !firstName.trim().isEmpty()) && (lastName != null && !lastName.trim().isEmpty())
                && (middleName != null && !middleName.trim().isEmpty()) && (country != null && !country.trim().isEmpty())
                && (address != null && !address.trim().isEmpty()) && (phone != null && !phone.trim().isEmpty()) &&
                  (gender != null && !gender.trim().isEmpty());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
