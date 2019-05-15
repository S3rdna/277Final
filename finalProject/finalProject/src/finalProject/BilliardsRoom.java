package finalProject;

public class BilliardsRoom extends Room{
	
	public static String DESCRIPTION = "Enclosed lounge with pool table";
	private int capacity = 10;
	private int addedCost = 0;
	private double hours = 0;
	private int cost = 25;
	private MealPlan meal;
	
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
	
	public void addMeal(MealPlan newMeal)
	{
		meal = newMeal;
	}
	
	public void resetRoom()
	{
		int capacity = 10;
		int addedCost = 0;
		double hours = 0;
		int cost = 25;
		MealPlan meal;
	}
}
