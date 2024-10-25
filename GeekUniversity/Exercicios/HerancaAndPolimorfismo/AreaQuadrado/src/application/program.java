package application;
import java.util.Scanner;

import entities.Quadrado;

public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do lado do quadrado: ");
        double lado = sc.nextDouble();
		
		Quadrado quadrado = new Quadrado(lado);
		quadrado.imprimir();
		
		sc.close();
	}

}
