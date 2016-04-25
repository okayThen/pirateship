package org.vashonsd.pirateship.itemStuff;

public class ItemFactory 
{
	public ItemFactory()
	{
		super();
	}
	
	public Item baguette()
	{
		Item baguette = new Item("Baquette", "A delicious loaf of french bread", 1);
		return baguette;
	}
	
	public Item book()
	{
		Item book = new Item("Book", "An old leather-bound tome", 1);
		return book;
	}
}
