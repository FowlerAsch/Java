/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do Square que tem lado B.
e) a área do retângulo que tem lados A e B. 

Create a program that reads three double-precision floating-point values: A, B, and C. Then, calculate and display:
a) the area of the right triangle that has A as the base and C as the height.
b) the area of the circle with radius C. (π = 3.14159)
c) the area of the trapezoid that has A and B as bases and C as the height.
d) the area of the square with side B.
e) the area of the rectangle with sides A and B.

*/

import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number A: ");
        double A = sc.nextDouble();

        System.out.println("Enter the number B: ");
        double B = sc.nextDouble();

        System.out.println("Enter the number C: ");
        double C = sc.nextDouble();

        double areaTriangle = calculateAreaTriangle(A, C);
        double areaCircle = calculateAreaCircle(C);
        double areaTrapezoid = calculateAreaTrapezoid(A, B, C);
        double areaSquare = calculateAreaSquare(B);
        double areaRectangle = calculateAreaRectangle(A, B);

        System.out.printf("Area of the Triangle: %.2f%n", areaTriangle);
        System.out.printf("Area of the Circle: %.2f%n", areaCircle);
        System.out.printf("Area of the trapezoid: %.2f%n", areaTrapezoid);
        System.out.printf("Area of the Square: %.2f%n", areaSquare);
        System.out.printf("Area of the rectangle: %.2f%n", areaRectangle);
    }

    private static double calculateAreaTriangle(double A, double C) {
        return (A * C) / 2; 
    }

    private static double calculateAreaCircle(double C) {
        double PI = Math.PI;
        return PI * C * C;
    }

    private static double calculateAreaTrapezoid(double A, double B, double C) {
        return ((A + B) * C) / 2; 
    }

    private static double calculateAreaSquare(double B) {
        return B * B; 
    }

    private static double calculateAreaRectangle(double A, double B) {
        return A * B; 
    }
}
