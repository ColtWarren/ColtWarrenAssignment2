package com.coderscampus;

import java.util.Scanner;
import java.util.Random;

public class Assignment2Application {

	public static void main(String[] args) {
		
		// Colt's Assignment2
		int maxAttempts = 5;
		int attempt = 0;
		
		Random random = new Random(); 
		int theRandomNumber = random.nextInt(100) + 1; 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Pick a number between 1 and 100!");  
		
		while (attempt < maxAttempts) {
			int userInput = scanner.nextInt();
			attempt++;
	        
			
	        if (userInput < 1 || userInput > 100) {
		       System.out.println("Your guess is not between 1 and 100, please try again!");	    
		       continue;
	        }  
	        
	        if (userInput == theRandomNumber) {
 		       System.out.println("You win!");
 		       break;
	        } 
	        
	        else if (userInput < theRandomNumber) {
 	           System.out.println("Please pick a higher number!");
 	        } 
	        
	        else if (userInput > theRandomNumber) {
 		       System.out.println("Please pick a lower number!");
 	        } 
	        
	        if (attempt == maxAttempts) {  
	 	           System.out.println("You lose! The number to guess was: " + theRandomNumber);
	 	    }
		 
		}
		
		
		scanner.close(); 
      
	}

}
