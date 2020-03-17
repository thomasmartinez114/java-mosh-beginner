package com.martinez;

public class Main {

	public static void main(String[] args) {
		String role = "admin";
		if (role == "admin")
			System.out.println("You are an admin");
		else if (role == "moderator")
			System.out.println("You are a moderator");
		else
			System.out.println("You are a guest");
    }
}
