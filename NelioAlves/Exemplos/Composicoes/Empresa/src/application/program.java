package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.HoraDoContrato;
import entities.Funcionarios;
import entities.enums.Senioridade;

public class program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String nomedoDepartamento = sc.nextLine();
		
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String nomeDoFuncionario = sc.nextLine();
		
		System.out.print("Level: ");
		String senioridadeDoFuncionario = sc.nextLine();
		
		System.out.print("Base salary: ");
		double salarioBase = sc.nextDouble();
		
		Funcionarios funcionario = new Funcionarios(nomeDoFuncionario, Senioridade.valueOf(senioridadeDoFuncionario), salarioBase, new Departamento(nomedoDepartamento));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date dataDoContrato = sdf.parse(sc.next());
			
			System.out.print("Value per hour: ");
			double valorPorHora = sc.nextDouble();
			
			System.out.print("Duration (hours): ");
			int horas = sc.nextInt();
			
			HoraDoContrato contrato = new HoraDoContrato(dataDoContrato, valorPorHora, horas);
			funcionario.AdicionarContrato(contrato);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + Funcionarios.getNome());
		System.out.println("Department: " + funcionario.getDepartamento().getNome());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", funcionario.rendimento(year, month)));
		
		sc.close();
	}
}