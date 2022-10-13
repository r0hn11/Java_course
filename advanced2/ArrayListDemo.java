package com.complete.advanced2;

import java.util.*;

public class ArrayListDemo{
	public static void main(String[] args){
		
		
	/*
	
	documentation : https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
	
	ARRAYLIST :
		Implements array dataa structure but flexibly.
		Allows easier appending and updation with default methods.
		ArrayList supports dynamic arrays that can grow as needed.
		ArrayLists are dynamic arrays.
	*/
		
		List<Float> li1 = new ArrayList<>();	// List or ArrayList works		// constructor 1: no args
		ArrayList<Float> li2 = new ArrayList<>();
		ArrayList<Float> li3 = new ArrayList<>(3);	// ArrayList with initial capacity		// constructor 2: args length
		
		ArrayList<Integer> li4 = new ArrayList<>(Arrays.asList(2,4,7,1));		// a collction as argument 		// constructor 3: args as a collection
		
		// Methods : below are common used methods. Refer documentation for all methods
		
		li1.add(2.85f);		// append item to the list
		
		li2.add(12f); li2.add(43f); li2.add(29f); li2.add(71f); li2.add(2.85f);
		li3.add(12f); li3.add(43f); li3.add(29f);
		
		li1.add(1,5.207f);	// add value at the given index ---> list.add(index,value);
		li1.get(0);		// get element at index mentioned. Mentioning higher index than length will throw IndexOutOfBoundsException and not ArrayIndexOutOfBoundsException
		li1.set(1,2.5f);	// set value at index mentioned
		li1.addAll(1,li2);	// add another list at a given index, append if index not mentioned
		boolean contains = li1.contains(43f);	// returns true if value is present inside list else false.
		int indFirst = li1.indexOf((float) 2.85);		// returns index of the value found first if present else -1.
		int indLast = li1.lastIndexOf((float) 2.85);		// returns index of the value found last if present else -1.
		
		System.out.println("contains: "+contains+"\nfirst index: "+indFirst+"\nlast index: "+indLast);
		
		System.out.println("\nArrayList 1");
		for(float e : li1){
			System.out.print(e+"\t");
		}
		
		System.out.println("\nArrayList 2");
		for(float e : li2){
			System.out.print(e+"\t");
		}
		
		System.out.println("\nArrayList 3");
		for(float e : li3){
			System.out.print(e+"\t");
		}
		
		System.out.println("\nArrayList 4");
		for(float e : li4){
			System.out.print(e+"\t");
		}
		
		// ArrayList can be printed directly without loop as below
		System.out.println("\n\n"+li1);
		System.out.println(li2);
		System.out.println(li3);
		System.out.println(li4);
		
		// Converting array to ArrayList and back
		Integer[] arr = {12,14,16};
		List<Integer> li5 = new ArrayList<>();
		//li5 = Arrays.asList(arr);	// this makes a fixed size list, which does not support add or remove operations. hence we have to use a loop to add eleme
		for(int e:arr){
			li5.add(e);
		}
		li5.add(18); li5.add(20);
		int[] arr2 = new int[li5.size()];
		for(int i=0;i<arr2.length;i++){
			arr2[i] = li5.get(i);
			System.out.print(arr2[i]+"  ");
		}
		
	}
}
