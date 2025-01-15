package com.coderscampus;

import java.util.Scanner;
import java.util.Random;

public class Assignment2Application {

	public static void main(String[] args) {
		
		// Colt's Assignment2
		// Creating objects for random number generator
		Scanner scanner = new Scanner(System.in);
		Random random = new Random(); 
		boolean playAgain = true;
		
		// My apologies for turning this in so late in the program(November 8th cohort) and
		// I still need to update my Assignment1! I will do that a.s.a.p. So, please explain anything
		// to make this a more of modern and strong running code. Thank you and blessings! 
		// I began this assignment with Trevor's lessons, a few java reference books, and also AI.
		// It did't seem necessary to call in any variables from another class. Is that correct?
		// I was going for a nice and neat nested-in method and passing everything in!
		
		// Generator for random number 1 and 100
		while (playAgain) {
             int theRandomNumber = random.nextInt(100) + 1;
		     int maxAttempts = 5;
		     boolean wonGame = false;
		
		     // Initial output & welcome message
		     System.out.println("Welcome To The Higher / Lower Guessing Game!");
		     System.out.println("Please, pick a number between 1 and 100!");
		     System.out.println("You have five attempts to guess it!");
		
             // loop for 5 attempts 
		     for (int attempt = 1; attempt <= maxAttempts; attempt++) {
			 System.out.print("Attempt: " + attempt + "/" + maxAttempts + ". Enter your guess:");
			
		         // Checking if input is a valid 
	             if (scanner.hasNextInt()) {
	    	        int guess = scanner.nextInt();
	    	   
	    	        // Checking if guess is in valid range
	    	        if (guess < 1 || guess > 100) {
	    		       System.out.println("Your guess is not between 1 and 100, please try again!");
	    		       attempt--;
	    		       continue;	    	 
	               }   
	    	        
	    	        // Checking if guess is correct
	    	        if (guess == theRandomNumber) {
	    		       System.out.println("\nYou win! You've guessed the number " + theRandomNumber + " correctly!");
	    		       System.out.println("It took you " + attempt + " attempts!");
	    		       wonGame = true;
	    		       break;
	    	       } else if (guess < theRandomNumber) {
	    		       System.out.println("Please pick a higher number!");
	    	       } else if (guess > theRandomNumber) {
	    		       System.out.println("Please pick a lower number!");
	    	       }
	    	   
	    	       // Remaining attempts
	    	       if (attempt < maxAttempts) {
	    		      System.out.println("You have " + (maxAttempts - attempt) + " attempts left.\n");
	    	       }
	      
	               }  else  {
	            	   
	    	          // Invalid input 
	    	          System.out.println("Please pick a valid number! \n");
	    	          scanner.next(); // clearing invalid input
	    	          attempt--;
	              }
				
		    }
		           // Game over message if player didn't win
		         if (!wonGame ) {
  		             System.out.println("\nYou lose, the number to guess was " + theRandomNumber + "!");
  		             System.out.println("Better luck next time!");
		         }
		      
		         // A 100% AI try/catch! It made it a lot more fun! I tried a while loop with a yes/no option. But, this made it smoother.
		       try {
			       Thread.sleep(2000);
		       } catch (InterruptedException e) {
			           e.printStackTrace();
		       }
		  
		 
		}
		       // Close the scanner
		       scanner.close();

	}

}
