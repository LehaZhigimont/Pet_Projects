package by.test.models;

import javax.validation.constraints.*;

public class Person {
    private int id;
    @NotEmpty(message = "Name should not be empty!")
    @Size(min = 4, max= 15, message = "Name should be between 4 and 15 characters")
    private String name;
    @Min(value=8, message = "Age should be greater than 8 and 90")
    @Max(value = 110)
    private int age;
    @NotEmpty(message = "E-mail should not be empty!")
    @Email(message = "E-mail should be valid")
    private String email;

    public Person(){
    }

    public Person(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
