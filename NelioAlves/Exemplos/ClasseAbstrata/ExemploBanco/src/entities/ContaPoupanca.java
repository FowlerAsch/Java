package entities;

public final class ContaPoupanca extends Conta {

	private double taxaDeJuros;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(int numero, String titular, double saldo, double taxaDeJuros) {
		super(numero, titular, saldo);
		this.taxaDeJuros = taxaDeJuros;
	}

	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}

	public void atualizarSaldo() {
		saldo += saldo * taxaDeJuros;
	}

	@Override // Serve para sinalizar que o método está sobrescrito
	public void saque(double quantidade) { // Sobreposição do método de saque da classe conta
		saldo -= quantidade;
	}

}