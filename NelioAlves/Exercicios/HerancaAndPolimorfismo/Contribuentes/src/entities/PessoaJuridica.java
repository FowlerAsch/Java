package entities;

public class PessoaJuridica extends Contribuente {
	
	private int numeroDeEmpregados;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, double rendaAnual, int numeroDeEmpregados) {
		super();
		this.numeroDeEmpregados = numeroDeEmpregados;
	}
	
	public void setNumeroDeEmpregados(int numeroDeEmpregados) {
		this.numeroDeEmpregados = numeroDeEmpregados;
	}
	
	public int getNumeroDeEmpregados() {
		return numeroDeEmpregados;
	}
	
	@Override
	public Double Imposto() {
		if (numeroDeEmpregados > 10) {
			return getRendaAtual() * 0.14;
		}
		else {
			return getRendaAtual() * 0.16;
		}
	}
	
	
}
