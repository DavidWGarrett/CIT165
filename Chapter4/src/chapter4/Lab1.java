/*
 * David Garrett
 * Chapter 4, Lab 2
 * 10-2-2022
 */

package chapter4;
import java.util.Scanner;

/*
 * Program will ask user to type in a password that is 8 to 12 characters long and does not contain password.
 * User will receive an error message if the password doesn't meet that standard. Afterwards, program will
 * ask user to re-enter the password and will tell the user if the password was re-entered correctly
 */

public class Lab1 
{
	public static void main(String[] args)
	{
		String password, reEnterPassword;
		
		// Both strings used for error message if user incorrectly enters password
		String errorMessage = "The password you have entered ";
		String errorMessageEnd = ", please try again!";
		boolean tooShort, tooLong, containsVowel;
		Scanner input = new Scanner(System.in); // Create scanner object
		
		System.out.print("Valid passwords must be between 8 and 12 characters long and must NOT " +
						 "contain any vowels (a,e,i,o, or u).\nEnter a password: ");
		
		password = input.next();
		
		// Sees if password is too short, too long, or contains vowel 
		// and stores true or false in boolean variable
		
		tooShort = password.length() < 8;
		tooLong = password.length() > 12;
		containsVowel = password.toLowerCase().contains("a") || password.toLowerCase().contains("e") || 
			            password.toLowerCase().contains("i") || password.toLowerCase().contains("o") || 
			            password.toLowerCase().contains("u");
		
		// Tests to see if password is too long or too short. Remakes error message if either is true
		
		if (tooShort)
			errorMessage += "is too short";
		
		if (tooLong)
			errorMessage += "is too long";
		
		// Tests to see if password contains a vowel. If it does, will add appropriate wording
		// to the error message. Wording slightly changes based on if the password was too long
		// or too short.
			
		if (containsVowel)
		{
			if (tooShort || tooLong)
				errorMessage += " and contains a vowel";
			else
				errorMessage += "contains a vowel";
		}
		
		// Adds ending to error message if password doesn't meet requirements
		
		if (tooShort || tooLong || containsVowel)
			errorMessage += errorMessageEnd;
		
		/* 
		 * Tests to see if errorMessage and errorMessageEnd has the same last character.
		 * It'll only have the same last character if errorMessage was modified due to 
		 * having a vowel or being too short or long. 
		 * 
		 * If errorMessage was modified, then program will print the error message. If it
		 * wasn't modified, then the password was acceptable
		 */
		
		if (errorMessage.endsWith(errorMessageEnd.charAt(errorMessageEnd.length() - 1) + ""))
			System.out.print(errorMessage);
		
		// Password was acceptable, ask user to re-enter the password and compares to see if 
		// passwords are the same. Program will tell user if passwords are same or not.
		
		else
		{
			System.out.print("Re-enter your password: ");
			reEnterPassword = input.next();
			
			if (password.contentEquals(reEnterPassword))
				System.out.print("Congratulations you have entered a valid password!");
			else
				System.out.print("You did not re-enter your password correctly");
		}	
		input.close();
	}
}