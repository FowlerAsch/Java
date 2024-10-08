/*3. Escreva um programa que tenha uma função que recebe dois valores inteiros e retorna o
maior. */

import java.util.Scanner;

public class MaiorNumero {

    private static double num1;
    private static double num2;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        num1 = sc.nextDouble();

        System.out.print("Digite o segundo número inteiro: ");
        num2 = sc.nextDouble();

        double maior = encontrarMaior();

        System.out.println("O maior número é: " + maior);

        sc.close();
    }

    public static double encontrarMaior() {
  
        if (num1 > num2){
            return num1;
        }

        else{
            return num2;
        }
    }
}
