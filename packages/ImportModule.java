package com.complete.packages;
import custompack.male.Male;	// importing class
import static custompack.male.Male.*;	// importing static properties


public class ImportModule{
	public static void main(String[] args){
		Male m1 = new Male();
		m1.getWood(3);	// non static method from Male class
		work();		// static method from Male class
	}
}