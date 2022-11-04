/*
 * David Garrett
 * Chapter 5 Lab 1
 * 10-2-2022
 */

package chapter5;
import java.util.Scanner;

/*
 * Program finds the growth of a bug colony and prints out the growth for each day. User types in
 * the initial number of bugs, percentage growth each day, and the number days. User must type in at
 * least two bugs, one day, and non-negative percentage or the program will keep asking user to type
 * in numbers.
 */

public class Lab1 
{
	public static void main(String[] args)
	{
		// Initialized values to 0 for while loop.

		int bugs = 0, days = 0, percentage = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("*** Bug Population Growth ***\n");
		
		// User must type in appropriate amount of bugs, percentage, and days.
		// If not, loop will print errors and ask user to retype values in.
		
		while (!(bugs >= 2 && percentage >= 0 && days >= 1))
		{	
			System.out.print("How many bugs are present on day 0? ");
			bugs = input.nextInt();
			
			System.out.print("What percentage of daily bug growth is expected? ");
			percentage = input.nextInt();
			
			System.out.print("How many days will the simulation run? ");
			days = input.nextInt();
			
			// Determine which error messages print if user did not type in appropriate numbers
			
			if (!(bugs >= 2 && percentage >= 0 && days >= 1))
			{
				System.out.println("\nInput error:");
				
				if (!(bugs >= 2))
				{
					System.out.println("There must be 2 or more bugs on day 0");
				}
				if (!(percentage >= 0))
				{
					System.out.println("The percentage of daily growth must be positive.");
				}
				if (!(days >= 1))
				{
					System.out.println("The simulation must run for at least 1 day.");
				}
				
				System.out.println("Try again!\n");	
			}
		}
		
		System.out.print("\n");
		
		// for loop calculate how many bugs are in the colony each day and prints that
		// number for each day. Calculations truncate decimal values since you cannot
		// have a fraction of a bug.
		
		for (int i = 0; i < days; ++i)
		{
			bugs += (int) (bugs * percentage * 0.01);
			
			System.out.printf("On day %d there will be %,d bugs.\n", i+1, bugs);
		}
		input.close();
	}
}
