package com.complete.advanced1;


// Type 1) Extending class Thread
class MyThread1 extends Thread{
	@Override
	public void run(){
		int i=0;
		while(i<10000){
			System.out.println("-01");
			i++;
		}
	}
}
class MyThread2 extends Thread{
	@Override
	public void run(){
		int i=0;
		while(i<10000){
			System.out.println("------02");
			i++;
		}
	}
}

public class CreateThreadClass {
    public static void main(String[] args) {
		MyThread1 gun1 = new MyThread1();
		MyThread2 gun2 = new MyThread2();
		
		gun1.start();
		gun2.start();
		
		//gun3.start();		// start() method cannot be accessed from a class that implements interface
		//gun4.start();		// start() method cannot be accessed from a class that implements interface
    }
}
