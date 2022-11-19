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
		
		// Initialize an array of object reference variables
		Loan[] loans = new Loan[NUMBER_OF_LOANS];
		
		// Increment through each element in the array
		for (int i = 0; i < Array.getLength(loans); i++)
		{
			// Instantiate new object in the array. 
			// createLoan method asks user to input information
			loans[i] = createLoan(i+1);
		}
		
		// Increment through each object in the array
		for (Loan loan : loans)
		{
			// Display loan information an
			loan.displayLoanDetails();
			loan.displayInterestPaid();
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
		
		// Instantiate object with the information user inputed 
		loan = new Loan(loanNumber, loanAmount, interestRate, loanLength);
		return loan;
	}

}
