/*
 * David Garrett
 * Chapter 3 Lab 1
 * 9-20-2022
 */

/*
 * This program is a game of scissors-lizard-spock.
 * 
 * Scissors beats lizard, lizard beats spock, and spock beats scissors.
 * 
 * Player chooses scissors, lizard, or spock and then the computer randomly chooses
 * scissors, lizard, or spock. Afterwards, using a series of if and else statements, the program
 * decides if the player wins, loses, or ties with the computer.
 */

package chapter3;
import java.util.Scanner;
import java.util.Random;

public class Lab1 
{
	// Constants used for each choice in Scissors-Lizard-Spock game
	static final int SCISSOR = 1, LIZARD = 2, SPOCK = 3;
	
	public static void main(String[] args)
	{
		int player, computer;
		Scanner input = new Scanner(System.in); // Create scanner object
		Random random = new Random(); // Create random object
		
		System.out.print("*** Welcome to the Scissors-Lizard-Spock Game ***"
				           + "\nEnter 1 for Scissors, 2 for Lizard, 3 for Spock"
				           + " or anything else to immediately lose: ");
		
		// Player chooses scissor, lizard, or spock
		player = input.nextInt();
		
		// Random number that ranges from 0 to 2 is generated. Then 1 is added to that number.
		// Based on the random number generated, computer will choose scissor, lizard, or spock
		computer = random.nextInt(3) + 1;
		
		// Series of conditions that will test to see if the player wins or loses against the computer
		
		if (player == SCISSOR) // Player chooses scissor
		{
			System.out.println("\nYou chose Scissors.");
			
			if (computer == SCISSOR) // Tie
			{
				System.out.println("The computer chose Scissors.\nThere was a tie.");
			}
			else if (computer == LIZARD) // Player wins
			{
				System.out.println("The computer chose Lizard.\nYou win, Scissors decapitate Lizard!");
			}
			else // Player loses
			{
				System.out.println("The computer chose Spock.\nYou lose, Spock smashes Scissors!");
			}
		}
		else if (player == LIZARD) // Player chooses lizard
		{
			System.out.println("\nYou chose Lizard.");
			
			if (computer == LIZARD) // Tie
			{
				System.out.println("The computer chose Lizard.\nThere was a tie.");
			}
			else if (computer == SPOCK) // Player wins
			{
				System.out.println("The computer chose Spock.\nYou win, Lizard wins as it poisons Spock!");
			}
			else // Player loses
			{
				System.out.println("The computer chose Scissors.\nYou lose, Scissors decapitate Lizard!");
			}
		}
		else if (player == SPOCK) // Player chooses spock
		{
			System.out.println("\nYou chose Spock.");
				
			if (computer == SPOCK) // Tie
			{
				System.out.println("The computer chose Spock.\nThere was a tie.");
			}
			else if (computer == SCISSOR) // Player wins
			{
			    System.out.println("The computer chose Scissors.\nYou win, Spock smashes Scissors!");
			}
			else // Player loses
			{
				System.out.println("The computer chose Lizard.\nYou lose, Lizard wins as it poisons Spock!");
			}
		}
		else // For any input that is not 1, 2, or 3
		{
			System.out.print("\nInvalid choice.\nYou lose!!!");
		}	
		
		input.close(); // Closes scanner
	}
}
