package com.complete.packages;

public class Sample{
	public static void main(String[] args){
		System.out.println("Hello");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int x=sc.nextInt();
		System.out.println(x);
	}
}

// Execution in command line app
/*
	For single file :
		javac Sample.java
		java Sample
*/