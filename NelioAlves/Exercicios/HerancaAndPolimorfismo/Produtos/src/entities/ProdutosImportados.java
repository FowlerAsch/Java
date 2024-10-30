package entities;

public class ProdutosImportados extends Produtos{

	private double taxaDeImportacao;
	
	public ProdutosImportados() {
		super();
	}
	
	public ProdutosImportados(String nome, Double preco, double taxaDeImportacao) {
		super();
		this.taxaDeImportacao = taxaDeImportacao;
	}
	
	public void setTaxaDeImportacao(Double taxaDeImportacao) {
		this.taxaDeImportacao = taxaDeImportacao;
	}
	
	public double getTaxaDeImportacao() {
		return taxaDeImportacao;
	}
	
	public Double totalPrreco() {
		return getPreco() + taxaDeImportacao;
	}

	@Override
	public String precoEtiqueta() {
		return getNome() 
				+ " $ " 
				+ String.format("%.2f", totalPrreco())
				+ " (Customs fee: $ " 
				+ String.format("%.2f", taxaDeImportacao)
				+ ")";
	}
	
}
