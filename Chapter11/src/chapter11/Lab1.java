/*
 * David Garrett
 * Chapter 11 Lab 1
 * 12-4-22
 */

package chapter11;

import java.util.Scanner;

/*
 * Program creates three storedItem and three securedStoredItem objects.
 * User inputs information about the objects
 * Program prints the prices of the object based on what the user inputs
 */

public class Lab1 {

	public static void main(String[] args) 
	{
		// two-dimensional array of prices
		int[][] prices = {{4, 9, 20},
				          {8, 18, 50},
				          {20, 60, 200}};
		
		// additional security prices
		int[] securityPrices = {50, 20, 20};
		
		// first three objects instantiated without security(storedItem)
		boolean security = false;
		
		System.out.println("Testing a couple of storedItem objects");
		for (int i = 0; i < 3; i++)
		{
			testItems(prices, securityPrices, security);
		}
		
		// Next three objects instantiated with security(secureStoredItem)
		security = true;
		
		System.out.println("Testing a couple of secureStoredItem objects");
		for (int i = 0; i < 3; i++)
		{
			testItems(prices, securityPrices, security);
		}

	}
	
	public static void testItems(int prices[][], int securityPrices[], boolean security)
	{
		Scanner input = new Scanner(System.in);
		char storage;
		int volume;
		
		// Finds storage type and volume
		System.out.print("What type of Storage is required? ");
		storage = input.next().charAt(0);
		System.out.print("How many cubic meters of storage is required? ");
		volume = input.nextInt();
		
		// Declares object
		StoredItem item;
		
		// Different kind of object instantiated based of it security was specified or not
		if (security)
		{
			// Example of polymorphism
			item = new secureStoredItem(storage, volume, prices, securityPrices);
		}
		else
		{
			item = new StoredItem(storage, volume, prices);
		}
		
		// Calculate cost
		item.calculateCost();
		
		// Prints string representation of object
		System.out.println(item);
		System.out.println();
		
		// item no longer points to address
		item = null;
	}
}
