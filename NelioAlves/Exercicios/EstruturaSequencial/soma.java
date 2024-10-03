/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.

"Make a program to read two integer values 
and then display the sum of these numbers on the screen with an explanatory message, according to the examples."*/

import java.util.Scanner;

public class soma {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double FirstNumber = sc.nextDouble();

        System.out.print("Enter first number: ");
        double SecondNumber = sc.nextDouble();

        double sum = CalculteSoma(FirstNumber, SecondNumber);

        System.out.print(sum);

    }

    private static double CalculteSoma(double FirstNumber, double SecondNumber){

        return FirstNumber + SecondNumber;

    }
}