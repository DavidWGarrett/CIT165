/*
 * David Garrett
 * Chapter 10 Lab 1
 * 11-18-22
 */

package chapter10;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		Loan[] loans = new Loan[3];
		for (int i = 0; i < Array.getLength(loans); i++)
		{
			double loanAmount;
			double interestRate;
			int loanLength;
			
			System.out.printf("Loan %d\n", i+1);
			System.out.print("Loan Amount    : ");
			loanAmount = input.nextDouble();
			System.out.print("Interest Rate  : ");
			interestRate = input.nextDouble();
			System.out.print("Length of Loan : ");
			loanLength = input.nextInt();
			System.out.print("\n");

			loans[i] = new Loan(i+1, loanAmount, interestRate, loanLength);
		}
		
		for (int i = 0; i < Array.getLength(loans); i++)
		{
			loans[i].displayLoanDetails();
			loans[i].displayInterestPaid();
		}
	}

}
