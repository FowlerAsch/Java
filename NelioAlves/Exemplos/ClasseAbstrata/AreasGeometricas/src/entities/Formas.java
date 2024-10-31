package entities;

import entities.enums.Color;

public abstract class Formas {
	
	private Color cores;
	
	public Formas() {
		
	}
	
	public Formas(Color cor) {
		this.cores = cor;
	}
	
	public Color getCor() {
		return cores;
	}
	
	public void setCor(Color Cor) {
		this.cores = Cor;
	}
	
	public abstract double area();
	

}
