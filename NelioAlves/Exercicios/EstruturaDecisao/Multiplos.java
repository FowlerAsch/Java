/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente. */

import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o Primeiro Número: ");
        int PrimeiroNumero = sc.nextInt();


        System.err.print("Digite o Segundo Número: ");
        int SegundoNumero = sc.nextInt();

        calcularMultiplos(PrimeiroNumero, SegundoNumero);

    }
    
    public static void calcularMultiplos (int PrimeiroNumero, int SegundoNumero){
 
        if (PrimeiroNumero % SegundoNumero == 0 || SegundoNumero % PrimeiroNumero == 0) {
            System.out.println("São Multiplos");
        } else {
            System.out.println("Não são Multiplos");
        }
    }
}
