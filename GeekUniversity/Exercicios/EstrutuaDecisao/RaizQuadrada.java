/*Faça um programa que peça ao usuário para digitar um número. Se esse número for positivo,
calcule a raiz quadrada do número. Se o número for negativo, mostre uma mensagem dizendo
que o número é inválido. */

import java.util.Scanner;

public class RaizQuadrada {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Vamos tirar a raiz quadrada!\nDigite um número positivo: ");
        double numero = sc.nextInt();

        verificarNumero(numero);

    }

    private static void verificarNumero(double numero) {
        if (numero >= 0) {

            calcularRaizQuadrada(numero);
        } else {

            System.out.println("Número inválido. Não é possível calcular a raiz quadrada de um número negativo.");
        }
    }

    private static void calcularRaizQuadrada(double numero) {

        double raizQuadrada = Math.sqrt(numero);

        System.out.println("A raiz quadrada de " + numero + " é: " + raizQuadrada);
    }
    
}
