// David Garrett
// Chapter 7 Lab 1
// 10-22-22

package chapter7;

import java.util.Scanner;

// Program ask user to type in the name of their friends,
// prints out a list of the name of their friends, and
// lets the user type in the name of their friend and to do
// a search that'll see if their friend's name was typed in.

public class Chapter7 
{
	public static void main(String[] args) 
	{
		
		String[] friends = inputFriends(); // Input friends, store in array
		printFriends(friends); // Print the name of all the friends
		findFriend(friends); // Lets user do a search for friends
	}
	
	public static String[] inputFriends()
	{
		final String exit = "zzzz"; // Exit Statement
		final int LIMIT = 12; // Maximum of 12 friends
		int counter;
		String friend;
		String[] response = new String[LIMIT]; // First Array, 12 elements
		String[] friends; // Second Array. Needed to get a proper size array later
		
		Scanner input = new Scanner(System.in);
		
		// Iterates 12 times. Can exit if user types in "zzzz"
		for (counter = 0; counter < LIMIT; ++counter)
		{
			System.out.printf("Enter in the name of friend %d or zzzz to exit: ", counter + 1);
			
			// User inputs friend's name
			friend = input.nextLine();
			
			// Break if user types in "zzzz"
			if (friend.equalsIgnoreCase(exit))
				break;
			else
				// Stores friend name in array
				response[counter] = friend;
		}
		System.out.println();
		
		// New array initialized that is the exact size as the number of friends
		// Exact size needed later for the length method
		// Copy contents of previous array with 12 elements to new array
		friends = new String[counter];
		
		for (int i = 0; i < counter; ++i)
		{
			friends[i] = response[i];
		}
		
		// Return array of friend names
		return friends;
	}
	
	public static void printFriends(String[] friends)
	{
		// Print list of friends
		// for loop iterates through each element of the array
		System.out.println("Your friends are...");
		
		for (int i = 0; i < friends.length; ++i)
		{
			System.out.println(friends[i]);
		}
		System.out.println();
	}
	
	public static void findFriend(String[] friends)
	{
		// User inputs the name of friend
		
		String response;
		int counter;
		String found = "not found.";
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter in the name of the friend you would like to find: ");
		response = input.next();
		
		// Iterates through each element in the array.
		// If an element matches the name typed in, program displays a found message
		// if not, displays a not found message.
		for (counter = 0; counter < friends.length; ++counter)
		{
			if (response.equalsIgnoreCase(friends[counter]))
			{
				found = "found.";
				break;
			}
		}
		
		System.out.printf("Your friend %s was %s\n", response, found);
	}
}
