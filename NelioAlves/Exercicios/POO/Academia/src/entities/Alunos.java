package entities;

public class Alunos {

	private String nome;
	private int idade;
	private float peso;
	private float altura;
	
	public Alunos(){					
			
	}

	public Alunos( String nome, int idade, float peso, float altura){
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
			
	}

	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int setIdade() {
		return idade;
	}
	
	public void getIdade(int idade) {
		this.idade = idade;
	}
	
	public float setPeso() {
		return peso;
	}
	
	public void getPeso(float peso) {
		this.peso = peso;
	}
	
	public float setAltura() {
		return altura;
	}
	
	public void getAltura(float altura) {
		this.altura = altura;
	}
	
	public float calcularIMC() {
		return peso / (altura * altura);
	}
	
	public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
    }
	
	

}
