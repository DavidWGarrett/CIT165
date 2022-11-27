package chapter11;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) 
	{
		int[][] prices = {{4, 9, 20},
				          {8, 18, 50},
				          {20, 60, 200}};
		
		int[] securityPrices = {50, 20, 20};
		
		boolean security = false;
		
		System.out.println("Testing a couple of storedItem objects");
		for (int i = 0; i < 3; i++)
		{
			testItems(prices, securityPrices, security);
		}
		
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
		
		System.out.print("What type of Storage is required? ");
		storage = input.next().charAt(0);
		System.out.print("How many cubic meters of storage is required? ");
		volume = input.nextInt();
		
		StoredItem item;
		
		if (security)
		{
			item = new secureStoredItem(storage, volume, prices, securityPrices);
		}
		else
		{
			item = new StoredItem(storage, volume, prices);
		}
		
		item.calculateCost();
		System.out.println(item);
		System.out.println();
		
		item = null;
	}
}
