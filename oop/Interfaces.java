package com.complete.oop;


class Android{
    int version;
    long modelNumber;
    public void getData(){
        System.out.println(this.version);
        System.out.println(this.modelNumber);
    }
}

interface ContactDevice {
    boolean chargeable = true;	// final property, cannot be changed
    void ring();
    void vibrate();
}

interface MusicPlayer{
    void play();
    void pause();
}

class SamsungA10 extends Android implements ContactDevice,MusicPlayer{
    @Override
    public void getData(){
        System.out.println(this.version);
        System.out.println(this.modelNumber);
        System.out.println(this.chargeable);
    }

    // for MobileDevice
    int volume;
    @Override
    public void ring(){
        this.volume = 1;
        System.out.println(this.volume);
    }
    @Override
    public void vibrate(){
        this.volume = 0;
        System.out.println(this.volume);
    }

    // for MusicPlayer
    @Override
    public void play() { System.out.println("Playing."); }
    @Override
    public void pause() {
        System.out.println("Paused.");
    }
}

public class Interfaces {
    public static void main(String[] args) {

        /*
            Interfaces :
                A group of related methods with empty bodies.
                Declared using 'interface' (instead of 'class').
                Child classes are declared using 'implements' (instead of 'extends').
                A child class is forced to implement parent interface's methods.
                Child class methods should not have a more restricted access.
                *** MULTIPLE INTERFACES CAN BE USED TO CREATE ONE CLASS UNLIKE CLASSES
                Properties in interfaces cannot be modified once declared.
                Properties in interface must be initialized and should not be left undefined.
                Properties of an interface are final (e.g. boolean chargeable in MobileDevices).
                *** A class can implement multiple interfaces along with another parent class.
        */

        ContactDevice m1 = new SamsungA10();
        System.out.println(m1.chargeable);

        SamsungA10 a1 = new SamsungA10();
        a1.modelNumber = 165634L;
        a1.version = 10;
        a1.ring();
        a1.vibrate();
        a1.play();
        a1.pause();

        a1.getData();

    }
}
