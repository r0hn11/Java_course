package com.complete.advanced2;

public class Hashing{
	public static void main(String[] args){
		
		/*
		
			HASHING :
				Technique of converting key value pairs to indices.
				Hashing is a technique that is used to uniquely identify a specific object from a group of similar objects.
				There is a hash function that maps keys to some values.
				Using a hash function to store values makes searching faster. e.g. storing a value in an array of 1 lakh size and iterating through thousand items to find one is inefficient than hashing.
				A hash function will give same output everytime same value is provided to it.
				Hashing will generate a related value using hash function to store and access the value on search.
				e.g.Table of length 10.
					Values given : {18,11,23,98}
					Hash function f(x) = x%10
					therefore for 18, f(x) = 8 --> 8th index of hash table
								  11, f(x) = 1 --> 1st index of hash table
								  23, f(x) = 3 --> 3rd index of hash table
					But, for 98, f(x) = 8 --> 8th index is not possible to add since 18 is already there. This is called hash collision.
			
								  
			Hash Collisions :
				When the result of hash function is same for 2 values, it is not possible to add multiple elements at same index
				This can solved by 2 methods,
				1) Open addressing to handle collision :
					The colliding value is placed at the index which is free after previous filling.
					e.g. after 18 at 8th index, 9th is free thus 98 is placed at 9th index and so on.
				2) Chaining :
					Create a new list with multiple entries at the occupied index. The list will contain previous as well as new values.
					e.g. at 8th index, a new list will be created thus the index will have the address of newly formed list. {18,98}
					
			Hash Table :
				A table where indexed values are stored
				When the length of hash table starts running out i.e.reaches load factor, a new hash table with a new bigger size is created and elements of previous are copied inside it automatically.
			
			Load Factor :
				A measure of how full a hash table is allowed to get before its capacity is automatically increased
				
				
			Common Classes used for Hashing :
		
			reference : https://www.geeksforgeeks.org/hashing-in-java/
		
				HashSet
				HashMap
				LinkedHashMap
				HashTable
				
				
			Advantage of a Hash table over a linear data structure
				Searching over a data structure such as an array presents a linear time complexity of O(n). In other words, as the data structure increases in size, the search time increases in a linear fashion.
				Simply put, using a hash table is faster than searching through an array.
			
					
		*/
		
		
	}
}