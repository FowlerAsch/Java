/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o Valor de A: ");
        int A = sc.nextInt();

        System.out.print("Digite o Valor de B: ");
        int B = sc.nextInt();

        System.out.print("Digite o Valor de C: ");
        int C = sc.nextInt();

        System.out.print("Digite o Valor de D: ");
        int D = sc.nextInt();


        int diferenca = calcularDiferenca(A, B, C, D);

        // Exibe o resultado da diferença
        System.out.println("A diferença do produto de A e B pelo produto de C e D é: " + diferenca);

        sc.close();

    }

    private static int calcularDiferenca(int A, int B, int C, int D) {
        return (A * B) - (C * D);
    }
}
