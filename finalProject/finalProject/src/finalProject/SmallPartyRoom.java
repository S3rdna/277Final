package finalProject;

public class SmallPartyRoom extends Room{
	
	private int cost = 150;
	private int capacity = 30;
	
	public SmallPartyRoom()
	{
		
	}

	public int getCost() 
	{
		return cost;
	}

	public void setCost(int cost) 
	{
		this.cost = cost;
	}

	public int getCapacity() 
	{
		return capacity;
	}

	public void setCapacity(int capacity) 
	{
		this.capacity = capacity;
	}

}
