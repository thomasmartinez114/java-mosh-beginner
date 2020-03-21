package com.martinez;

public class Main {

    public static void main(String[] args) {
	    greetUser("Thomas", "Martinez");
	    greetUser("Jayar", "Amaro");
    }

    public static void greetUser(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
