package entities;

public class Alunos {

    private int identificador;
    private String nome;
    private int idade;
    private float peso;
    private float altura;

    public Alunos() {}

    public Alunos(int identificador, String nome, int idade, float peso, float altura) {
        this.identificador = identificador;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void exibir() {
        System.out.println("ID: " + identificador);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("IMC: " + calcularIMC());
    }

    public float calcularIMC() {
        return peso / (altura * altura);
    }
}
