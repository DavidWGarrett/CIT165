package chapter11;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		char storageType;
		int volume;	
		double[][] prices = {{4, 9, 20},
				             {8, 18, 50},
				             {20, 60, 200}};
		
		System.out.println("Testing a couple of storedItem objects");
		for (int i = 0; i < 3; i++)
		{
			boolean security = false;
			testItems(prices, security);
		}
		

	}
	
	public static void testItems(double prices[][], boolean security)
	{
		Scanner input = new Scanner(System.in);
		char storage;
		int volume;
		
		System.out.print("What type of Storage is required? ");
		storage = input.next().charAt(0);
		System.out.print("How many cubic meters of storage is required?" );
		volume = input.nextInt();
		
		if (security)
		{
			
		}
		
		else
		{
			StoredItem item = new StoredItem(storage, volume, prices);
			item.calculateCost();
			System.out.println(item);
			System.out.println();
			item = null;
		}
		
	}

}
