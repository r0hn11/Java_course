package com.complete.basics;
import java.util.Scanner;

public class Practice2 {
    static Scanner sc = new Scanner(System.in);

    public static void encrypt(){
        System.out.print("Grade: ");
        char grade = sc.next().charAt(0);
        System.out.println((char)(grade+7));
    }
    public static void decrypt(){
        System.out.print("Encrypted Grade: ");
        char grade = sc.next().charAt(0);
        System.out.println((char)(grade-7));
    }

    public static void main(String[] args) {
        encrypt();
        decrypt();
    }
}
