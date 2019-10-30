package com.java.creational.builder;

public class UserBuilderMain {
    public static void main(String[] args) {
        UserBuilder userBuilder = new UserBuilder("john","doe");
        userBuilder.setAge(20).setEmail("john.doe@gmail.com");

        User user = userBuilder.build();
        System.out.println(user);

    }
}
