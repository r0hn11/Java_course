package com.complete.oop;

class Base2{
    public void m1(){
        System.out.println("Method 1");
    }
}

class Derived2 extends Base2{
    @Override   // to denote below method is overriding
    public void m1(){
        System.out.println("Method 1 overridden");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        // Method overriding means changing an existing method (in base class) as per requirements in derived class
        // It is used if a child class uses a parent's method but wants to implement a different logic inside it
        /*

            Rules for method overriding :
            - Exact same argument list
            - Return type should be same or subtype of original
            - Access level should not be more restrictive than parent's access level
                e.g. if base class method is public then child class method should not be private/protected
            - Instance methods can be overridden only if they are inherited by the subclass.
            - A method declared final cannot be overridden.
            - A method declared static cannot be overridden but can be re-declared.
            - If a method cannot be inherited, then it cannot be overridden.
            - A subclass within the same package as the instance's superclass can override any superclass method that is not declared private or final.
            - A subclass in a different package can only override the non-final methods declared public or protected.
            - An overriding method can throw any uncheck exceptions, regardless of whether the overridden method throws exceptions or not. However, the overriding method should not throw checked exceptions that are new or broader than the ones declared by the overridden method. The overriding method can throw narrower or fewer exceptions than the overridden method.
            - Constructors cannot be overridden.

        */

        Base2 b2 = new Base2();
        Derived2 d2 = new Derived2();

        b2.m1();
        d2.m1();

    }
}
