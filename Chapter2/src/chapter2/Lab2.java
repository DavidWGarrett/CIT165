/*
 * David Garrett
 * Chapter 2 Lab 2
 * September 13th, 2022
 */

/*
 * This lab asks a user how many dollar the user has and displays the
 * optimal amount of each dollar the user could carry
 */

package chapter2;
import java.util.Scanner; // Import scanner class. Allows to get user input

public class Lab2 {
	
	// Constants used for calculations of optimal amount of each dollar
	static final int TWENTY_DOLLARS = 20, TEN_DOLLARS = 10, FIVE_DOLLARS = 5;
	
	public static void main(String[] args)
	{
		int money, twentyBills, tenBills, fiveBills, oneBills, leftover;
		Scanner input = new Scanner(System.in); // Create scanner object
		
		// Ask user to input amount of dollars, must be an integer
		System.out.print("Enter the amount of dollars you have: ");
		money = input.nextInt(); //
		
		// Calculations. Division finds the optimal amount of each bill
		// Division truncates the decimal portion off since both values are integers
		twentyBills = money / TWENTY_DOLLARS;
		
		// Modulus operator finds how much money is leftover after
		leftover = money % TWENTY_DOLLARS;
		
		// Steps repeated for ten and five dollar bills
		// At the end of process, the leftover equals the amount of one dollar bills
		tenBills = leftover / TEN_DOLLARS;
		leftover %= TEN_DOLLARS;

		fiveBills = leftover / FIVE_DOLLARS;
		oneBills = leftover %= FIVE_DOLLARS;
		
		// Print out message telling user the optimal amount of each bills the user could have
		System.out.println("\nThe optimal way to carry your cash is to carry:\n" + twentyBills + 
					       " twenty dollar bill(s)\n" + tenBills + " ten dollar bill(s)\n" + fiveBills + 
					       " five dollar bill(s)\n" + oneBills + " one dollar bill(s)");
		
		input.close(); // Closes scanner
	}
}
