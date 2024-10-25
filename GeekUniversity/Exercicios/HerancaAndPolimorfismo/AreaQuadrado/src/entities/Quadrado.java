package entities;

public class Quadrado {
	
	private double lado;
	private double area;
	private double perimetro;
	
	public Quadrado() {
		
	}
	
	public Quadrado(double lado) {
		this.lado = lado;
		calcularArea();  // Já calcula a área ao criar o objeto
		calcularPerimetro();  // Já calcula o perímetro ao criar o objeto
	}

	public double calcularArea() {
		this.area = this.lado * this.lado;
		return this.area;
	}
	
	public double calcularPerimetro() {
		this.perimetro = 4 * this.lado;
		return this.perimetro;
	}
	
	public void imprimir() {
		System.out.println("Lado: " + this.lado);
		System.out.println("Área: " + this.area);
		System.out.println("Perímetro: " + this.perimetro);
	}
	
}
