package com.complete.oop;

class Vehicle{
    public void drive(){
        System.out.println("Drive.");
    }
}

class Car extends Vehicle{
    @Override
    public void drive(){
        System.out.println("Drive faster.");
    }
    public void boost(){
        System.out.println("Boosted...");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {

        /*
            Dynamic method dispatch :
                When a object is initialized and and decides which method to run while runtime is called DMD
                Used to achieve runtime polymorphism.
                Super obj = new Sub(); is allowed
                Sub obj = new Super(); is NOT allowed
                obj can access Super class's methods but not Sub class's
        */

        // e.g. a Car can be vehicle but vehicle cannot always be car.
//        Car c1 = new Vehicle();     // not valid
        Vehicle v1 = new Car();     // Vehicle is reference and Car is actual class whose object is instantiated
        v1.drive();     // this will invoke the object's (Car) method and not of reference object (Vehicle) WHILE RUNTIME
//        v1.boost();     // this is not allowed since object created is of Vehicle and not of Car

    }
}
