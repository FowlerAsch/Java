package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Alunos;

public class Program {
	
    private static ArrayList<Alunos> alunos = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = sc.nextInt();
            sc.nextLine(); 
            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    listarAlunos();
                    break;
                case 3:
                    relatorioGeral();
                    break;
                case 9:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 9);
    }

    private static void exibirMenu() {
        System.out.println("\nMENU");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Listar Alunos (somente nome)");
        System.out.println("3 - Relatório Geral (exibe todas as informações)");
        System.out.println("9 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarAluno() {
        System.out.println("\nCadastro de Aluno");
        System.out.print("Identificador: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Peso (kg): ");
        float peso = sc.nextFloat();

        System.out.print("Altura (m): ");
        float altura = sc.nextFloat();

        Alunos aluno = new Alunos(id, nome, idade, peso, altura);
        alunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    private static void listarAlunos() {
       for (Alunos aluno : alunos) {
    	   System.out.print(aluno.getNome());
    	   
       }

    }

    private static void relatorioGeral() {
        System.out.println("\nRelatório Geral:");
        for (Alunos aluno : alunos) {
            aluno.exibir();
            System.out.println("--------------------");
        }
    }
}
