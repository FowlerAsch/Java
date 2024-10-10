package entitites;

public class Retangulo {
	
	private double altura;
	private double largura;
	
	
	public double area() {
		return largura + altura;
	}
	
	public double perimeter() {
		return 2 * (largura + altura);
	}
	
	public double diagonal() {
		return Math.sqrt(altura * altura + largura * largura);
	}

}
