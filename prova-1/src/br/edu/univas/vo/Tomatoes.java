package br.edu.univas.vo;

public class Tomatoes implements Ingredients {
	@Override
	public String description() {
		return "Tomate";
	}
	@Override
	public double price() {
		
		return 0.5;
	}
}
