package application;

import java.util.ArrayList;
import java.util.Scanner;
import entities.Aluno;

public class Program {
	
	static Scanner sc = new Scanner(System.in);
	private static ArrayList<Aluno> alunos = new ArrayList<>();


	public static void main(String[] args) {
				
		System.out.print("");
		
		System.out.println("\n--- Menu CRUD ---");
        System.out.println("1. Adicionar Aluno");
        System.out.println("2. Listar Alunos");
        System.out.println("3. Atualizar Aluno");
        System.out.println("4. Deletar Aluno");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        switch(opcao){
        
        	case 1:
        		cadastrarAluno();
        	case 2: 
        		listarAluno();
        	case 3: 
        		atualizarAluno();
        	case 4:
        		excluirAluno();
        }

	}
	
	private static void cadastrarAluno() {
		
		System.out.print("Digite o nome do aluno: ");
		String nome = sc.nextLine();
		System.out.print("Idade do Aluno: ");
		int idade = sc.nextInt();
		System.out.print("Peso do Aluno: ");
		double peso = sc.nextDouble();
		System.out.print("Altura do Aluno: ");
		double altura = sc.nextDouble();
		
		Aluno aluno = new Aluno(nome, idade, peso, altura);
		alunos.add(aluno);
	}
	
	private static void listarAluno() {
		
	}
	
	private static void excluirAluno() {
		
	}
	
	private static void atualizarAluno() {
		
	}

}
