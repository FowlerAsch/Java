import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Contatos contato = new Contatos();
		
		System.out.print("Digite o Nome: ");
		String nome = sc.nextLine();
		contato.setNome(nome);
		
		
		System.out.print("Digite o Email: ");
		String email = sc.nextLine();
		contato.setEmail(email);
		
		System.out.print("Digite o Telefone: ");
		String telefone = sc.nextLine();
		contato.setTelefone(telefone);
		
		System.out.println("\nDados do Contato:");
        contato.imprimirDados();

        sc.close();

	}

}
