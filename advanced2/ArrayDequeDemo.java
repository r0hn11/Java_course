package com.complete.advanced2;
import java.util.ArrayDeque;
import java.util.Arrays;

public class ArrayDequeDemo{
	public static void main(String[] args){
	
	/*
	
	documentation : https://docs.oracle.com/javase/7/docs/api/java/util/ArrayDeque.html
	
	QUEUE :
		A linear data structure that is open at both ends and operation are performed in FIFO order.
		Implements array.
		Queue is a list where all operations are done at both ends only and not.
	Enqueue() : enter the queue. (from rear)
	Dequeue() : exit/delete from queue. (from front)
	
	ARRAY DEQUE :
		Stand for doubly ended queue.
		Insertion and deletion can be done at both ends, front and rear. Hence doubly ended.
	
	*/
	
	
		ArrayDeque<Integer> dq1 = new ArrayDeque<>();		// constructor 1: no args
		ArrayDeque<Integer> dq2 = new ArrayDeque<>(3);		// constructor 2: args length
		ArrayDeque<Integer> dq3 = new ArrayDeque<>(Arrays.asList(2,4,7,1));		// constructor 3: args as a collection
		
		// Methods similar to ArrayList :
		
		dq1.add(30); dq1.add(31); dq1.add(32);
		dq2.addAll(dq1); dq2.add(33);	// addAll() does not specify the index to add like arraylist as it is a deque. Hence new collection is added at the start only.
		
		
		// Methods different than ArrayList :
		
		dq2.addFirst(5);
		dq2.addLast(5);		
		dq2.getFirst();		// get first element
		dq2.getLast();		// get last element
		dq3.addAll(dq2);
		ArrayDeque<Integer> dq4 = dq3.clone();		// returns a copy of the existing deque
		System.out.println("Before clear(): "+dq3);
		dq3.clear();	// clears the whole queue
		System.out.println("After clear(): "+dq3);
		
		
		// Methods that throw exceptions and their alternateives
		/*
								 HEAD								   TAIL
					Throws exception  special value 	Throws exception  special value  
					
		Insert		   addFirst() 	  offerFirst()          addLast() 	   offerLast()
		Remove		  removeFirst()    pollFirst() 		   removeLast()     pollLast()
		Examine		   getFirst()      peekFirst() 			getLast()       peekLast() 
		
		*/
		
		System.out.println(dq1);
		System.out.println(dq2);
		System.out.println(dq4);
	
	
	}
}