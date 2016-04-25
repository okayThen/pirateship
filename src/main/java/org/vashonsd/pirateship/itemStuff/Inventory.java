package org.vashonsd.pirateship.itemStuff;

import java.util.*;

public class Inventory
{
    private HashMap<Item, Integer> inventory;
    
    public Inventory()
    {
        inventory = new HashMap<Item, Integer>();
    }
    
    public void addNewItem(Item other, int quan)
	{
		inventory.put(other, quan);
	}
    
    public void addItem(Item other, int quan)
    {
    	inventory.remove(other);
    	inventory.put(other, quan);
    }
	
	public void removeItem(Item other)
	{
		inventory.remove(other);
	}
	
	public void removeItem(Item other, int quan)
	{
		inventory.remove(other);
		inventory.put(other, quan);
	}
	
	public void dumpInventory()
	{
		inventory.clear();
	}
	
	public String inventoryToString()
	{
		String toReturn = "";
		
		for(Item n: inventory.keySet())
		{
			if(inventory.get(n) >= 1)
				toReturn += "Item: " + n.getName() + "Quantity: " + inventory.get(n) + "\n";
		}
			
		return toReturn;
	}
	
	public boolean hasItem(Item t)
	{
		return(inventory.containsKey(t) && inventory.get(t)>0);
	}
	
	public boolean hasName(String s)
	{
		for(Item i: inventory.keySet())
		{
			if(i.getName().equals(s))
			{
				return true;
			}
		}
		
		return false;
	}
	
}
