package finalProject;

public class MediumPartyRoom extends Room{

	private int cost = 250;
	private int capacity = 45;
	
	public MediumPartyRoom()
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
