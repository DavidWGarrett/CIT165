/* David Garrett
 * Chapter 2, Lab 1
 * September 13th, 2022
 */

/*
 * The program ask the user to input the radius and height of the cylinder, 
 * calculate the surface area of that cylinder, and prints the surface area to
 * the console.
 */


package chapter2;
import java.util.Scanner; // Import scanner class. Allows to get user input

public class Lab1 {
	
	// Constants for calculations
	static final int NUMBER_OF_BASES = 2;
	static final double PI = 3.14;
	
	public static void main(String[] args)
	{
		double radius;
		double height;
		double surfaceArea;

		Scanner input = new Scanner(System.in); // Create scanner object
		
		// Ask user to input input radius and height of cylinder
		System.out.print("Enter in the radius of your cylindric object: ");
		radius = input.nextDouble();
		System.out.print("Enter in height radius of your cylindric object: ");
		height = input.nextDouble();

		// Calculates surface area of cylinder
		surfaceArea = NUMBER_OF_BASES * PI * radius * (height + radius);

		// Prints surface area of cylinder to console
		System.out.println("\nThe area of your object is: " + surfaceArea);
		
		input.close(); // Closes scanner
	}
}
