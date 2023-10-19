package com.codegym.quadratic_equation;

import java.util.Scanner;

public class QuadraticEquationTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        double a = sc.nextDouble();
        System.out.println("Enter b :");
        double b = sc.nextDouble();
        System.out.println("Enter c :");
        double c = sc.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a , b,c );
        double discriminant = equation.getDiscriminant();


        if (discriminant > 0) {
            double root1 = equation.getRoot1();
            double root2 = equation.getRoot2();
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            System.out.println("The equation has no roots");
        }
    }

}
