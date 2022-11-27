package chapter11;

import java.util.ArrayList;
import java.util.Arrays;

public class secureStoredItem extends StoredItem
{
	private int security[];
	private Double securityCost;

	secureStoredItem() {}

	secureStoredItem(char storage, int volume, int prices[][], int security[])
	{
		super(storage, volume, prices);
		setSecurity(security);
		setSecurityCost(0.0);
	}
	
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
	public void calculateCost()
	{
		int indexStorage;
		Character[] storageTypePrim = { 'o', 'i', 'r' };
		ArrayList<Character> storageTypeList = new ArrayList<Character>(Arrays.asList(storageTypePrim));
		
		super.calculateCost();
		
		indexStorage = storageTypeList.indexOf(storageType);
		securityCost = (double) security[indexStorage];
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "\nSecurity Cost:  $" + String.format("%.2f", this.getSecurityCost());
	}
}
