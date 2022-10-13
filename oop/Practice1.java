package com.complete.oop;

class Phone{
    long modelNum;
    String brand;
    void ringer(){
        System.out.println("Set to ringer");
    }
    long getModelNum(){
        return this.modelNum;
    }
    void setName(String name){
        this.brand = name;
    }
}

public class Practice1 {
    public static void main(String[] args) {

        Phone p1 = new Phone();
        p1.setName("random");
        p1.modelNum = 21432167L;
        p1.ringer();
        System.out.println(p1.getModelNum());

    }
}
