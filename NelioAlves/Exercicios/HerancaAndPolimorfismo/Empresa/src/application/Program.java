package application;

import entities.empregados;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.empregadoTerceirizado;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<empregados> list = new ArrayList<>();
		
		System.out.print("Entre com o número de empregados: ");
		int numeroEmpregados = sc.nextInt();
		
		for (int i = 1; i <= numeroEmpregados; i++) {
		    System.out.println("Dados do empregado #" + i + ":");
		    System.out.print("Terceirizado (s/n)? ");
		    char ch = sc.next().charAt(0);
		    sc.nextLine();
		    
		    System.out.print("Nome: ");
		    String nome = sc.nextLine();
		    
		    System.out.print("Horas: ");
		    int horas = sc.nextInt();
		    
		    System.out.print("Valor por hora: ");
		    double valorPorHora = sc.nextDouble();
		    
		    if (ch == 's') {
		        System.out.print("Custo adicional: ");
		        double custoAdicional = sc.nextDouble();
		        list.add(new empregadoTerceirizado(nome, horas, valorPorHora, custoAdicional));
		    } 
		    else {
		        list.add(new empregados(nome, horas, valorPorHora));
		    }
		}
		
		System.out.println();
		System.out.println("PAGAMENTOS:");
		for (empregados emp : list) {
		    System.out.println(emp.getNome() + " - R$ " + String.format("%.2f", emp.pagamento()));
		}
		
		sc.close();

	}

}
