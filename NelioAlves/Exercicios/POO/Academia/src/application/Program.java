/*1) Implemente uma classe que represente o aluno de uma academia.
Os atributos são: identificador, nome, idade, peso e altura.
Os métodos são:
· Um construtor sem parâmetros e um construtor com parâmetros
· Um método get e um método set para cada atributo
· Um método para exibir os atributos. void exibir( )
· Um método para calcular o IMC do aluno, sabendo-se que IMC=peso/altura^2
float calcularIMC( )
MENU
1 – Cadastrar Aluno
2 – Listar Alunos (somente nome)
3 – Relatório Geral (exibe todas as informações)
9 – Sair*/

// Criando sem lista até o momento

package application;

import java.util.Scanner;
import entities.Alunos;

public class Program {

    private static Alunos aluno;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 – Cadastrar Aluno");
            System.out.println("2 – Listar Aluno (somente nome)");
            System.out.println("3 – Relatório Geral (exibe todas as informações)");
            System.out.println("9 – Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastrarAluno(sc);
                    break;
                case 2:
                    listarAlunos();
                    break;
                case 3:
                    relatorioGeral();
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 9);

        sc.close();
    }

    private static void cadastrarAluno(Scanner sc) {
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        System.out.print("Peso (kg): ");
        float peso = sc.nextFloat();
        System.out.print("Altura (m): ");
        float altura = sc.nextFloat();
        sc.nextLine();

        aluno = new Alunos(nome, idade, peso, altura);

        System.out.println("Aluno cadastrado com sucesso!");
    }

    private static void listarAlunos() {
        System.out.println("Nome: " + aluno.getNome());
           
    }

    private static void relatorioGeral() {
    	aluno.exibir(); 
       
    }
}
