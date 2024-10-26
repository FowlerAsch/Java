package application;

import java.util.Scanner;
import entities.Moto;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a marca: ");
        String marca = sc.nextLine();
        
        System.out.print("Digite o modelo: ");
        String modelo = sc.nextLine();
        
        System.out.print("Digite a cor: ");
        String cor = sc.nextLine();
        
        System.out.print("Digite a marcha: ");
        int marcha = sc.nextInt();
        
        Moto moto = new Moto(marca, modelo, cor, marcha);

        System.out.println("\nDados da moto:");
        moto.imprimir();
        
        System.out.print("\nDigite a nova marcha: ");
        int novaMarcha = sc.nextInt();
        moto.trocarMarcha(novaMarcha);
        
        System.out.println("\nDados atualizados da moto:");
        moto.imprimir();
        
        sc.close();
    }
}
