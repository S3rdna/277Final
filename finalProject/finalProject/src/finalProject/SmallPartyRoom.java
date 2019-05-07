package finalProject;

public class SmallPartyRoom extends Room{
	
	private int cost = 150;
	private int addedCost;
	private double hours = 0;
	private int capacity = 30;
	private MealPlan meal = new BasicMealPlan();
	
	public SmallPartyRoom()
	{
		
	}

	public double getCost() 
	{
		return (cost * hours) + addedCost;
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
		this.cost += (tempMeal.getCost() - this.meal.getCost());
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
