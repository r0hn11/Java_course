package com.complete.advanced1;

// Type 2) Implementing interface Runnable

class MyThread3 implements Runnable{
	public void run(){
		int i=0;
		while(i<10000){
			System.out.println("-11");
			i++;
		}
	}
}
class MyThread4 implements Runnable{
	public void run(){
		int i=0;
		while(i<10000){
			System.out.println("-----12");
			i++;
		}
	}
}

public class CreateThreadInterface {
    public static void main(String[] args) {
		
		/* A class that implements interface Runnable that cannot access start() method directly. Hence we use alternate method.*/
		//MyThread3 gun3 = new MyThread3();
		//MyThread4 gun4 = new MyThread4();
		//gun3.start();
		//gun4.start();
		
		/* we create object of class that implements Runnable. Pass that object to new object of class Thread*/
		
		MyThread3 bullet3 = new MyThread3();
		MyThread4 bullet4 = new MyThread4();
		
		Thread gun3 = new Thread(bullet3);
		Thread gun4 = new Thread(bullet4);
		
		gun3.start();
		gun4.start();
		
    }
}