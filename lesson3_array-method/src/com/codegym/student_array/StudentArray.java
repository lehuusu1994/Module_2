package com.codegym.student_array;

import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michel","Camila","Sennia","Tanya","Connor","Zachariah","Mallory"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name’s student:");
        String input_name = sc.nextLine();
        boolean isExit = false;
        for (int i = 0 ;i < students.length ; i++){
            if (students[i].equals(input_name)){
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                isExit = true;
                break;
            }
        }
        if (!isExit){
            System.out.println("Not found" + input_name + " in the list.");
        }

    }
}
