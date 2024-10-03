/*Create a program that reads an integer and prints it.*/

import java.util.Scanner;

public class Imprimir {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: "); 

        int number = sc.nextInt(); 

        System.out.printf("The number is: %d%n", number); 

        sc.close(); 
    }
}