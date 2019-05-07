package finalProject;

public class AquaRoom extends Room{
	
	private int cost = 700;
	private int capacity = 75;
	private int numPartyBags = 0;
	private int addedCost = 0;
	private double hours = 0;
	private String decorations = "";
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
		this.addedCost += (5 * (tempMeal.getCost() - this.meal.getCost()));
		this.meal = tempMeal;
	}
	
	public void upgradeTower()
	{
		this.addedCost += 2;
	}
	
	public void upgradePartyBag()
	{
		this.addedCost += 5;
		numPartyBags++;
	}
	
	public void addProjector(int numHours)
	{
		this.addedCost += (10 * numHours);
	}
	
	public void addDecorations(String newDecorations)
	{
		this.decorations = newDecorations;
		this.addedCost += 100;
	}
	
	public void resetRoom()
	{
		int cost = 700;
		int capacity = 75;
		int numPartyBags = 0;
		int addedCost = 0;
		double hours = 0;
		String decorations = "";
		MealPlan meal = new BasicMealPlan();
	}
}
