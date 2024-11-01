package entities;

import entities.enums.Color;

public class Retangulo extends Formas {
	
	private double altura;
	private double largura;
	
	public Retangulo() {
		super();
	}
	
	public Retangulo(Color cores, double altura, double largura) {
		super(cores);
		this.altura = altura;
		this.largura = largura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getLargura() {
		return largura;
	}
	
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	@Override
	public double area() {
		return altura * largura;
	}

}