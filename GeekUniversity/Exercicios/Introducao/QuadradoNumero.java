/*Faça um programa que peça ao usuário para digitar um número real e imprima o resultado do
quadrado desse número. */

/*Create a program that asks the user to input a real number and prints the square of that number.*/

import java.util.Scanner;

public class QuadradoNumero {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a real number: ");
        double realNumber = sc.nextDouble();

        double square = calculateSquare(realNumber);

        System.out.printf("The square of the number is: %.2f%n", square);

    }

    private static double calculateSquare(double realNumber){

        return realNumber * realNumber;

    }

}