/*
 * David Garrett
 * Chapter 12 Lab 1
 * 12-8-22
 */

package chapter12;
import java.util.Scanner;
import java.io.*;

// Program ask user for the name of a text file and whether or not they want to read or write to it
// If read, will read the contents of file and print out the name and phone number of friend
// If write, will create the file and save the name of your friend and phone number to file

// Included a file called "file.txt" to read from

public class Lab1 
{
	public static void main(String[] args)
	{	
		Scanner input = new Scanner(System.in);
		String fileName;
		char fileOperation;
		
		// Included a file called "file.txt"
		// User types in file name
		fileName = inputFileName();
		
		
		// User must type in 'r' or 'w' for read or write to exit loop
		do
		{
			System.out.print("Are you going to (r)ead the file or (w)rite to the file? ");
			fileOperation = input.next().charAt(0);
		} while (fileOperation != 'r' && fileOperation != 'w');
		
		
		if (fileOperation == 'r')
		{
			// use scanner to read data from file
			readFile(fileName);
		}
		
		else if (fileOperation == 'w')
		{
			// use PrinterWriter to write data to the file
			writeFile(fileName);
		}
	}
	
	public static String inputFileName()
	{
		String fileName;
		Scanner input = new Scanner(System.in);
		
		// If there is an exception, the program ask user to retype the name of the text file till 
		// user successfully does. Afterwards, the break command allows the program to exit the do-while loop
		do
		{
			System.out.print("What is the name of the file you wish to work with? ");
			
			try
			{
				fileName = input.next();
				break;
			}
			catch (Exception e)
			{
				System.out.println("\nInvalid input, try again");
			}
		} while(true);
		
		// fileName used for readFile and writeFile method
		return fileName;
	}
	
	public static void readFile(String fileName)
	{
		String firstName, lastName, phoneNumber;
		Scanner input;
		
		// Program will try to open the file that the user specifies
		// After opening the file, will retrieve the first name, last name, and phone number
		// the text in the file should be in the format of "Jack Bob 111-111-1111"
		try 
		{
			input = new Scanner(new File(fileName));
			
			firstName = input.next();
			lastName = input.next();
			phoneNumber = input.next();
			
			System.out.printf("Your friend's name is %s %s and their phone number is %s",
					firstName, lastName, phoneNumber);
		} 
		
		// If file isn't found, program gives an exit statement and closes
		catch (FileNotFoundException e) 
		{
			System.out.printf("The file %s was not found.\nPlease restart the program"
					          + " and try again.", fileName);
		}		
	}
	
	public static void writeFile(String fileName)
	{
		Scanner input = new Scanner(System.in);
		String name, phoneNumber;
		
		// Ask user to type in friend's name and number
		System.out.print("What is your friend's name  ? ");
		name = input.nextLine();
		System.out.print("What is your friend's number? ");
		phoneNumber = input.nextLine();
		
		// try and creates PrintWriter object that will create a text file which includes the contents
		// in the printf statement. Will also close the file automatically
		try (PrintWriter output = new PrintWriter(fileName);) 
		{
			output.printf("Your friend's name is %s and their phone number is %s",
					name, phoneNumber);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
	}
}
