package application;

/*Uma empresa possui funcionários próprios e terceirizados. Para cada funcionário, 
 * deseja-se registrar nome, horas trabalhadas e valor por hora. Funcionários terceirizados possuem ainda uma despesa adicional.

O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas trabalhadas, 
sendo que os funcionários terceirizados ainda recebem um bônus correspondente a 110% de sua despesa adicional.

Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário) e 
armazená-los em uma lista. Depois de ler todos os dados, mostrar nome e pagamento de cada 
funcionário na mesma ordem em que foram digitados.

*UML FORNECIDO NA ATIVIDADE*/

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
