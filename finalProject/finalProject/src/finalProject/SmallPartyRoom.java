package finalProject;

public class SmallPartyRoom extends Room{
	
	public static String DESCRIPTION = "Room with party tables and chairs, adjacent to arcade";
	private int cost = 150;
	private int addedCost;
	private int numPartyBags = 0;
	private double hours = 0;
	private int capacity = 30;
	private String decorations = "";
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
		this.addedCost += (tempMeal.getCost() - this.meal.getCost());
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
		int cost = 150;
		int addedCost;
		int numPartyBags = 0;
		double hours = 0;
		int capacity = 30;
		String decorations = "";
		MealPlan meal = new BasicMealPlan();
	}
}
