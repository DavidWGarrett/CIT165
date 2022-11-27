/*
 *  Your name here
 * Chapter 11, Lab 2
 * Current date here
 */

package chapter11_debug;

import java.util.Scanner;

public class ClassClient
{

	public static void main(String[] args)
	{
		Employee[] employees = new Employee[2];
		Scanner input = new Scanner(System.in);
		String name;
		int hours;
		double rate, commission, sales, totalPay;
		
		for(int i = 0;i < employees.length;++i)
		{
			System.out.print("Enter the name of employee " + (i + 1) + ": ");
			name = input.nextLine();
			System.out.print("Enter the hourly pay for " + name + ": ");
			rate = Double.parseDouble(input.nextLine());
			System.out.print("Enter the hours worked by " + name + ": ");
			hours = Integer.parseInt(input.nextLine());
			System.out.print("Is " + name + " a salesperson (y/n)? ");
			if(input.nextLine().toLowerCase().equals("y"))
			{
				System.out.print("Enter the total sales made by " + name + ": ");
				sales = Double.parseDouble(input.nextLine());
				System.out.print("Enter the commission (as a decimal) earned by " + name + ": ");
				commission = Double.parseDouble(input.nextLine());
				employees[i] = new Salesperson(name, hours, rate, sales, commission);
			}
			else
			{
				employees[i] = new Employee(name, hours, rate);
			}
			System.out.println();
		}
		
		System.out.println("----\nEmployee data:\n\n");

		for(Employee employee: employees)
		{
			System.out.print(employee);
			System.out.printf("Total pay: $%.2f\n\n", employee.calcPay());
		}
	}
	

}
