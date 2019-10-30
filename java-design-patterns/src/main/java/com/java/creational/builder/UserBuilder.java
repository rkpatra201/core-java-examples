package com.java.creational.builder;

public class UserBuilder {
    // mandatory fields
    private final String firstName;
    private final String lastName;

    private String email;
    private int age;

    public UserBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // special setters : because setters usually has void return type.
    // but here setters have return type of the current object.
    // we only set the fields which has not been sent by constructor.

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    // build method: this method creates a the object of another class.
    public User build()
    {
        User user = new User(this);
        return user;
    }

    // getters only
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
}
