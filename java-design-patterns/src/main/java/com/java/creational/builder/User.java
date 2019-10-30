package com.java.creational.builder;

public class User {
    // mandatory fields
    private final String firstName;
    private final String lastName;

    private String email;
    private int age;

    public User(UserBuilder userBuilder) {
        this.firstName = userBuilder.getFirstName();
        this.lastName = userBuilder.getLastName();
        this.email = userBuilder.getEmail();
        this.age = userBuilder.getAge();
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
