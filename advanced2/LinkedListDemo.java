package com.complete.advanced2;
import java.util.*;

public class LinkedListDemo{
	public static void main(String[] args){
	
	
	/*
	
	documentation : https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html
	
	LINKEDLIST :
		A linear collection of data where order of elements is not related to physical placement in memory
		Each element points to a next element in the list. (In case of doubly linked list, element can point to previous as well as next element)
		LinkedList follows Deque hierarchy. hence some methods are different than array list
		Java by default has doubly linked list
		Check image in same directory (.\linkedlists.png)
	
	LINKEDLIST vs ARRAYLIST :
	--	ArrayList uses array to store
		LinkedList uses individual objects to store (object with keys previous pointer, next pointer and its own value)
	--	Array has faster access due to indexing.
		Linked lists do not have indexing hence iterative access. e.g. need to access elements one after another to reach required position
	--  Adding items is difficult in array. e.g. shift all elements to right or left as per requirement and then add item.
		Adding items is easier in list. e.g. point previous node to receding element and next to proceeding element. (like breaking a chain at a point and adding a loop there)
	
	*/
		
		LinkedList<Integer> lnli1 =  new LinkedList<>(); 		// constructor 1: args length
		LinkedList<Integer> lnli2 =  new LinkedList<>();
		//LinkedList<Integer> lnli3 =  new LinkedList<>(3);		// initial capacity of linked list cannot be given.
		LinkedList<Integer> lnli4 = new LinkedList<>(Arrays.asList(2,4,7,1));		// a collction as argument 		// constructor 2: args as a collection
		
		// Methods similar to ArrayList :
		
		lnli1.add(5); lnli1.add(15); lnli1.add(20);
		lnli2.add(50); lnli2.add(150); lnli2.add(200); lnli2.add(15);
		
		lnli1.add(1,10);	// add value at the given index ---> list.add(index,value);
		lnli1.get(3);		// get element at index mentioned. Mentioning higher index than length will throw IndexOutOfBoundsException and not ArrayIndexOutOfBoundsException
		lnli1.set(1,25);	// set value at index mentioned
		lnli1.addAll(1,lnli2);	// add another list at a given index, append if index not mentioned
		
		boolean contains = lnli1.contains(10);	// returns true if value is present inside list else false.
		int indFirst = lnli1.indexOf(15);		// returns index of the value found first if present else -1.
		int indLast = lnli1.lastIndexOf(15);		// returns index of the value found last if present else -1.
		
		
		// Methods different than ArrayList :
		lnli1.addFirst(0);
		lnli1.addLast(75);
		
		System.out.println("contains: "+contains+"\nfirst index: "+indFirst+"\nlast index: "+indLast);
		
		System.out.println("\nLinkedList 1");
		for(int e : lnli1){
			System.out.print(e+"\t");
		}

		System.out.println("\nLinkedList 2");
		for(int e : lnli2){
			System.out.print(e+"\t");
		}
		
		// LinkedList can be printed directly without loop as below
		System.out.println("\n\n"+lnli1);
		System.out.println(lnli2);
		System.out.println(lnli4);
	
	}
}