package com.codegym.check_prime;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = sc.nextInt();
        if (number < 2) {
            System.out.println(number + " is not a prime");
        } else {
            boolean check = true;
            for (int i =2; i < Math.sqrt(number); i++){
                if (number % 2 == 0){
                    check = false;
                    break;
                }
            }if (check){
                System.out.println(number + " is a prime");
            } else {
                System.out.println(number + " is not a prime");
            }
        }
    }
}
