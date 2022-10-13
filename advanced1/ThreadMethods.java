package com.complete.advanced1;

class MyThread8 extends Thread{
	@Override
	public void run(){
//		while(true){
			System.out.println(this.getName());
//		}
	}
}

public class ThreadMethods{
	public static void main(String[] args){
		
		MyThread8 t80 = new MyThread8();
		MyThread8 t81 = new MyThread8();

		/*{
			// start() : will run threads simultaneously
			t80.start();
			t81.start();
		}*/

		/*{
			// join() : the next thread will be stopped until execution of first. Requires to be wrapped inside exception
			t80.start();
			try {
				t80.join();
			} catch (Exception ignored) {
			}
			t81.start();
		}*/

		/*{
			// sleep() : Interrupt the thread for given time. (remove while loop to see time gap)
			t80.start();
			try {
				t80.sleep(5000);
			} catch (InterruptedException ignored) {}
			t81.start();
		}*/

		/*{
			// getPriority(), setPriority() : get and set priorities for execution

			int p0 = t80.getPriority();
			int p1 = t81.getPriority();
			System.out.println("Before setting:\n"+p0+"\n"+p1);		// unset means Normal priority i.e. 5
			t80.setPriority(4);
			t81.setPriority(8);
			t81.setPriority(Thread.NORM_PRIORITY);	// overwriting to normal (5) priority
			p0 = t80.getPriority();
			p1 = t81.getPriority();
			System.out.println("After setting:\n"+p0+"\n"+p1);

		}*/

		/*{
			// getState() : get current state of a thread

			MyThread8 t82 = new MyThread8();

			t80.start();
			t82.start();
			System.out.println(t80.getState());		// start(), hence RUNNABLE
			System.out.println(t81.getState());		// not started, hence NEW
			System.out.println(t82.getState());		// start(), hence RUNNABLE
			try {
				t82.sleep(1000);
			}catch (InterruptedException ignored){}
			System.out.println(t82.getState());		// finished, hence TERMINATED

			System.out.println(Thread.currentThread().getState());
		}*/

	}
}