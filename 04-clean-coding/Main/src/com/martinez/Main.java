package com.martinez;

public class Main {

    public static void main(String[] args) {
	    String message = greetUser("Thomas", "Martinez");
    }

    public static String greetUser(String firstName, String lastName) {
       return "Hello " + firstName + " " + lastName;
    }
}
