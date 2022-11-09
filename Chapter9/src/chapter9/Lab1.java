/*
 * David Garrett
 * Chapter 9 Lab 1
 * 11-9-22
 */

package chapter9;

// Program instantiate two objects. 
// Uses mutator method to set employee ID and wage.
// Uses displayEmployeeData method as defined in the Employee class to display the
// employee information.
// Lastly, uses calculateWeeklyPay method from Employee class to calculate weekly pay
// based on the value passed to the method.

public class Lab1 {

	public static void main(String[] args) {
		
		// Instantiate two Employee objects.
		// One using default constructor, other using two argument constructor
		Employee goodEmployee = new Employee();
		Employee lazyEmployee = new Employee(4704, 47.50);
		int goodEmployeeHours = 40;
		int goodEmployeeId = 4340;
		double goodEmployeeWage = 14.50;
		int lazyEmployeeHours = 6;
		
		// Set good employee's ID to 4340 and wage to 14.50
		// Values passed to mutator method 
		goodEmployee.setEmployeeId(goodEmployeeId);
		goodEmployee.setHourlyWage(goodEmployeeWage);
		
		// Display Employee ID and hourly wage
		goodEmployee.displayEmployeeData();
		lazyEmployee.displayEmployeeData();
		
		// Prints employee's weekly pay after working a certain amount of hours.
		// Accessor Method is used to get employee ID
		System.out.printf("The weekly pay for employee %d is $%.2f after working %d hours.%n",
						  goodEmployee.getEmployeeId(),	
				          goodEmployee.calculateWeeklyPay(goodEmployeeHours), 
				          goodEmployeeHours);
		System.out.printf("The weekly pay for employee %d is $%.2f after working %d hours.%n",
						  lazyEmployee.getEmployeeId(),
		          		  lazyEmployee.calculateWeeklyPay(lazyEmployeeHours), 
		          		  lazyEmployeeHours);

	}

}
