/*
 * David Garrett
 * Chapter 9 Lab 1
 * 11-9-22
 */

package chapter9;

public class Employee {
	
	// Private Variables, cannot be changed outside of class
	private int employeeId;
	private double hourlyWage;
	
	// Default constructor. Sets all values to 0
	public Employee()
	{
		employeeId = 0;
		hourlyWage = 0.0;
	}
	
	// Constructor. Allows employee ID and hourly rate to be set when
	// the object is instantiated. Values will initialize to 0 if negative
	// value is passed
	public Employee(int empId, double hourlyRate)
	{
		if (empId >= 0)
			employeeId = empId;
		else
			employeeId = 0;
		
		if (hourlyRate >= 0)
			hourlyWage = hourlyRate;
		else
			hourlyWage = 0;
	}
	
	// Mutator Method. Allows for hourlyWage to be set to new value
	public void setHourlyWage(double hourlyRate)
	{
		hourlyWage = hourlyRate;
	}
	
	// Accessor Method. Allows for hourlyWage value to be returned and used in Lab1.java
	public double getHourlyWage()
	{
		return hourlyWage;
	}
	
	// Mutator Method. Allows for employeeId to be set to new value
	public void setEmployeeId(int empId)
	{
		employeeId = empId;
	}
	
	// Accessor Method. Allows for employeeId value to be returned and used in Lab1.java
	public int getEmployeeId()
	{
		return employeeId;
	}
	
	// Calculates weekly payed. 
	public double calculateWeeklyPay(int hoursWorked)
	{
		return (hourlyWage * hoursWorked);
	}
	
	// Prints employee ID and hourly wage
	public void displayEmployeeData()
	{
		System.out.printf("The hourly wage of the person with the employee ID %d is: $%.2f%n", 
						   employeeId, hourlyWage);
	}

}
