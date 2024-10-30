package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Produtos;
import entities.ProdutosImportados;
import entities.ProdutosUsados;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List <Produtos> list = new ArrayList<>();

		System.out.print("Entre com o numero de produtos: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Datos do produto #" + i + ":");
			System.out.print("Comum, usado, importado (c/u/i)? ");
			char type = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Preco: ");
			double preco = sc.nextDouble();
			
			if (type == 'c') {
				list.add(new Produtos(nome, preco));
			} else if (type == 'u') {
				System.out.print("Data de fabricacao (DD/MM/YYYY): ");
				LocalDate dataDeFabricacao = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new ProdutosUsados(nome, preco, dataDeFabricacao));
			} else {
				System.out.print("Taxa de importacao: ");
				double taxaDeImportacao = sc.nextDouble();
				list.add(new ProdutosImportados(nome, preco, taxaDeImportacao));
			}
		}

		System.out.println();
		System.out.println("ETIQUETAS DE PRECO:");
		for (Produtos prod : list) {
			System.out.println(prod.precoEtiqueta());
		}

		sc.close();

	}

}
