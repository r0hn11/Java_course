package com.complete.basics;

public class Conditionals {
    public static void main(String[] args){

        //Comparison/Relational  <,>,<=,>=,==,!=
        //Logical     &&,||,!
        /*
            y&&y=y
            y&&n=n
            n&&n=n
            y||y=y
            y||n=y
            n||n=n
            !y=n
            !n=y
        */

        // if elseif else
        boolean value = true;
        if(value){
            System.out.println("true");
        }
        else if(!value){
            System.out.println("false");
        }
        else{
            System.out.println("Neither");
        }

        // switch case
        int x=10;
        switch(x){
            case 0:
                System.out.println("value: 0");
                break;
            case 1:
                System.out.println("value: 1");
                break;
            case 2:
                System.out.println("value: 2");
                break;
            default:
                System.out.println("greater than 2");
                break;
        }

        // ternary operator
        int v = -1;
        double v2 = -40;
        String res = (v == 0)?"true":"false";
        int x2 = (v2==(int)v2)?1:-1;
        System.out.println(res);
        System.out.println(x2);

    }
}
