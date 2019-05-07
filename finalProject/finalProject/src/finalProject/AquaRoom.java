package finalProject;

public class AquaRoom extends Room{
	
	private int cost = 700;
	private int capacity = 75;
	private int addedCost = 0;
	private double hours = 0;
	private MealPlan meal = new BasicMealPlan();
	
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
}
