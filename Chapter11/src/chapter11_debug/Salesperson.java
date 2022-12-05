/*
 * David Garrett
 * Chapter 11 Lab 2
 * 12-4-22
 */

package chapter11_debug;

public class Salesperson extends Employee // Added extends Employee, can now inherit methods/variables from Employee class
{
	private double weeklySales;
	private double commissionPercentage;
	
	public Salesperson()
	{
		super(); // Added Super
		weeklySales = 0;
		commissionPercentage = 0;
	}
	
	public Salesperson(String name, int hoursWorked, double hourlyRate, double weeklySales, double commissionPercentage)
	{
		super(name, hoursWorked, hourlyRate); // Added Super, constructor now has calls the constructor in the employee class
		// Constructor Chaining
		this.weeklySales = weeklySales;
		this.commissionPercentage = commissionPercentage;
	}
	
	public double getWeeklySales()
	{
		return weeklySales;
	}

	public void setWeeklySales(double weeklySales)
	{
		this.weeklySales = weeklySales;
	}

	public double getCommissionPercentage()
	{
		return commissionPercentage;
	}

	public void setCommissionPercentage(double commissionPercentage)
	{
		this.commissionPercentage = commissionPercentage;
	}
	
	public double calcPay()
	{
		double employeePay = super.calcPay();
		employeePay += getCommissionPercentage() * getWeeklySales();
		return employeePay;
	}
	
	public String toString()
	{
		String data = super.toString();
		
		// Multiplied getCommissionPercentage() by 100 to get correct percentage displayed
		data += String.format("Weekly Sales: $%.2f\nCommission Percentage: %.0f%%\n", getWeeklySales(), getCommissionPercentage()*100);
		return data;
	}

}
