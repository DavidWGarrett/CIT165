/*
 * David Garrett
 * Chapter 8 Lab 1
 * 11-4-22 
 */

package chapter8;

import java.util.Scanner;

/*
 * User inputs the number of fords, chevys, and dodges at four different dealers into a multidimensional array.
 * Afterwards, a formated table of the numbers typed in is printed out. Nested loops are used to help print out the
 * values inside of the multidimensional array 
 */

public class Lab1 
{
	// Used to initialize the array
	final static int CAR_COMPANY = 3;
	final static int DEALERS = 4;
	
	// Values correspond to their row index in multidimensional array
	final static int FORD = 0;
	final static int CHEVY = 1;
	final static int DODGE = 2;
	
	public static void main(String[] arg)
	{	
		int carCount[][] = inputInventory();
		printInventory(carCount);
	}
	
	public static int[][] inputInventory()
	{
		// User inputs inventory of dealers
		
		Scanner input = new Scanner(System.in);
		int[][] array = new int[CAR_COMPANY][DEALERS];
		String company;
		
		// Two for loops iterate through multidimensional array
		for (int i = 0; i < array.length; ++i)
		{
			// Row index is passed to determine which car company
			company = inventoryMessage(i);
			System.out.printf("%s inventory%n", company);
			
			// User inputs inventory at each dealer for each kind of car
			for (int j = 0; j < array[i].length; ++j)
			{
				System.out.printf("%ss at dealer %d: ", company, j+1);
				array[i][j] = input.nextInt();
			}
		}
		
		input.close();
		return array;
	}
	
	public static void printInventory(int[][] inventory)
	{
		// Print formated table of inventory
		
		String company;
		
		// First line of the formated table
		System.out.printf("%n%5s%11s%17s%17s%17s", 
				          "","Dealer 1", "Dealer 2", "Dealer 3", "Dealer 4");
		
		// Two for loops iterate through multidimensional array
		// Prints the appropriate values for the formated table
		for (int i = 0; i < inventory.length; ++i)
		{
			company = inventoryMessage(i); // For printf statements
			System.out.printf("%n%-5s", company);
			
			for (int j = 0; j < inventory[i].length; ++j)
				if (j == 0)
					System.out.printf("%11d", inventory[i][j]);
				else
					System.out.printf("%17d", inventory[i][j]);
		}
	}
	
	public static String inventoryMessage(int companyNumber)
	{
		// For printf statements
		// When processing multidimensional arrays, the row index value is passed
		// to this method. A string of the car company that corresponds with the row
		// index value is returned.
		
		String company = "";
		
		if (companyNumber == FORD)
			company = "Ford";
		
		else if (companyNumber == CHEVY)
			company = "Chevy";
		
		else if (companyNumber == DODGE)
			company = "Dodge";
		
		return company;
	}
}
