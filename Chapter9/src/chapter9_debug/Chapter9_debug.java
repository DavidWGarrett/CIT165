/* David Garrett
 * Chapter 9, Lab 2
 * 11-8-22
 */

/*
 * Problem #3 and #4 on Fan.java
 * 
 * Problem #1, Line 28
 * Changed boxFan.Fan() to Fan()
 * Proper syntax. Now, it'll allocate memory for the memory based on the
 * Fan class
 * 
 * Problem #2, Line 53
 * Changed from "boxFan.on = true" to "boxFan.turnOn()"
 * The on variable is private, so it cannot be modified outside the class. 
 * The way to set the on variable to true is to call the turnOn() function which
 */

package chapter9_debug;

public class Chapter9_debug
{

	public static void main(String[] args)
	{
		// Create a new Fan using the default constructor
		Fan boxFan = new Fan(); // Changed boxFan.Fan() to Fan()
		// Create a new Fan using the one argument constructor
		Fan windowFan = new Fan(true);
		
		// Print the status of the Fan objects
		if(boxFan.isOn())
		{
			System.out.println("The box fan is on.");
		}
		else
		{
			System.out.println("The box fan is off.");			
		}
		if(windowFan.isOn())
		{
			System.out.println("The window fan is on.");
		}
		else
		{
			System.out.println("The window fan is off.");			
		}
		
		System.out.println("\nToggling the status of the fans.");
		
		// Change the status of the Fan objects
		boxFan.turnOn(); // Changed from "boxFan.on = true" to "boxFan.turnOn()"
		windowFan.turnOff();
		
		// Print the status of the Fan objects
		System.out.println();
		if(boxFan.isOn())
		{
			System.out.println("The box fan is now on.");
		}
		else
		{
			System.out.println("The box fan is now off.");			
		}
		if(windowFan.isOn())
		{
			System.out.println("The window fan is now on.");
		}
		else
		{
			System.out.println("The window fan is now off.");			
		}
	}

}
