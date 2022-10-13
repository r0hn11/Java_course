package com.complete.oop;

class SubHuman extends Human{
    private int id;
    void setId(int id){
        this.id = id;
    }
    void setScore(double score){this.score = score;}
    void getDetails(){
        System.out.println(this.id);    // private bt same class
//        System.out.println(this.name);      // private in parent class
        System.out.println(this.age);       // default
        System.out.println(this.alive);     // public
        System.out.println(this.score);     // protected
    }
}

public class GetterSetter {
    public static void main(String[] args) {

        // setting and accessing a private property using getters and setters
        // Setters : used to set value of a private property
        SubHuman h1 = new SubHuman();
        h1.setId(543);
        h1.setScore(5.87);
        // Getters : used to retrieve value of a private property
        h1.getDetails();
    }
}
