package entities;

public class empregados {
	
	private String nome;
	private int horas; 
	private double valorPorHora;
	
	public empregados() {
		
	}
	
	public empregados(String nome, int horas, double valorPorHora) {
		this.nome = nome;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
	}
	
	public int getHours() {
		return horas;
	}

	public void setHours(int horas) {
		this.horas = horas;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double pagamento() {
		return horas * valorPorHora;
	}
	

}
