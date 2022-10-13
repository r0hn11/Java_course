package com.complete.packages.access;

public class AccessModifiers_1 extends AccessModifiers_0{
	public static void main(String[] args){

		AccessModifiers_1 a1 = new AccessModifiers_1();
		
		System.out.println("Public: "+a1.pb);
        System.out.println("Protected: "+a1.prt);
		System.out.println("Default/no: "+a1.pd);	// allowed since it is present in same package

		// same package, different class : not allowed - private
//		System.out.println("Default/no: "+a1.pvt);

	}
}