/*
 * David Garrett
 * Chapter 6 Lab 1
 * 10-13-22
 */

package chapter6;
import java.util.Scanner;

// Program finds the surface area of a cylinder and displays value. 
// User types in radius and height of cylinder.
// Method created to calculate the surface area of a cylinder. The value of the radius and
// the height is passed to the method and the surface area is returned by the method.

public class Lab1 
{
	public static void main(String[] args)
	{
		double radius, height, surfaceArea;
		Scanner input = new Scanner(System.in);
		
		// User types in radius and height
		System.out.print("Enter in the radius of your cylindric object: ");
		radius = input.nextDouble();
		
		System.out.print("Enter in the height of your cylindric object: ");
		height = input.nextDouble();
		
		// Method calculates surface area
		surfaceArea = findSurfaceAreaCylinder(radius, height);
		
		// Displays surface area
		System.out.printf("\nThe area of your object is: %.2f", surfaceArea);
	}
	public static double findSurfaceAreaCylinder(double radius, double height)	
	{
		double surfaceArea;
		
		// Calculations to find surface area of cylinder. Returns that value.
		surfaceArea = (2 * radius * radius * Math.PI) + (height * 2 * radius * Math.PI);
		return surfaceArea;
	}
}
