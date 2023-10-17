package com.codegym.find_min_element;

public class NumberArray {
    public static void main(String[] args) {
        int [] arr = {2,5,7,9,0,6,3};

        System.out.println("The smallest element in the array is:" + minValue(arr));

    }
    public static  int minValue(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length;i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }return  min;
    }
}
