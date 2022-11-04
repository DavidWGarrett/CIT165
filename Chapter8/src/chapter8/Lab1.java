package chapter8;

import java.util.Scanner;

public class Lab1 
{
	final static int CAR_COMPANY = 3;
	final static int DEALERS = 4;
	final static int FORD = 0;
	final static int CHEVY = 1;
	final static int DODGE = 2;
	
	public static void main(String[] arg)
	{
		//int[][] carCount = new int[CAR_COMPANY][DEALERS];
		
		int carCount[][] = inputInventory();
		printInventory(carCount);
	}
	
	public static int[][] inputInventory()
	{
		Scanner input = new Scanner(System.in);
		int[][] array = new int[CAR_COMPANY][DEALERS];
		String company;
		
		for (int i = 0; i < array.length; ++i)
		{
			company = inventoryMessage(i);
			System.out.printf("%s inventory%n", company);
			
			for (int j = 0; j < array[i].length; ++j)
			{
				System.out.printf("%ss at dealer %d: ", company, j);
				array[i][j] = input.nextInt();
			}
		}
		
		input.close();
		return array;
	}
	
	public static String inventoryMessage(int companyNumber)
	{
		String company = "";
		
		if (companyNumber == FORD)
		{
			company = "Ford";
		}
		else if (companyNumber == CHEVY)
		{
			company = "Chevy";
		}
		else if (companyNumber == DODGE)
		{
			company = "Dodge";
		}
		
		return company;
	}
	
	public static void printInventory(int[][] inventory)
	{
		String company;
		
		System.out.printf("%n%5s%16s%16s%16s%16s", 
				          "","Dealer 1", "Dealer 2", "Dealer 3", "Dealer 4");
		
		for (int i = 0; i < inventory.length; ++i)
		{
			company = inventoryMessage(i);
			System.out.printf("%n%-5s", company);
			
			for (int j = 0; j < inventory[i].length; ++j)
			{
				System.out.printf("%16d", inventory[i][j]);
			}
		}
		
	}

}
