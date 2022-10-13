package com.complete.advanced1;

public class Finally{
	
	public static int demo1(){
		try{
			int a = 5,b=2;
			int c = a/b;
			return c;
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("Finally 1.");
			return -1;		// even when try block returns c, finally block will be executed and return -1 irrespective of try block.
		}
	}
	
	public static void demo2(){
		int a =5,b=3;
		for(;;){
			try{
				System.out.println(a+" / "+b+" = "+a/b);
			}catch(ArithmeticException e){
				System.out.println(e);
				break;
			}
			finally{
				System.out.println("Finally 2\tb = "+b);
			}
			b--;
		}
	}
	
	public static void demo3(){
		System.out.println();
		try{
			System.out.println(5/0);
		}
		finally{
			System.out.println("Finally 3");
		}
	}
	
    public static void main(String[] args){
		
		/*
		
			Finally block contains code which is always executed whether exception is handled or not.
			It is used to execute code containing instructions to release the system resources, close a connection etc.
			
			Finally block is executed even if an exception is caught or not.
			Finally block is executed even after a return statement in previous code.
			Finally block is not executed after System.exit()
			
			Finally block allows to use try block without catch block
		
		*/
        
		/*
		try{
			int a = 5,b=2;
			int c = a/b;
			System.exit(0);
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("End of block");
		}
		*/
		int k = demo1();
		System.out.println(k+"\n");
		
		demo2();
		
		demo3();

    }
}