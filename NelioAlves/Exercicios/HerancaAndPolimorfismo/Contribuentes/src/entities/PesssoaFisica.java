package entities;

public class PesssoaFisica extends Contribuente {
	
	private double despesasComSaude;
	
	public PesssoaFisica() {
		super();
	}
	
	public PesssoaFisica(String nome, double rendaAnual, double despesasComSaude) {
		super();
		this.despesasComSaude = despesasComSaude;
	}

	public void setDespesasComSaude(double despesasComSaude) {
		this.despesasComSaude = despesasComSaude;
	}
	
	public double getDespesasComSaude() {
		return despesasComSaude;
	}
	
	@Override
	public Double Imposto() {
		if (getRendaAtual() < 20000.0) {
			return getRendaAtual() * 0.15 - despesasComSaude * 0.5;
		}
		else {
			return getRendaAtual() * 0.25 - despesasComSaude * 0.5;
		}
	}
	
}
