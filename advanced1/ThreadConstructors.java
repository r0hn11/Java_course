package com.complete.advanced1;

class MyThread5 extends Thread{
	public MyThread5(){}
	public MyThread5(String name){
		super(name);
	}
	@Override
	public void run(){
		//while(true){
			//System.out.println("MyThread5");
		//}
	}
}

class MyThread6 implements Runnable{
	public void run(){}
}

public class ThreadConstructors{
	public static void main(String[] args){
		
		/*
		
		Commonly used constructors of Thread class :
			1) Thread()
			2) Thread(String name)
			3) Thread(Runnable r)
			4) Thread(Runnable r, String name)
		
		*/
		
		MyThread5 t50 = new MyThread5();	// case 1 : no argument
		Thread t51 = new Thread();	// case 1 : no argument
		
		MyThread5 t52 = new MyThread5("Rohan");		// case 2 : name
		
		MyThread6 r1 = new MyThread6();		// case 3 : runnable
		Thread t60 = new Thread(r1);
		
		MyThread6 r2 = new MyThread6();		// case 4 : runnable + name
		Thread t61 = new Thread(r2,"My thread 61");
		
		t50.start();
		t51.start();
		t60.start();
		t61.start();
		
		System.out.println("id 50 : "+t50.getId());	// get id of the thread t50
		System.out.println("name 50 : "+t50.getName());	// get name of the thread t50
		System.out.println("id 51 : "+t51.getId());	// get id of the thread t51
		System.out.println("name 51 : "+t51.getName());	// get name of the thread t51
		System.out.println("id 52 : "+t52.getId());	// get id of the thread t52
		System.out.println("name 52 : "+t52.getName());	// get name of the thread t52
		System.out.println("id 60 : "+t60.getId());	// get id of the thread t60
		System.out.println("name 60 : "+t60.getName());	// get name of the thread t60
		System.out.println("id 61 : "+t61.getId());	// get id of the thread t61
		System.out.println("name 61 : "+t61.getName());	// get name of the thread t61
		
		// To group similar threads, we can use ThreadGrouping.
		// To view all methods in details, visit https://docs.oracle.com/javase/7/docs/api/java/lang/Thread.html
		
	}
}