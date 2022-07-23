package com.exceptionhandlingrevision;

public class TestThrow1 {

	public static void validate(int age) {

		if (age < 18) {

			throw new ArithmeticException("Not eligible for vote");

		} else {

			System.out.println("eligible for vote");

		}
	}

	public static void main(String[] args) {

		validate(13);
		System.out.println("rest of the code");
	}
}
