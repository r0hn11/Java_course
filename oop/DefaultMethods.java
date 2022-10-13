package com.complete.oop;

interface Character{
    void walk();
    void talk();
}
interface ArmedPlayer{
    int health = 150;
    void detect();
    void shoot();

    // private method for simplifying default method
    private void kill(){
        System.out.println("killed.");
    }
    // default method
    default void assassinate(){
        System.out.println("Assassinated");
        kill();
    }

}

interface UnarmedPlayer{
    int health = 100;
    void run();
    void hide();
}

class Player{
    int gold;
    String[] inventory;
    int xp;

    void gainXp(){
        this.xp++;
    };
    void die(){
        this.gold -= 100*this.xp;
        System.out.println("You died");
    }
}

class MainCharacter extends Player implements Character, ArmedPlayer{
    public void walk(){System.out.println("Moving");}
    public void talk(){System.out.println("Hello.");}
    public void detect(){System.out.println("Detected");}
    public void shoot(){System.out.println("Shooting");}

    public void emote(){
        System.out.println("Dancing");
    }
}

public class DefaultMethods {
    public static void main(String[] args) {

        /*
            Default method:
                An interface has static and default methods.
                Default methods allows us to add a functionality in the interface
                Introduced in Java8 to ensure backward compatibility while updating an interface (Each time if a method is added in interface, it needs to be implemented in all classes who implement the interface).
                Classes need not to implement the default methods but they can if needed.
                Interface can have private methods to simplify the default methods. These private methods cannot be accessed directly.
        */

        MainCharacter jason = new MainCharacter();
        jason.shoot();
        jason.gainXp();
        System.out.println(jason.xp);
        // default method can be accessed directly with object
        jason.assassinate();
        System.out.println(jason.health);

    }
}
