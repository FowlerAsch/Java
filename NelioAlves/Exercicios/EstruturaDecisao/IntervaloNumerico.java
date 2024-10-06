/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”. */


/*"You must write a program that reads any value and displays a message indicating 
in which of the following intervals ([0,25], (25,50], (50,75], (75,100]) this value is found. Obviously,
if the value is not within any of these intervals, the message 'Out of range' should be printed." */

import java.util.Scanner;

public class IntervaloNumerico {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Digite um valor para saber em qual intevalo ele se encaixa: ");
        int numero = sc.nextInt();

        verificarValor(numero);

        sc.close();

    }
    
    public static void verificarValor(int numero){

        if (numero >= 0 && numero <= 25) {
            System.out.println("Intervalo [0,25]");
        } 
        else if (numero > 25 && numero <= 50) {
            System.out.println("Intervalo (25,50]");
        } 
        else if (numero > 50 && numero <= 75) {
            System.out.println("Intervalo (50,75]");
        } 
        else if (numero > 75 && numero <= 100) {
            System.out.println("Intervalo (75,100]");
        } 
        else {
            System.out.println("Fora de intervalo");
        }

    }
}
