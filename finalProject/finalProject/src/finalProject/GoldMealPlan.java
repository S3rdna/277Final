package finalProject;

public class GoldMealPlan implements MealPlan{
	private	Pizza p1;
	private	Pizza p2;
	private	Pizza p3;
	
	private	Soda s1;
	private	Soda s2;
	private	Soda s3;
	private	Soda s4;
	private	Soda s5;
	private	Wings w;
	
		
	public GoldMealPlan() {
		p1 = new Pizza();
		p2 = new Pizza();
		p3 = new Pizza();
		
		s1 = new Soda();
		s2 = new Soda();
		s3 = new Soda();
		s4 = new Soda();
		s5 = new Soda();
		w = new Wings();
	}
	String [] included= {"Salads" , "BreadSticks"};
	
	String [] getIncluded() {
		return included;
	}
	
	void setPizzaToppings(Pizza p , String [] t) {
		for (int i = 0 ; i < 3 ; i++) {
			p.addTopping(t[i]);
		}
	}
	
	void setWingFlavor(String [] f) {
		for (int i = 0 ; i < 2 ; i++) {
			w.addflavors((f[i]));
		}
	}
	void setWingType(String t) {
		w.setType(t);
	}
	
	void setSodaFlavor(Soda s , String f) {
		s.setFlavor(f);
	}
	
	@Override
	public int getCost() {
		return 120;
	}
	
	public int getNumOfPizzas() {
		return 3;
	}
	
	public int getNumOfSodas() {
		return 5;
	}
}
