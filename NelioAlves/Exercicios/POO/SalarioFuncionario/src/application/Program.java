/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
projetada abaixo.*/

package application;

import java.util.Scanner;
import entities.Empregado;

public class Program {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		
		Empregado empregado = new Empregado();
		
		System.out.print("Digite o nome: ");
		empregado.nome = sc.nextLine();
		
		System.out.print("Digite o salário bruto: ");
		empregado.salarioBruto = sc.nextDouble();
		
		System.out.print("Digite a quantidade de imposto: ");
		empregado.imposto = sc.nextDouble();
		
		System.out.print("Qual a porcentagem para aumentar o salário? ");
		double porcentagem = sc.nextDouble();
		
		empregado.aumentarSalario(porcentagem);
		
		System.out.println();
		System.out.println("Dados atualizados: " + empregado);
		sc.close();

	}

}
