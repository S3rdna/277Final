package finalProject;

import java.util.ArrayList;

public class Pizza {
	private ArrayList toppings;
	
	
	public Pizza(){
		toppings = null;
	}
	
	public Pizza(String[] top) {
		for (int i = 0 ; i < top.length ; i++) {
			toppings.add(top[i]);
		}
	}
	
	void addTopping(String top){
		toppings.add(top);
	}
	
	String getToppings() {
		String s = toppings.toString();
		return s;
	}
}

