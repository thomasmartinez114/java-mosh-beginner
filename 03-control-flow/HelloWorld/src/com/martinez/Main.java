package com.martinez;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// While loops better when don't know how many times you want loop to run

		// Ask for user input until they input quit
		Scanner scanner = new Scanner(System.in);
		String input = "";
		while (!input.equals("quit")) {
			System.out.print("Input: ");
			input = scanner.next().toLowerCase();
			System.out.println(input);
		}

		do {
			System.out.print("Input: ");
			input = scanner.next().toLowerCase();
			System.out.println(input);
		} while (!input.equals("quit"));
    }
}

// while will not run if condition is false
// Do while will always execute atleast once