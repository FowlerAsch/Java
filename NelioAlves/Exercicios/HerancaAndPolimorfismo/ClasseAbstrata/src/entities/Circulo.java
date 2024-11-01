package entities;

import entities.enums.Color;

public class Circulo extends Formas {

	private double raio;
	
	public Circulo() {
		super();
	}
	
	public Circulo(Color cores, double raio) {
		super(cores);
		this.raio = raio;
	}
	
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * raio * raio;
	}
	
}
