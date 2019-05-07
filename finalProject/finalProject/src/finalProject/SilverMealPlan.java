package finalProject;

public class SilverMealPlan implements MealPlan{
	private	Pizza p1;
	private	Pizza p2;
	private	Pizza p3;
	
	private	Soda s1;
	private	Soda s2;
	private	Soda s3;
	private	Soda s4;
	private	Soda s5;
	
	
		
	public SilverMealPlan() {
		p1 = new Pizza();
		p2 = new Pizza();
		p3 = new Pizza();
		
		s1 = new Soda();
		s2 = new Soda();
		s3 = new Soda();
		s4 = new Soda();
		s5 = new Soda();
		
	}
	String [] included= {"Salads" , "BreadSticks"};
	
	void setPizzaToppings(Pizza p , String [] t) {
		for (int i = 0 ; i < 3 ; i++) {
			p.addTopping(t[i]);
		}
	}
	
	void setSodaFlavor(Soda s , String f) {
		s.setFlavor(f);
	}
	
	@Override
	public int getCost() {
		return 90;
	}
	
	public int getNumOfPizzas() {
		return 3;
	}
	
	public int getNumOfSodas() {
		return 5;
	}
}
