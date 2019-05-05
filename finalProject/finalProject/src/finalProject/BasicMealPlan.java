package finalExam;

public class BasicMealPlan implements MealPlan{
	 
	private	Pizza p1;
	private	Pizza p2;
	private	Pizza p3;
	
	private	Soda s1;
	private	Soda s2;
	private	Soda s3;
	
	
		
	public BasicMealPlan() {
		p1 = new Pizza();
		p2 = new Pizza();
		p3 = new Pizza();
		
		s1 = new Soda();
		s2 = new Soda();
		s3 = new Soda();
		
	}
	
	void setPizzaToppings(Pizza p , String [] t) {
		for (int i = 0 ; i < 1 ; i++) {
			p.addTopping(t[i]);
		}
	}
	
	void setSodaFlavor(Soda s , String f) {
		s.setFlavor(f);
	}
	
	@Override
	public int getCost() {
		return 65;
	}
	
	public int getNumOfPizzas() {
		return 3;
	}
	
	public int getNumOfSodas() {
		return 3;
	}
	
	
}
