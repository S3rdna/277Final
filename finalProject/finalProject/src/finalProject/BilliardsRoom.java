package finalProject;

public class BilliardsRoom extends Room{
	
	private int capacity = 10;
	private int cost = 25;
	
	public BilliardsRoom()
	{
		
	}

	public int getCapacity() 
	{
		return capacity;
	}

	public void setCapacity(int capacity) 
	{
		this.capacity = capacity;
	}

	public int getCost() 
	{
		return cost;
	}

	public void setCost(int cost) 
	{
		this.cost = cost;
	}
}
