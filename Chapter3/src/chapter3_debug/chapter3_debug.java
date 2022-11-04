/*
 * David Garrett
 * Chapter 3, Lab 2
 * 9-20-2022
 */

/*
 * The following code is suppose to take three integers from the user
 * and output the largest integer.
 * 
 * The code had three mistakes.
 * 
 * 1. The code was missing the main method, so it could not execute the program.
 * Added "public static void main(String[] args)" to line 33 and the appropriate
 * curly brackets to line 34 and 62
 * 
 * 2. On line 46, the variable value2 was mistakenly written as value1. 
 * When the user intends to input the second value in, the value1 gets reinitialized 
 * while value2 remains initialized to 0
 * 
 * 3. On line 56, the else keyword was removed. The if part of the statement was
 * intended to be evaluated regardless of the decision of the if statement on line 52.
 * When the else keyword is included, value3 never gets tested if it is the biggest
 * integer whenever value2 is larger than value1.
 */

package chapter3_debug;

import java.util.Scanner;

public class chapter3_debug
{
	public static void main(String[] args) // Added this line and two curly brackets
	{
		
		// This program should display the largest of three values entered by a user
		Scanner in = new Scanner(System.in);
		int value1 = 0;
		int value2 = 0;
		int value3 = 0;
		int largest = 0;
		
		System.out.print("Enter the first value : ");
		value1 = in.nextInt();
		System.out.print("Enter the second value: ");
		value2 = in.nextInt(); // value1 changed to value2
		System.out.print("Enter the third value : ");
		value3 = in.nextInt();
		
		largest = value1;
		
		if (value2 > largest)
		{
			largest = value2;
		}
		if (value3 > largest) // Removed else
		{
			largest = value3;
		}
		
		System.out.println("\nThe largest value entered was " + largest);
	}
}
