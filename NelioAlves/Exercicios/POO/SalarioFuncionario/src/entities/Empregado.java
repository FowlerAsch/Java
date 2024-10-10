/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
projetada abaixo.*/

package entities;

public class Empregado {
	
	public String nome;
	public Double salarioBruto;
	public Double imposto;

	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumentarSalario(double porcentagem) {
		salarioBruto += salarioBruto + (porcentagem/100);
	}
	
	public String toString() {
        return nome + ", R$ " + String.format("%.2f", salarioLiquido());
    }

}
