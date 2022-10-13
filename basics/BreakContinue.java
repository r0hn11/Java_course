package com.complete.basics;

public class BreakContinue {
    public static void main(String[] args) {

        // break: used for exiting loop at a particular part/condition irrespective of base condition
        System.out.println("\n\nBreak");
        for(int i=0;i<=5;i++){      // base condition i<=5
            System.out.print(i+"\t");
            if(i==3) break;     // break condition i==3
        }

        // continue: used to skip a condition in loop and continue for next values
        System.out.println("\n\nContinue");
        for(int i=0;i<20;i++){
            if(i>4 && i<13){
                System.out.print(i+"\t");
                continue;   // condition is 4<i<13 hence below operation (inside loop) for 5 to 12 is/are skipped
            }
            System.out.print(i*2+"\t");
        }

        System.out.println("\n\nPractice");
        for(int i=4;i>0;i--){
            for(int j=0;j<i;j++)
                System.out.print("* ");
            System.out.print("\n");
        }

        System.out.println("\n\nFactorial");
        int n=7, f=1;
        for(int i =1;i<=n;i++){
            f*=i;
        }
        System.out.println(f);

    }
}
