/*
 * David Garrett
 * Chapter 11 Lab 2
 * 12-4-22
 */

package chapter11_debug;

public class Employee
{
	private String name;
	private int hoursWorked;
	private double hourlyRate;
	
	public Employee() 
	{
		name = "Unknown";
		hoursWorked = 0;
		hourlyRate = 0;
	}
	
	public Employee(String name, int hoursWorked, double hourlyRate)
	{
		this.name = name;
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getHoursWorked()
	{
		return hoursWorked;
	}

	public void setHoursWorked(int hours_worked)
	{
		this.hoursWorked = hours_worked;
	}

	public double getHourlyRate()
	{
		return hourlyRate;
	}

	public void setHourlyRate(double hourly_rate)
	{
		this.hourlyRate = hourly_rate;
	}

	public double calcPay()
	{
		return getHourlyRate() * getHoursWorked();
	}
	
	public String toString()
	{
		String data = String.format("Name: %s\nPay rate: $%.2f\nHours Worked: %d\n", getName(), getHourlyRate(), getHoursWorked());
		return data;
	}
}
