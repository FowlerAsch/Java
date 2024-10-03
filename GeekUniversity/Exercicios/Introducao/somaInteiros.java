/* Faça um programa que peça ao usuário para digitar três valores inteiros e imprima a soma
deles.
 */

/*Create a program that asks the user to input three integer values and prints their sum.*/

import java.util.Scanner;

public class somaInteiros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int FirstNumber = sc.nextInt();
        System.out.print("Enter the second number: ");
        int SecondNumber= sc.nextInt();
        System.out.print("Enter the third number: "); 
        int ThirdNumber = sc.nextInt();    

        int sum = calculateSum(FirstNumber, SecondNumber, ThirdNumber);

        System.out.printf("The sum is: %d%n", sum);

    }
    
    private static int calculateSum(int FirstNumber, int SecondNumber, int ThirdNumber){

        return FirstNumber + SecondNumber + ThirdNumber;
        
    }
}
