package com.complete.basics;
import java.util.Scanner;

public class Practice1 {
    static Scanner sc = new Scanner(System.in);

    public static int sum(int n1,int n2,int n3){ return n1+n2+n3; }
    public static double cgpa(float a,float b,float c){ return (a+b+c)/30; }
    public static void greet(){
        System.out.print("Name: ");
        String name = sc.next();
        System.out.printf("Hello there, %s\n",name);
    }
    public static double kmToMile(){
        System.out.print("km: ");
        double km = sc.nextFloat();
        double mi = km/1.61;
        return mi;
    }
    public static boolean checkInt(){
        System.out.println("Enter a check: ");
        return sc.hasNextInt();
    }

    public static void main(String[] args) {
        int a1=12,b1=4,c1=10;
        float a2=52.7f,b2=49.25f,c2=80.62f;
        System.out.println(sum(a1,b1,c1));
        System.out.printf("%.2f\n",cgpa(a2,b2,c2));
        greet();
        System.out.printf("%.2f mi\n",kmToMile());
        System.out.println(checkInt());

    }
}
