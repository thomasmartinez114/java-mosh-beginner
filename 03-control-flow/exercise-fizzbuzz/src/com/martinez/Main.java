package com.martinez;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // enter a number
        // if number is diviisble by 5 = Fizz
        // if number is divisible by 3 = buzz
        // if number is divisible by 3 or 5 = Fizzbuzz
        // if number isn't divisible by either get the number back

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("Fizzbuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("buzz");
        else
            System.out.println(number);
    }
}
