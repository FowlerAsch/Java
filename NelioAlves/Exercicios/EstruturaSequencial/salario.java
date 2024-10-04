/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais. */

import java.util.Scanner;

public class salario {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite seu código: ");
        int codigoFuncionario = sc.nextInt(); 

        System.out.print("Digite seu número de horas trabalhadas: ");
        double horasTrabalhadas = sc.nextDouble();

        System.out.print("Valor por hora: ");
        double valorPorHora = sc.nextDouble();

        System.out.print("Número: " + codigoFuncionario);
        System.out.print("O valor do salário é: " + calcularSalario(horasTrabalhadas, valorPorHora));

    }

    private static double calcularSalario (double horasTrabalhadas, double valorPorHora){

        return horasTrabalhadas * valorPorHora;

    }
    
}
