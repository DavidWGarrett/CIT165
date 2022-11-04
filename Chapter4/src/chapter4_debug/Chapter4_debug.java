/*
 * David Garrett
 * Chapter 4, Lab 2
 * 10-2-2022
 */

/*
 * Program determines if a phone number typed in by user has proper formatting.
 * 
 * Three problems in the code.
 * 
 * 1. On line 45, Added a semicolon to terminate the statement
 *
 * 2. On line 61, the '-' and 3 values were switched places. 
 *
 * The data type of 3 is an integer, so phoneNumber.indexOf(3) always returns a -1 since it cannot 
 * find an integer data type within a string even if the user types in 3. Since -1 == '-' will always 
 * return a false, the program will output that the number inputed is invalid.
 *
 * The program intends to find the index value of the hyphen, so if the hyphen is in the proper place, 
 * then phoneNumber.indexOf('-') will return a 3 and enter the true branch of the if statement.
 * 
 * 3. On line 67, phoneNumber.substring(0,4) was changed to phoneNumber.substring(0,3).
 *
 * The intention of this statement is to concatenate a new string that includes all the numbers 
 * inputed and exclude the hyphen. Afterwards, the characters in the new string gets tested to 
 * see if all characters are numbers or the program says it is an invalid input.
 *
 * Previously, phoneNumber.substring(0,4) will return a string with the characters at index 0 to 3. 
 * Since it was previously proven that the hyphen will have an index of 3, method needs to be 
 * rewritten as substring(0,3) to only return the characters from index 0 to 2. Now, the program 
 * won't automatically output that the number is invalid.
 * 
 * Side note: There's several lines of codes that are unnecessary. validNumber was already initialized 
 * to false on line 52, so the statement on line 60 and 90 is redundant. Also, validNumber was initialized
 * to true on line 67, so line 81 is redundant.
 */

package chapter4_debug;

import java.util.Scanner;

public class Chapter4_debug
{

	public static void main(String[] args)
	{
		// This program determines if a phone number has been entered in the correct format
		Scanner in = new Scanner(System.in); // Added semicolon
		String phoneNumber;
		String processing;
		boolean validNumber = false;
		
		System.out.print("Enter in a phone number in the format ###-####: ");
		phoneNumber = in.nextLine();
		
		// Test the length of the entered data
		if(phoneNumber.length() != 8)
		{
			validNumber = false;
		}
		else
		{
			// Make sure the hyphen is at the correct location
			if(phoneNumber.indexOf('-') == 3) // Switched places of '-' and 3
			{
				validNumber = true;
				
				// Remove the hyphen then test the numbers
				// Changed end index value from 4 to 3 in first substring method
				processing = phoneNumber.substring(0,3) + phoneNumber.substring(4);
				
				if (Character.isDigit(processing.charAt(0)) &&
					Character.isDigit(processing.charAt(1)) &&
					Character.isDigit(processing.charAt(2)) &&
					Character.isDigit(processing.charAt(3)) &&
					Character.isDigit(processing.charAt(4)) &&
					Character.isDigit(processing.charAt(5)) &&
					Character.isDigit(processing.charAt(6)))
				{
					validNumber = true;
				}
				else
				{
					validNumber = false;
				}
			}
			else
			{
				validNumber = false;
			}	
		}
		
		// Print the result
		if(validNumber)
		{
			System.out.println("The number " + phoneNumber + " is valid!");
		}
		else
		{
			System.out.println("The number " + phoneNumber + " is NOT valid!");			
		}
	}
}
