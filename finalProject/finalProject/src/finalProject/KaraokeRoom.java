package finalProject;

public class KaraokeRoom extends Room{

	public static String DESCRIPTION = "Enclosed lounge with karaoke machine";
	private int capacity = 10;
	private int addedCost = 0;
	private int hours = 0;
	private int cost = 30;
	private MealPlan meal;
	
	public KaraokeRoom()
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
	
	public void upgradeMeal(MealPlan tempMeal)
	{
		this.addedCost += (5 * (tempMeal.getCost() - this.meal.getCost()));
		this.meal = tempMeal;
	}
	
	public void replaceMealPlan(MealPlan newMeal)
	{
		meal = newMeal;
	}
	
	public void resetRoom()
	{
		int capacity = 10;
		int addedCost = 0;
		int cost = 30;
		MealPlan meal;
	}
}
