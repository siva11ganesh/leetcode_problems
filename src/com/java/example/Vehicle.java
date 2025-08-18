package com.java.example;

public sealed interface Vehicle permits Car, Motorcycle {

	void start();

	void stop();
}
