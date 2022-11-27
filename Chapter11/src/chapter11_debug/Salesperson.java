/*
 *  Your name here
 * Chapter 11, Lab 2
 * Current date here
 */

package chapter11_debug;

public class Salesperson extends Employee // Added extends Employee
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
		super(name, hoursWorked, hourlyRate); // Added Super
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
