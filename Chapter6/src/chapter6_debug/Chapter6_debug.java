/*
 * David Garrett
 * Chapter 6, Lab 2 Debug
 * 10-13-22
 */

package chapter6_debug;

import java.util.Scanner;

/*
 * Line ## & ##, removed initialization to 0. Unnecessary.
 * 
 * Line ##, added "result = " before "sumTheDigits(inputValue)." When sumTheDigits returns a value, the
 * value will not be initialized to result inside of the main method and can be used later.
 * 
 * Line ##, moved below "result = sumTheDigits(inputValue);". Now, the program will print out the actual
 * user's input and the results of the calculation.
 * 
 * Line ##, changed from currentDigit to sum. The method is intended to return the value of all the
 * digits rather than 0.
 */

public class Chapter6_debug
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int inputValue; // Removed initialization to 0
		int result; // Removed initialization to 0
		
		System.out.println("This program will deconstruct an integer into individual digits and then sum those digits together!");
		System.out.print("\nEnter the integer to deconstruct and sum: ");
		inputValue = input.nextInt();
		
		result = sumTheDigits(inputValue); // Added "result = " before "sumTheDigits(inputValue)"
		
		// Moved this line below previous line
		System.out.printf("\nThe sum of the digits in the integer %d is %d", inputValue, result);
	}
	
	public static int sumTheDigits(int digitsToSum)
	{
		int currentDigit;
		int sum = 0;
		
		currentDigit = digitsToSum % 10;
		while(digitsToSum > 0)
		{
			sum += currentDigit;
			digitsToSum /= 10;
			currentDigit = digitsToSum % 10;
		}
		return sum; // Changed from currentDigit to sum
	}
}