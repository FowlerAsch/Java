package application;

import entities.Conta;
import entities.ContaEmpresarial;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		
	Conta conta1 = new Conta(1001, "ALex", 1000.0);
	conta1.saque(200.0);
	System.out.print(conta1.getSaldo());
	System.out.println();
	
	Conta conta2 = new ContaPoupanca(1002, "Bia", 1000.0, 0.01);
	conta2.saque(200.0);
	System.out.print(conta2.getSaldo());
	System.out.println();
	
	Conta conta3 = new ContaEmpresarial (1003, "Carlos", 1000.0, 500.0);
	conta3.saque(200.0);
	System.out.print(conta3.getSaldo());
	System.out.println();
		
	}

}
