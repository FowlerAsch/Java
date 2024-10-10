/*Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.*/

package entities;

public class Retangulo {
	
	public double altura;
	public double largura;
	
	public double area() {
		return altura * largura;
	}
	
	public double perimetro() {
		return 2 * (altura + largura);
	}
	
	public double diagonal() {
		return Math.sqrt(altura * altura + largura * largura);
	}

}
