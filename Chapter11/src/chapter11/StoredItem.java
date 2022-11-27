package chapter11;

import java.util.ArrayList;
import java.util.Arrays;

public class StoredItem 
{
	private char storageType;
	private int volume;
	private double cost;
	private double prices[][];

	StoredItem() {}
	
	StoredItem(char storage, int volume, double prices[][])
	{
		if (storage == 'o' | storage == 'i' | storage == 'r')
			setStorageType(storage);
		else
			setStorageType('o');
		
		if (volume > 0)
			setVolume(volume);
		else
			setVolume(0);
		
		setPrices(prices);
		setCost(0);
	}
	
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
	public double[][] getPrices() 
	{
		return prices;
	}
	public void setPrices(double[][] prices) 
	{
		this.prices = prices;
	}
	
	public void calculateCost()
	{
		int indexStorage;
		int indexVolume;
		Character[] storageCharacterArray = { 'o', 'i', 'r' };
		Integer[]  volumeIntegerArray = { 0, 2, 4 };
		ArrayList<Character> storageTypeList = new ArrayList<>(Arrays.asList(storageCharacterArray));
		ArrayList<Integer> volumeList = new ArrayList<>(Arrays.asList(volumeIntegerArray));
		
		indexStorage = storageTypeList.indexOf(storageType);
		
		if (volume == 2)
		{
			indexVolume = volumeList.indexOf(2);
		}
		else
		{
			for (indexVolume = volumeList.size()-1; indexVolume < 0; indexVolume--)
			{
				if (volume > volumeList.get(indexVolume))
				{
					break;
				}
			}
		}
		
		cost = prices[indexVolume][indexStorage];
	}

	public String toString()
	{
		return "Storage Type: " + this.getStorageType() + "\nVolume: " 
	           + String.valueOf(this.getVolume()) + "\nCost: " 
			   + String.valueOf(this.getCost());
	}
}
