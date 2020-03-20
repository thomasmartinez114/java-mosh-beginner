package com.martinez;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// While loops better when don't know how many times you want loop to run

		// Ask for user input until they input quit
		Scanner scanner = new Scanner(System.in);
		String input = "";
		while (true) {
			System.out.print("Input: ");
			input = scanner.next().toLowerCase();
			if (input.equals("pass"))
				continue;
			if (input.equals("quit"))
				break;
			System.out.println(input);
		}
    }
}