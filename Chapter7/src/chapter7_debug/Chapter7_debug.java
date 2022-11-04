/* David Garrett
 * Chapter 7, Lab 2 Debug
 * 10-22-22
 */

package chapter7_debug;
import java.util.Scanner;

/*
 * Line 37, changed from 0 to i. Only the first element of the prices array was being initialized.
 * 
 * Line 40, moved averagePrice was moved out of for loop since averagePrice only needs to be initialized
 * once after totalPrice and numOfPrices reached their final value
 * 
 * Line 43, switched numberOfPrices and prices to match the positioning of the formal parameters of
 * belowAverage method
 */

public class Chapter7_debug
{
	public static void main(String[] args)
	{
		int numberOfPrices, belowAveragePrices;
		double[] prices;
		// Initialized averagePrice to 0.0
		double currentPrice, averagePrice, totalPrice = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of prices you wish to enter: ");
		numberOfPrices = input.nextInt();
		prices = new double[numberOfPrices];
		
		for(int i = 0;i < numberOfPrices;++i)
		{
			System.out.printf("Enter price %d: ", (i + 1));
			currentPrice = input.nextDouble();
			prices[i] = currentPrice; // Changed 0 to i
			totalPrice += currentPrice;
		}
		averagePrice = totalPrice / numberOfPrices; // Moved out of for loop
		
		// Switched numberofPrices and prices
		belowAveragePrices = belowAverage(numberOfPrices, prices, averagePrice);
		
		System.out.printf("\nYou entered a total of %d prices.\n", numberOfPrices);
		System.out.printf("The total of all prices entered was $%.2f and the average price was $%.2f.\n", totalPrice, averagePrice);
		System.out.printf("Of the prices entered %d were below the average price of $%.2f.\n", belowAveragePrices, averagePrice);
		
		input.close();
	}
	
	public static int belowAverage(int num, double[] array, double average)
	{
		int belowAverageCount = 0;
		
		for(int i = 0;i < num;++i)
		{
			if(array[i] < average)
			{
				++belowAverageCount;
			}
		}
		return belowAverageCount;
	}
}
