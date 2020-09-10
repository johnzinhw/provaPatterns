package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.List;

public class PizzaContainer implements Ingredients{

	private List<Ingredients> ingredients;
	
	public PizzaContainer() {
		ingredients = new ArrayList<>();
	}
	@Override
	public String description() {
		String description = "";
		for (Ingredients ingrediente : ingredients) {
			description += ingrediente.description();
			description +=" ";
		}
		return description;
	}

	@Override
	public double price() {
		double price = 0;
		for (Ingredients ingrediente : ingredients) {
			price += ingrediente.price();
		}
		return price;
	}
	
	public void addComponent(Ingredients ingrediente) {
		ingredients.add(ingrediente);
	}
	
	public void removeComponent(Ingredients ingrediente) {
		ingredients.remove(ingrediente);
	}

}