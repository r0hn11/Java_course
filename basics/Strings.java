package com.complete.basics;
import java.util.Scanner;
import java.lang.String;

public class Strings {

    public static int secondIndexOf(String main, String check){
        int index = -1, i=-1;
        i = main.indexOf(check,main.indexOf(check)+1);
        if(i!=-1){index = i;}
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Strings are a sequence of characters.
        // Strings are immutable. Methods return a copy of that string and change it. Variable value can be changed but individual letters in string are not changeable
        // Indexing from 0

        // Initialization
        String name1 = new String("DefString1");
        String name2 = "DefString2";

        // Printing
        System.out.println(name1);
        System.out.printf("%s\t",name1);    // printing a formatted string
        System.out.format("%s\t",name2);    // printing a formatted string

        System.out.print("\nString: ");
        String str = sc.nextLine();     // for complete string with whitespaces. For single word, use next()

        // Methods
        String def = "def ";
        System.out.println(def+str);     // concatenation
        str.length();
        str.toLowerCase();
        str.toUpperCase();
        str.contains("ax");
        str.endsWith("arm");
        str.startsWith("ad",2);     // checks if string starts with given char/string from given offset
        str.charAt(3);      // index out of bound if shorter
        str.trim();     // removes leading and trailing spaces
        str.indexOf("a");
        str.indexOf("tin", 2);      // returns index of given string if found after given index. (can be used to find second index of same string.
        str.lastIndexOf("a");
        str.lastIndexOf("a", 4);    // searches from right to left while starting from given index
        str.substring(str.length()/2);    // returns a substring from given index
        str.substring(1,5);    // returns a substring from start index to end index (excludes end index)
        str.replace('a','A');   // returns a new string with replaced all a with A
        str.replaceFirst("gas","bri");  // replace first happening of given string
        secondIndexOf(str,"e");     // custom method for finding second index of query
        str.equals(name1);      // returns if string is same as given as arg (case sensitive)
        str.equalsIgnoreCase("Rex");      // returns if string is same as given as arg (case ignored)

    }
}
