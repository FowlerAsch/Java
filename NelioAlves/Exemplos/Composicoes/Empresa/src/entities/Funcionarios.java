package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.Senioridade;

public class Funcionarios {
	
	//Atributos
	private String nome;
	private Senioridade level;
	private Double salarioBase;
	
	private Departamento departamento;
	private List<HoraDoContrato> contratos = new ArrayList<>();
	
	public Funcionarios() {
		
	}
	
	public Funcionarios(String nome, Senioridade level, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.level = level;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Senioridade getLevel() {
		return level;
	}

	public void setLevel(Senioridade level) {
		this.level = level;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HoraDoContrato> getContratos() {
		return contratos;
	}
	
	public void AdicionarContrato(HoraDoContrato contrato) {
		contratos.add(contrato);
	}
	
	public void removerContrato(HoraDoContrato contrato) {
		contratos.remove(contrato);
	}
	
	public double rendimento (int year, int month) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		
		for (HoraDoContrato c : contratos) {
			cal.setTime(c.getData());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				soma += c.ValorTotal();
			}
		}
		return soma;
	}	

}
