package finalProject;

public class AquaRoom extends Room{
	
	private int cost = 700;
	private int capacity = 75;
	
	public AquaRoom()
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
