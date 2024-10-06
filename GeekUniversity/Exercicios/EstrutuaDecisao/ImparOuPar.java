/*Faça um programa que peça ao usuário para digitar um número e diga se o número digitado é
par ou ímpar. */

import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);


        System.out.print("Vamos advinnhar ser o número é par ou impar!\nDgite um número:");
        int numero = sc.nextInt();

        analisarNumero(numero);

        sc.close();
    }

    private static void analisarNumero(int numero){

        if(numero % 2 == 0){
            System.out.print("O número " + numero + " é Par!");
        }
        else{
            System.out.print("O Número " + numero + " é Ímpar");
        }

    }
}
