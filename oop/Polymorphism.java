package com.complete.oop;

// Using existing classes and interfaces from Interfaces.java

public class Polymorphism {
    public static void main(String[] args) {

        /*
            Polymorphism:
                Same entity different forms.
                e.g.
                m1 can access methods of MobileDevice (but not SamsungA10)
                m2 can access methods of MusicPlayer (but not SamsungA10)
        */

        ContactDevice m1 = new SamsungA10();    // this is a SamsungA10 but strictly use it as ContactDevice (this can access only ContactDevice's methods)
        MusicPlayer m2 = new SamsungA10();    // this is a SamsungA10 but strictly use it as MusicPlayer (this can access only MusicPlayer's methods)
        SamsungA10 s1 = new SamsungA10();   // this is a SamsungA10 and use it like a SamsungA10 (this can access all methods)

    }
}
