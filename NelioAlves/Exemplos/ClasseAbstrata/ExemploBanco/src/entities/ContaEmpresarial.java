package entities;

public class ContaEmpresarial extends Conta {

	private double LimiteEmprestimo;

	public ContaEmpresarial() {
		super(); // É pra executar a lógica do construtor da classe base
	}

	public ContaEmpresarial(int numero, String titular, double saldo, double LimiteEmprestimo) {
		super(numero, titular, saldo);
		this.LimiteEmprestimo = LimiteEmprestimo;
	}

	public double getLimiteEmprestimo() {
		return LimiteEmprestimo;
	}

	public void setLimiteEmprestimo(double LimiteEmprestimo) {
		this.LimiteEmprestimo = LimiteEmprestimo;
	}

	public void emprestimo(double quantidade) {
		if (quantidade <= LimiteEmprestimo) {
			saldo += quantidade - 10.0;
		}
	}

	@Override // Serve para sinalizar que o método está sobrescrito
	public void saque(double quantidade) { // Sobreposição do método de saque da classe conta
		super.saque(quantidade); // utiliza toda operação feita no método saque em conta e adiciona uma nova
									// operação escrita em conta Empresarial
		// ou seja, vai retirar 5 da classe conta e mais 2 da nova operação feita em
		// contaEmpresarial
		saldo -= 2.0;
	}

}
