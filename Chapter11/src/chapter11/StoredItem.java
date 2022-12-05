/*
 * David Garrett
 * Chapter 11 Lab 1
 * 12-4-22
 */

package chapter11;

import java.util.ArrayList;
import java.util.Arrays;

public class StoredItem 
{
	// Protected lets secureStoredItem be able to access the variables
	
	protected char storageType;
	protected int volume;
	protected double cost;
	protected int prices[][]; // Two dimensional array contains all the prices

	public StoredItem() {}
	
	// Constructor 
	public StoredItem(char storage, int volume, int prices[][])
	{
		if (storage == 'o' | storage == 'i' | storage == 'r')
			setStorageType(storage);
		else
			setStorageType('o');
		
		if (volume > 0)
			setVolume(volume);
		else
			setVolume(0);
		
		setPrices(prices); // Two dimensional array contains all the prices
		setCost(0);
	}
	
	// Mutators/Accessors
	public char getStorageType() {
		return storageType;
	}
	public void setStorageType(char storageType) {
		this.storageType = storageType;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int[][] getPrices() 
	{
		return prices;
	}
	public void setPrices(int[][] prices) 
	{
		this.prices = prices;
	}
	
	// Calculate the cost
	public void calculateCost()
	{
		int indexStorage;
		int indexVolume;
		Character[] storageCharacterArray = { 'o', 'i', 'r' };
		Integer[]  volumeIntegerArray = { 0, 2, 4 };
		ArrayList<Character> storageTypeList = new ArrayList<>(Arrays.asList(storageCharacterArray));
		ArrayList<Integer> volumeList = new ArrayList<>(Arrays.asList(volumeIntegerArray));
		
		// Determine index value of the kind of storage type
		indexStorage = storageTypeList.indexOf(storageType);
		
		// Determines index value of which range of volume the container is in
		
		if (volume == 2)
		{
			indexVolume = volumeList.indexOf(2);
		}
		else
		{
			for (indexVolume = volumeList.size()-1; indexVolume > 0; indexVolume--)
			{
				if (volume > volumeList.get(indexVolume))
				{
					break;
				}
			}
		}
		
		// Determines cost using the appropriate index values
		cost = prices[indexVolume][indexStorage];
	}

	// returns default string without having to add .toString() to object name
	// String contains storage type, volume, and cost
	public String toString()
	{
		return "Storage Type:   " + this.getStorageType() + "\nVolume:         " 
	           + String.valueOf(this.getVolume()) + "\nCost:           $" 
			   + String.format("%.2f", this.getCost());
	}
}
