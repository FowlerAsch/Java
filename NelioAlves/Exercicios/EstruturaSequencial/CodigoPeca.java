/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
*/

import java.util.Scanner;

public class CodigoPeca {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o Código peça: ");
        int CodigoPeca1 = sc.nextInt();

        System.out.print("Digite quantas peças deseja adquitir: ");
        int QuantidadePecas = sc.nextInt();

        System.out.print("Digite o preço unitário de cada peça: ");
        double PrecoUnitario = sc.nextDouble();
        
        System.out.print("Digite o Código peça: ");
        int CodigoPeca2 = sc.nextInt();

        System.out.print("Digite quantas peças deseja adquitir: ");
        int QuantidadePecas2 = sc.nextInt();

        System.out.print("Digite o preço unitário de cada peça: ");
        double PrecoUnitario2 = sc.nextDouble();

        double total = CalcularPreco(QuantidadePecas, QuantidadePecas2, PrecoUnitario, PrecoUnitario2);

        System.out.printf("O valor total é: %.2f%n", total);

    }


    private static double CalcularPreco (int QuantidadePecas, int QuantidadePecas2, double PrecoUnitario, double PrecoUnitario2){

        return PrecoUnitario * QuantidadePecas + PrecoUnitario2 * QuantidadePecas2;

    }
}
