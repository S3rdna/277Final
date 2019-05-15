package finalProject;

public class MediumPartyRoom extends Room{

	public static String DESCRIPTION = "Room with party tables and chairs, quick access to arcade";
	private int cost = 250;
	private int addedCost = 0;
	private int numPartyBags = 0;
	private double hours = 0;
	private int capacity = 45;
	private String decorations = "";
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
		this.addedCost += (3 * (tempMeal.getCost() - this.meal.getCost()));
		this.meal = tempMeal;
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
		int cost = 250;
		int addedCost = 0;
		int numPartyBags = 0;
		double hours = 0;
		int capacity = 45;
		String decorations = "";
		MealPlan meal = new BasicMealPlan();
	}
}
