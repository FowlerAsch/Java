package application;
import java.util.Scanner;

import entitites.Retangulo;


public class Progrma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.print("Entre com a Altura: ");

		
		System.out.print("Entre com a Largura");

		
		System.out.printf("AREA = %.2f%n", retangulo.area());
		System.out.printf("PERIMETER = %.2f%n", retangulo.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());
		sc.close();
		
	}

}
