/*
 * David Garrett
 * Chapter 10 Lab 1
 * 11-18-22
 */

package chapter10;

import java.lang.reflect.Array;
import java.util.Scanner;

/* 
 * Program creates an array of three loan objects. Ask user to input the loan amount,
 * interest rate, and length of loan for each loan. Then program wil display the loan
 * amount, interest rate, length of loan, monthly payment, and the total interest if
 * only a minimum payment is paid for each loan object
 */

public class Lab1 {

	final static int NUMBER_OF_LOANS = 3;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		// Initialize an array of objects
		Loan[] loans = new Loan[NUMBER_OF_LOANS];
		
		// Increment through each object in the array
		for (int i = 0; i < Array.getLength(loans); i++)
		{
			
			double loanAmount;
			double interestRate;
			int loanLength;
			
			// Ask user to input loan amount, interest rate, and length of loan
			System.out.printf("Loan %d\n", i+1);
			System.out.print("Loan Amount    : ");
			loanAmount = input.nextDouble();
			System.out.print("Interest Rate  : ");
			interestRate = input.nextDouble();
			System.out.print("Length of Loan : ");
			loanLength = input.nextInt();
			System.out.print("\n");
			

			// Initialize object with the information user inputed 
			loans[i] = new Loan(i+1, loanAmount, interestRate, loanLength);
		}
		
		// Increment through each object in the array
		for (int i = 0; i < Array.getLength(loans); i++)
		{
			// Display loan information an
			
			loans[i].displayLoanDetails();
			loans[i].displayInterestPaid();
		}
	}
	
	public static Loan createLoan(int loanNumber)
	{
		double loanAmount;
		double interestRate;
		int loanLength;
		Loan loan;
		
		Scanner input = new Scanner(System.in);
		
		// Ask user to input loan amount, interest rate, and length of loan
		System.out.printf("Loan %d\n", loanNumber);
		System.out.print("Loan Amount    : ");
		loanAmount = input.nextDouble();
		System.out.print("Interest Rate  : ");
		interestRate = input.nextDouble();
		System.out.print("Length of Loan : ");
		loanLength = input.nextInt();
		System.out.print("\n");
		
		input.close();
		
		// Initialize object with the information user inputed 
		loan = new Loan(loanNumber, loanAmount, interestRate, loanLength);
		return loan;
	}

}
