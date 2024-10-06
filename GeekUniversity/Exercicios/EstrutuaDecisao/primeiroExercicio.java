/*Faça um programa que peça ao usuário para digitar dois números e mostre qual deles é o
maior. */

import java.util.Scanner;

public class primeiroExercicio {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Digite o Primeiro Número: ");
        double primeiroNumero = sc.nextDouble();

        System.out.print("Digite o Segundo Número: ");
        double segundoNumero = sc.nextDouble();

        double MaiorNumero = EncontrarMaiorNumero(primeiroNumero, segundoNumero);

        System.out.print("O maior número é: " +  MaiorNumero);

    }

    private static double EncontrarMaiorNumero(double primeiroNumero, double segundoNumero){

    if (primeiroNumero > segundoNumero){
        return primeiroNumero;
    }
    else{
        return segundoNumero;
    }

    }
}