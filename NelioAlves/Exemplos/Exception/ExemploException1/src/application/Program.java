package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		metodo1();
		System.out.println("End of program");
	}

	public static void metodo1() {
		System.out.println("***METODO 1 START***");
		metodo2();
		System.out.println("***METODO 1 END***");
	}

	public static void metodo2() {

		System.out.println("***METODO 2 START***");

		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" "); // abrindo um vetor de string particionado por espaços em branco
														// onde cada espaço em branco vai definir o index
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace(); // analisar o caminho que foi feito até dar erro
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		sc.close();
		System.out.println("***METHOD2 END***");
	}
}