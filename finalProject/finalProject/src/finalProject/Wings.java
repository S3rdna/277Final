package finalExam;

import java.util.ArrayList;

public class Wings {
	private ArrayList flavors;
	String type;
	
	public Wings(){
		flavors = null;
		type=null;
	}
	
	public Wings(String[] fla, String t) {
		for (int i = 0 ; i < fla.length ; i++) {
			flavors.add(fla[i]);
		}
		type = t;
	}
	
	void addflavors(String top){
		flavors.add(top);
	}
	
	void setType(String t) {
		type = t;
	}
	
	String getToppings() {
		String s = flavors.toString();
		return s;
	}
	
	String getType() {
		return type;
	}
}
