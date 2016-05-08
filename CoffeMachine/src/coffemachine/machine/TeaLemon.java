package coffemachine.machine;

import java.util.ArrayList;
import java.util.List;

public class TeaLemon extends Beverage {

	private Panel panel;
	private SafeBox safeBox;
	private List<Ingredient> ingredients;
	private Beverage beverage;

	public Panel getPanel() {
		return panel;
	}

	public void setPanel(Panel panel) {
		this.panel = panel;
	}

	public SafeBox getSafeBox() {
		return safeBox;
	}

	public void setSafeBox(SafeBox safeBox) {
		this.safeBox = safeBox;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public TeaLemon(Beverage teaLemon) {
		beverage = teaLemon;
		SafeBox safeBox = new SafeBox();
		Panel panel = new Panel();
		List<Ingredient> ingredients = new ArrayList<Ingredient>();

		this.ingredients = ingredients;
		this.panel = panel;
		this.safeBox = safeBox;
	}

	public ArrayList<String> recipe(String type, int amount) {
		ArrayList<String> recipes = beverage.recipe(type, amount);
		recipes.add("lemon");
		return recipes;
	}

	public float price() {
		return beverage.price() + (float) 0.10;
	}

}