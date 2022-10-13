package com.complete.basics;

import java.util.Scanner;

public class  Marks{
    public static void main(String[] args){
        int maths,physics,chem,max;
        float percent,result,cgpa;

        Scanner scan_marks = new Scanner(System.in);

        System.out.println("Enter max marks for one subject");
        max=scan_marks.nextInt();
        System.out.println("Enter Maths marks");
        maths=scan_marks.nextInt();
        System.out.println("Enter Physics marks");
        physics=scan_marks.nextInt();
        System.out.println("Enter Chem marks");
        chem=scan_marks.nextInt();
        result=maths+physics+chem;
        percent=(result/(max*3))*100;
        cgpa=percent/10;

        System.out.println("total percentage: "+percent+"%");
        System.out.println("cgpa: "+cgpa);

    }
}