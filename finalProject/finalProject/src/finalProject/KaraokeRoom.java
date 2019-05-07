package finalProject;

public class KaraokeRoom extends Room{

	private int capacity = 10;
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
		this.cost += (5 * (tempMeal.getCost() - this.meal.getCost()));
		this.meal = tempMeal;
	}
	
	public void upgradeTower()
	{
		this.cost += 2;
	}
	
	public void upgradePartyBag()
	{
		this.cost += 5;
	}
	
	public void replaceMealPlan(MealPlan newMeal)
	{
		meal = newMeal;
	}
}
