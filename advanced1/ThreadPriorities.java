package com.complete.advanced1;

class MyThread7 extends Thread{
	public MyThread7(){}
	public MyThread7(String name){super(name);}
	@Override
	public void run(){
		while(true)
			System.out.println(this.getName());
 	}
}

public class ThreadPriorities{
	public static void main(String[] args){
		
		/*
		
		THREAD PRIORITIES :
			While a process has multiple threads, it adds them into a ready queue
			Ready Queue : t70 t71 t72 t73 t74

		Default Sequence is decided by Operating System

		JVM defines a range of ten logical priorities for java threads :
			java.lang.Thread.MIN_PRIORITY = 1
			java.lang.Thread.NORMAL_PRIORITY = 5
			java.lang.Thread.MAX_PRIORITY = 10
		
		*/

		MyThread7 t70 = new MyThread7("0 Thread with min priority.");
		MyThread7 t71 = new MyThread7("1");
		MyThread7 t72 = new MyThread7("2");
		MyThread7 t73 = new MyThread7("3 Thread with max priority.");
		MyThread7 t74 = new MyThread7("4");
		
		// Prioritising
		t73.setPriority(Thread.MAX_PRIORITY);
		t70.setPriority(Thread.MIN_PRIORITY);
		
		// running threads
		t70.start();
		t71.start();
		t72.start();
		t73.start();
		t74.start();


	}
}