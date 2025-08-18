package com.java.example;

public class RecordObj {

	public static void main(String[] args) {
		Users users = new Users(1, "Siva", "Chennai");

		System.out.println(users.getClass());
		System.out.println(users.id());
		System.out.println(users.toString());
	}
}
