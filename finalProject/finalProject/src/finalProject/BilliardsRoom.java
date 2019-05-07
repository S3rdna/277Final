package finalProject;

public class BilliardsRoom extends Room{
	
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
	
	public void upgradeMeal(MealPlan tempMeal)
	{
		this.cost += (5 * (tempMeal.getCost() - this.meal.getCost()));
		this.meal = tempMeal;
	}
	
	public void addMeal(MealPlan newMeal)
	{
		meal = newMeal;
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
