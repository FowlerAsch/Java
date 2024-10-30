package entities;

public class Produtos {
	
	private String nome;
	private Double preco;
	
	public Produtos() {
		
	}
	
	public Produtos(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public String precoEtiqueta() {
		return nome 
				+ " $ " 
				+ String.format("%.2f", preco);
	}

}
