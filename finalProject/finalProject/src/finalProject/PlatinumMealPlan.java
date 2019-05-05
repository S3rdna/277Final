package finalExam;

public class PlatinumMealPlan implements MealPlan{
	
	private	Pizza p1;
	private	Pizza p2;
	private	Pizza p3;
	private	Pizza p4;
	private	Soda s1;
	private	Soda s2;
	private	Soda s3;
	private	Soda s4;
	private	Soda s5;
	private	Wings w;
	
		
	public PlatinumMealPlan() {
		p1 = new Pizza();
		p2 = new Pizza();
		p3 = new Pizza();
		p4 = new Pizza();
		s1 = new Soda();
		s2 = new Soda();
		s3 = new Soda();
		s4 = new Soda();
		s5 = new Soda();
		w = new Wings();
	}
	
	
	
	
	void setPizzaToppings(Pizza p , String [] t) {
		for (int i = 0 ; i < 4 ; i++) {
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
		return 150;
	}
	
	public int getNumOfPizzas() {
		return 4;
	}
	
	public int getNumOfSodas() {
		return 5;
	}
}
