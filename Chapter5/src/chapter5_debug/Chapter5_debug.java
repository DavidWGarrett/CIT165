/*
 * David Garrett
 * Chapter 5, Lab 2
 * 10-2-2022
 */

package chapter5_debug;

import java.util.Scanner;

/*
 * On line ##, sum was initialized to 0. sum variable was used with an augmented operator on line ##, but caused
 * an compiler error due to not being initialized yet.
 * 
 * On line ##, changed the number 0 to currentValue. The sum variable is intended to be used to find the average, so
 * it needs the value that the user inputed. Adding 0 to sum does not change the value.
 * 
 * On line ##, added an else statement along with encompassing the ++numberOfNegativeInts; in curly brackets. Previously,
 * numberOfNegativeInts would iterate every cycle of the while loop regardless if the user inputed a negative number. Now,
 * it will iterate only if a negative integer is typed in.
 * 
 * On line ##, typecasted sum to double from int. Previously, it would only show whole values since both average and sum
 * were integers. With sum typecasted to double, now any decimal values will not be truncated.
 */

public class Chapter5_debug 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int sum = 0; // Initialized to 0
		int numberOfInts = 0;
		int numberOfPositiveInts = 0;
		int numberOfNegativeInts = 0;
		int currentValue;
		double average;
		
		System.out.print("Enter an integer, the input ends if it is 0: ");
		currentValue = input.nextInt();
		while(currentValue != 0)
		{
			sum += currentValue; // Changed 0 to currentValue
			++numberOfInts;
			
			if(currentValue > 0)
			{
				++numberOfPositiveInts;
			}
			else // Added else statement which now encompasses "++numberOfNegativeInts;"
			{
				++numberOfNegativeInts;
			}
			System.out.print("Enter an integer, the input ends if it is 0: ");
			currentValue = input.nextInt();
		}
		
		if(numberOfInts == 0)
		{
			System.out.println("No values were entered!");
		}
		else
		{
            average = (double) sum / numberOfInts; // Typecasted sum to double
			System.out.printf("\nThe total number of integers is %d\n", numberOfInts);
			System.out.printf("The total number of positive integers is %d\n", numberOfPositiveInts);
			System.out.printf("The total number of negative integers is %d\n", numberOfNegativeInts);
			System.out.printf("The sum of integers entered is %d\n", sum);
			System.out.printf("The average is %.2f\n", average);
		}
	}
}
