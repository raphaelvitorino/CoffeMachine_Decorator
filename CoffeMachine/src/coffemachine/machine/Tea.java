package coffemachine.machine;

import java.util.ArrayList;

public class Tea extends Beverage {

	@Override
	public ArrayList<String> recipe(String type, int amount) {
		ArrayList<String> recipes = new ArrayList<String>();
		recipes.add("cup");
		recipes.add("powder");
		recipes.add("water");
		return recipes;
	}

	@Override
	public float price() {
		return (float) 0.35;
	}

}