/*Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.*/

package application;

import java.util.Scanner;
import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite a altura: ");
		
		retangulo.altura = sc.nextDouble();
		
		System.out.println("Digita a Largura: ");
		retangulo.largura = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", retangulo.area());
		System.out.printf("Perimetro = %.2f%n", retangulo.perimetro());
		System.out.printf("Diagonal = %.2f%n", retangulo.diagonal());
		
		sc.close();

	}

}
