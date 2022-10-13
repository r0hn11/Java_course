package com.complete.advanced1;

class NegativeDimensionException extends Exception{
	@Override
	public String toString(){
		return "NegativeDimensionException";
	}
	@Override
	public String getMessage(){
		return "Provided argument cannot be negative";
	}
}

public class ThrowVsThrows{
	
	public static double areaCircle(double r) throws NegativeDimensionException{
		if(r<0){ throw new NegativeDimensionException();}
		else{
			return Math.floor((Math.PI*r*r)*100)/100;
		}
	}
	
	public static void main(String[] args){
		
		/*
		
		Throw keyword :
			used to throw an exception explicitly by the programmer.
			a default or a custom exception can be thrown using this keyword.
			e.g throw new CustomException();
			    throw new ArithmeticException();
				
		Throws :
			used to declare an exception.
			gives an information to the programmer that there exists an exception to the declared method hence must be wrapped inside try..catch
			basically used to denote that function throws an exception
			
		*/
		
		try{
			double a = areaCircle(-1);
			System.out.println(a);
		}catch(Exception e){
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}