package com.complete.advanced2;
import java.util.*;

public class HashSetDemo{
	public static void main(String[] args){
		
		/*
		
		documentation : https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html
		
		HASHSET :
			HashSet is  data structure that implements Set interface.
			HashSet is used for a collection of distinct objects. i.e. no repeat values.
		
		*/
		
		Set<Integer> s1 = new HashSet<>();	// Set or HashSet both work
		HashSet<Integer> s2 = new HashSet<>();	// constructor 1: no args --> initial capacity of 16 and load factor 0.75
		HashSet<Integer> s3 = new HashSet<>(5);	// constructor 2: args capacity
		HashSet<Integer> s4 = new HashSet<>(5, 0.5f);	// constructor 3: args capacity, load factor. (If doesnt work, convert load factor to a float using F at end
		HashSet<Integer> s5 = new HashSet<>(Arrays.asList(3,5,6,1,3,5,8,6,7,9,0,11,65,32,15));	// constructor 4: args collection
		
		s2.add(2);
		s2.add(4);
		s2.add(2);	// this value is not added since it is a set and repeated values are not added in a set
		
		System.out.println(s2);
		System.out.println(s5);
		
		// finding item at a index in hashset
		Integer[] arr = s5.toArray(new Integer[s5.size()]);
		int i=0;
		for(int e: arr){
			System.out.println(i+" :  "+e);
			i++;
		}
		
	}
}