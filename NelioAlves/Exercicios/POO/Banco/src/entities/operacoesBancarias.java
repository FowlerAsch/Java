package entities;

public class operacoesBancarias {
	
	
	private int numero;
	private String titular;
	private double saldo;
	
	
	public operacoesBancarias() {
		
	}
	
	//Construtor com deposito Inicial
    public operacoesBancarias(int numero, String titular, double depositoInicial) {
        this.numero = numero;
        this.titular = titular;
        depositar(depositoInicial);
    }

    // Construtor sem depósito inicial
    public operacoesBancarias(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }
    
    public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor + 5.0;
	}

	public int getNumero() {
		return numero;
	}


	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	@Override
	public String toString() {
	    return "Conta " + numero + ", Titular: " + titular + ", Saldo: R$ " + String.format("%.2f", saldo);
	}

}
