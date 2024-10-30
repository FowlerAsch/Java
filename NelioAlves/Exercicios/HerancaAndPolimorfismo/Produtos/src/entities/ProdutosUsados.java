package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutosUsados extends Produtos{

	private LocalDate  dataDeFabricacao;
	
	public ProdutosUsados() {
		super();
	}
	
	public ProdutosUsados(String nome, double preco, LocalDate  dataDeFabricacao) {
		super();
		this.dataDeFabricacao = dataDeFabricacao;
	}

	public LocalDate  getDataDeFabricacao() {
		return dataDeFabricacao;
	}
	
	public void setDataDeFabricacao(LocalDate  dataDeFabricacao) {
		this.dataDeFabricacao = dataDeFabricacao;
	}
	
	@Override
	public String precoEtiqueta() {
		return getNome() 
				+ " (used) $ " 
				+ String.format("%.2f", getPreco())
				+ " (Manufacture date: "
				+ dataDeFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ")";
	}
	
}
