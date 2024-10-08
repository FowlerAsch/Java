/*Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
duas casas decimais. */

import java.util.Scanner;

class Pessoa {
    
    private double salario;
    private double imposto;

    public Pessoa(double salario) {
        this.salario = salario;
        this.imposto = 0.0;
    }

    public double calcularImposto() {

        if (salario <= 2000.00) {
            imposto = 0;
        }
        else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
        }
        else if (salario <= 4500.00) {
            imposto = (1000.00 * 0.08) + ((salario - 3000.00) * 0.18);
        }
        else {
            imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + ((salario - 4500.00) * 0.28);
        }

        return imposto;
    }

    public void exibirImposto() {

        if (imposto == 0.0) {
            System.out.println("Isento");
        } 
        
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }
    }

    public void exibirSalario() {
        System.out.printf("Salário: R$ %.2f%n", salario);
    }
}

public class ImpostoDeRendaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();

        Pessoa pessoa = new Pessoa(salario);

        pessoa.exibirSalario();

        pessoa.calcularImposto();
        pessoa.exibirImposto();

        sc.close();
    }
}
