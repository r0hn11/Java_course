package com.complete.advanced2;

// For Anonymous class demo
interface AnInterface{
    void meth1();
    void meth2();
}
class AnonyClass implements AnInterface{
    @Override
    public void meth1(){System.out.println(".");}
    @Override
    public void meth2(){System.out.println("..");}
}

//  For Lambda expression demo
interface lmbInterface1{
    int meth1();
}
interface lmbInterface2{
    void meth1(int x);
}

public class AnonymousLambda {
    public static void main(String[] args) {
        /*
        ANONYMOUS CLASSES :
            a class which doesn't actually exist but still can be used temporarily
            to avoid extra writing
        LAMBDA EXPRESSIONS :
            lambda expressions are used for avoiding creating extra classes to implement interface in order to create object.
            this makes code compact
            applicable for functional interfaces (with single abstract method) only
        */

        //  Anonymous class demo
        /*{
            AnInterface a1 = new AnonyClass();
            AnInterface a2 = new AnInterface() {     // instead of creating a new class like above line, we can use this to access interface methods without writing extra code for a new class
                public void meth1() {
                    System.out.println("_");
                }

                public void meth2() {
                    System.out.println("__");
                }
            };
            a1.meth1();
            a2.meth1();
        }*/

        //  Lambda expression demo
        {
            lmbInterface1 l1 = ()->{
                System.out.println("Method 1");
                System.out.println("Method 1 line 2");
                return 0;
            };
            l1.meth1();

            lmbInterface2 l2 = (x)->{
                System.out.println("value : "+(x*2));
            };
            l2.meth1(5);
        }

    }
}
