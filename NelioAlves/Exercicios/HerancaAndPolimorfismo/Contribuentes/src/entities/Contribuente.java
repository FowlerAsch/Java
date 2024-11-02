package entities;

public abstract class Contribuente {
	
	private String nome;
	private double rendaAnual;
	

	public Contribuente(){
		
	}

	public Contribuente(String nome, double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setRendaAtual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public double getRendaAtual() {
		return rendaAnual;
	}
	
	public abstract Double Imposto();
	
	
	

}
