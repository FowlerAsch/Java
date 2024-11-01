package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Formas;
import entities.Retangulo;
import entities.Circulo;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Formas> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Forma #" + i + " data:");
			System.out.print("Retangulo or Circulo (r/c)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Cores (BLACK/BLUE/RED): ");
			Color cores = Color.valueOf(sc.next());
			
			if (ch == 'r') {
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				
				list.add(new Retangulo(cores, altura, largura));
			}
			else {
				System.out.print("Radius: ");
				double raio = sc.nextDouble();
				
				list.add(new Circulo(cores, raio));
			}
		}
		
		System.out.println();
		System.out.println("Formas:");
		for (Formas formas : list) {
			System.out.println(String.format("%.2f", formas.area()));
		}
		
		sc.close();
	}
}