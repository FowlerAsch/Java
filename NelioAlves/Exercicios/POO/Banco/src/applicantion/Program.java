/*Desenvolva um programa para criar uma conta bancária. O programa deve permitir que 
 o usuário informe o nome do titular, o saldo inicial e se deseja fazer um depósito inicial. 
 Crie uma classe que tenha métodos para saque e depósito. Cada saque deve ter uma taxa de R$5,00.

Requisitos:

Classe ContaBancaria com métodos para saque (com taxa) e depósito.
O programa deve permitir operações de depósito e saque, mostrando o
saldo atualizado após cada operação.*/

package applicantion;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);

		
		
		System.out.print("");
		String nome = sc.nextLine();
		
		
		System.out.print("");
		double saldo = sc.nextDouble();
		
		System.out.print("Deseja fazer um deposito Inicial?");
		double deposito = sc.nextDouble();
		
		
		
		
		
		

	}

}
