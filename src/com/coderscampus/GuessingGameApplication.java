package com.coderscampus;

import java.util.Scanner;
import java.util.Random;

public class GuessingGameApplication {
	private static final int MAX_ATTEMPTS = 5;
	private static final int MIN_RANGE = 1;
	private static final int MAX_RANGE = 100;
	
	public static void main(String[] args) {
		int attempts = 0;

		Random random = new Random();
		int theRandomNumber = random.nextInt(MAX_RANGE) + 1;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("The random number is " + theRandomNumber);

		System.out.println("Pick a number between " + MIN_RANGE + " and " + MAX_RANGE + "!");

		while (attempts < MAX_ATTEMPTS) {
			int userInput = scanner.nextInt();

			if (userInput < MIN_RANGE || userInput > MAX_RANGE) {
				System.out.println("Your guess is not between " + MIN_RANGE + " and " + MAX_RANGE + ", please try again!");
				continue;
			}

			attempts++;

			if (userInput == theRandomNumber) {
			   	System.out.println("You win!");
			   	scanner.close();
				return;
			} else if (userInput < theRandomNumber) {
				System.out.println("Please pick a higher number!");
			} else {
				System.out.println("Please pick a lower number!");
			}
		}
		System.out.println("You lose! The number to guess was: " + theRandomNumber);		
		scanner.close();
	}
}
