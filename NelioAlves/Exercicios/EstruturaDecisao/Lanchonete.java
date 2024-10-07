/*escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar. */

import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do item: ");
        int codigo = sc.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = sc.nextInt();

        double total;

        // Verifica o código e calcula o total com base na tabela
        switch (codigo) {
            case 1:
                total = 4.00 * quantidade;
                break;
            case 2:
                total = 4.50 * quantidade;
                break;
            case 3:
                total = 5.00 * quantidade;
                break;
            case 4:
                total = 2.00 * quantidade;
                break;
            case 5:
                total = 1.50 * quantidade;
                break;
            default:
                System.out.println("Código inválido!");
                return;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}
