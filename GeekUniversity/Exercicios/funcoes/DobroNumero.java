/*1. Faça um programa que possua uma função que recebe como parâmetro um número inteiro e
devolve seu dobro. */

import java.util.Scanner;

public class DobroNumero {

    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = sc.nextInt();

        double resultadoDobro = dobro(numero);
        double resultadoTriplo = triplo(numero);

        System.out.println("O dobro de " + numero + " é: " + resultadoDobro);
        System.out.println("O Triplo de " + numero + " é: " + resultadoTriplo);

        sc.close();
    }

    public static double dobro(double numero) {
        return numero * 2;
    }

    public static double triplo(double numero) {
        return numero * 3;
    }
}