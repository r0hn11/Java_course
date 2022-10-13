package com.complete.packages.access;

public class AccessModifiers_0 {

    public int pb = 10;         // public
    protected int prt = 12;      // protected
    int pd = 14;                // no modifier/ default
    private int pvt = 16;        // private

    public void get(){
        System.out.println("Public: "+pb);
        System.out.println("Protected: "+prt);
        System.out.println("Default/No modifier: "+pd);
        System.out.println("Private: "+pvt);        // private property can't be accessed without member method
    }

    public static void main(String[] args) {

        AccessModifiers_0 a0 = new AccessModifiers_0();
        a0.get();

        // Same package, same class : all allowed
        System.out.println(a0.pb);
        System.out.println(a0.prt);
        System.out.println(a0.pb);
        System.out.println(a0.pb);

/*
        Scope of access modifiers:
          ______________________________________________________________________________________________________________
         |               |    within class  |  within package  |  outside package(subclass only)  |  outside package    |
         ---------------------------------------------------------------------------------------------------------------|
         |   Public      |        Y         |        Y         |              Y                   |         Y           |
         |   Protected   |        Y         |        Y         |              Y                   |         N           |
         |   Default     |        Y         |        Y         |              N                   |         N           |
         |   Private     |        Y         |        N         |              N                   |         N           |
         |______________________________________________________________________________________________________________|
*/

    }
}
