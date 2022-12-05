/*
 * David Garrett
 * Chapter 11 Lab 1
 * 12-4-22
 */

package chapter11;

import java.util.ArrayList;
import java.util.Arrays;

public class secureStoredItem extends StoredItem // Inherits methods/variables from storedItem class
{
	private int security[];
	private Double securityCost;

	public secureStoredItem() {}

	// constructor
	public secureStoredItem(char storage, int volume, int prices[][], int security[])
	{
		super(storage, volume, prices); // constructor chaining
		setSecurity(security); // Array of additional security prices
		setSecurityCost(0.0);
	}
	
	
	// getter/setters
	public int[] getSecurity() {
		return security;
	}

	public void setSecurity(int[] security) {
		this.security = security;
	}
	
	public Double getSecurityCost() {
		return securityCost;
	}

	public void setSecurityCost(Double securityCost) {
		this.securityCost = securityCost;
	}

	@Override
	// method overriding
	public void calculateCost()
	{
		int indexStorage;
		Character[] storageTypePrim = { 'o', 'i', 'r' };
		ArrayList<Character> storageTypeList = new ArrayList<Character>(Arrays.asList(storageTypePrim));
		
		super.calculateCost(); // Calls the method from storedItem class, calculate cost
		
		indexStorage = storageTypeList.indexOf(storageType);
		
		// Finds the security cost
		securityCost = (double) security[indexStorage]; // Typecast to double to get decimal value
	}
	
	@Override
	// Method overriding. Includes the Security cost.
	public String toString()
	{
		return super.toString() + "\nSecurity Cost:  $" + String.format("%.2f", this.getSecurityCost());
	}
}
