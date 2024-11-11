package entities;

import exceptions.BusinessException;

public class Conta {
	
	private int numero;
	private String titular;
	private double saldo;
	private double LimiteDeSaque;
	
	public Conta() {
		
	}
	
	public Conta(int numero, String titular, double saldo, double LimiteDeSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.LimiteDeSaque = LimiteDeSaque;
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

	public double getSaldo() {
		return saldo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setLimiteDeSaque(double limiteDeSaque) {
		LimiteDeSaque = limiteDeSaque;
	}


	public double getLimiteDeSaque() {
		return LimiteDeSaque;
	}

	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void sacar (double valor) {
		saldo -= valor;
	}
	
	public void validandoSaque(double valor) {
		if (valor > getLimiteDeSaque()) {
			throw new BusinessException("Erro de saque: A quantia excede o limite de saque");
		}
		if (valor > getSaldo()) {
			throw new BusinessException("Erro de saque: Saldo insuficiente");
		}
	}
}
