/* David Garrett
 * Chapter 9, Lab 2
 * 11-8-22
 */

/*
 * Problem #1 and #2 on Chapter9_debug.java
 * 
 * Problem #3, Line 32
 * Changed from private to public. UML specify constructor to be public.
 * Also, constructor method would not be allowed to be used outside the class if private
 * 
 * Problem #4, Line 40
 * Changed from true to on
 * When the method is called, it would always return true.
 * Now, it'll return true or false based on the on variable
 */

package chapter9_debug;

public class Fan
{
	private boolean on;
	
	// Default Constructor
	public Fan() 
	{
		on = false;
	}
	
	// One argument Constructor
	public Fan(boolean status) // Changed from private to public
	{
		on = status;
	}
	
	// Returns the value of on to check the status of the Fan object
	public boolean isOn()
	{
		return on; // Changed from true to on
	}
	
	// Modifies the value of on to set the Fan object on
	public void turnOn()
	{
		on = true;
	}
	
	// Modifies the value of on to set the Fan object on
	public void turnOff()
	{
		on = false;
	}
}
