/*Create a program to read the value of the radius of a circle, 
and then display the value of the area of this circle with four decimal places according to the examples.
Formula for the area: area = π . radius²
Consider the value of π = 3.14159.


Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159

*/

import java.util.Scanner;

public class RaioCirculo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        double area = CalculateArea(radius);

        System.out.printf("The area is: %.2f%n", area);

    }

    private static double CalculateArea (double radius){

        double PI = Math.PI;

        return PI * radius * radius;

    }
}