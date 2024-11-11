package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe os dados da conta");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		
		System.out.print("Titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		
		System.out.print("Saldo inicial: ");
		double saldo = sc.nextDouble();
		
		System.out.print("Limite de saque: ");
		double limiteDeSaque = sc.nextDouble();
		
		Conta conta = new Conta (numero, titular, saldo, limiteDeSaque);
		
		System.out.print("Informe uma quantia que deseja sacar: ");
		double valor = sc.nextDouble();
		
		try{
			conta.sacar(valor);
			System.out.printf("Novo saldo: %.2f%n", conta.getSaldo());
		}
		
		catch(BusinessException e){
			System.out.print(e.getMessage());
		}
		
		sc.close();
	}

}
