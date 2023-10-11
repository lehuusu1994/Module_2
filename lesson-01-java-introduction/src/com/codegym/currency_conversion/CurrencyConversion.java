package com.codegym.currency_conversion;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vnd = 23000;
        double usa;
        System.out.println("Mời bạn nhập số USĐ :");
        usa = sc.nextDouble();
        double quyDoi = usa * vnd;
        System.out.println("Giá trị VNĐ :" + quyDoi);
    }
}
