package applicantion;

import java.util.Scanner;

import entities.operacoesBancarias;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		operacoesBancarias operacoes;
		
		System.out.print("Informe o número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Informe o nome do titular: ");
        String titularConta = sc.nextLine();

        System.out.print("Há um depósito inicial (s/n)? ");
        char DepositoInicial = sc.next().charAt(0);


        if (DepositoInicial == 's' || DepositoInicial == 'S') {
        	
            System.out.print("Informe o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            
            operacoes = new operacoesBancarias(numeroConta, titularConta, depositoInicial);
            
        } 
        
        else {
        	operacoes = new operacoesBancarias(numeroConta, titularConta);
        }

        System.out.println("Dados da conta:");
        System.out.println(operacoes.toString());

        System.out.print("Informe um valor para depósito: ");
        double valorDeposito = sc.nextDouble();
        operacoes.depositar(valorDeposito);
        
        System.out.println("Dados atualizados da conta:");
        System.out.println(operacoes.toString());

        System.out.print("Informe um valor para saque: ");
        double valorSaque = sc.nextDouble();
        operacoes.sacar(valorSaque);
        
        System.out.println("Dados atualizados da conta:");
        System.out.println(operacoes.toString());

        sc.close();

	}

}
