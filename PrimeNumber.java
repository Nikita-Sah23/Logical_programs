package com.logicalProblems;

import java.util.Scanner;

public class PrimeNumber 
{

	public static void main(String[] args)
	 {
		System.out.println("Welcome To Prime Number");

		System.out.print("Enter positive number grater than 1 : ");
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		if (number < 0) number = -number;
		System.out.println("You enterd "+number);
	
		boolean isPrime;               // Check is prime or not
		
		if (number > 1)
		{
			isPrime = true;
			for (int divisor = 2; divisor <= number / 2; divisor++) 
				if (number % divisor == 0)
				{
					isPrime = false;
					break;
				}
		 } 
		else isPrime = false;
		{
		// Show it is prime number or not
		if (isPrime) System.out.println(number+" is prime number");
		
		else System.out.println(number+" is not prime number");
	    }
		scanner.close();
	}

}

