package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.PessoaJuridica;
import entities.PessoaFisica;
import entities.Contribuente;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuente> list = new ArrayList<>();
		
		System.out.print("Entre com o número de Contribuentes: ");
		int numeroDeContribuentes = sc.nextInt();
		
		for (int i=1; i<=numeroDeContribuentes; i++) {
			
			System.out.println("Dados do contribuinte #" + i + ":");
            System.out.print("Pessoa física ou jurídica (f/j)? ");
			char escolhaDeContribuente = sc.next().charAt(0);
			
			System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
			
            System.out.print("Renda anual: ");
            double rendaAnual = sc.nextDouble();
            
            if (escolhaDeContribuente == 'f') {
                System.out.print("Despesas com saúde: ");
                double despesasSaude = sc.nextDouble();
                list.add(new PessoaFisica(nome, rendaAnual, despesasSaude));
            }
            else {
                System.out.print("Número de funcionários: ");
                int numeroFuncionarios = sc.nextInt();
                list.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
            }
        }

		double soma = 0.0;
        System.out.println();
        System.out.println("IMPOSTOS PAGOS:");
        
        for (Contribuente contrib : list) {
        	
            double imposto = contrib.Imposto();
            System.out.println(contrib.getNome() + ": R$ " + String.format("%.2f", imposto));
            soma += imposto;
        }
        
        System.out.println();
        System.out.println("TOTAL DE IMPOSTOS: R$ " + String.format("%.2f", soma));
        
        sc.close();
	}
}
