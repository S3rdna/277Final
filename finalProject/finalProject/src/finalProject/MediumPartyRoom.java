package finalProject;

public class MediumPartyRoom extends Room{

	private int cost = 250;
	private int addedCost = 0;
	private double hours = 0;
	private int capacity = 45;
	private MealPlan meal = new BasicMealPlan();
	
	public MediumPartyRoom()
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
		this.cost += (3 * (tempMeal.getCost() - this.meal.getCost()));
		this.meal = tempMeal;
	}
	
	public void upgradePartyBag()
	{
		this.addedCost += 5;
	}
}
