package com.complete.advanced2;

/**
* This is a test documentation to demonstrate java docs generation.<br><strong>HTML</strong> written in this description is generated.
* @author Rohan Chavan
* @version 1.0
* @since 2022
* @see <a href="https://www.youtube.com/watch?v=u7hFzG1n4mg&list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q&index=106">Java Docs</a>
*/

public class JavaDocs{
	/**
	 * add method returns the integer addition of two positive integers
	 * @param a first positive integer
	 * @param b second positive integer
	 * @return integer sum of positive integers
	 * @throws IllegalArgumentException if arguments are negative
	 * @deprecated deprecated method. use plus '+' operator instead
	 */
	public static int add(int a, int b) throws IllegalArgumentException{
		if(a<0 || b<0) throw new IllegalArgumentException();
		return a+b;
	}

	public static void main(String[] args){

	/*
		We can create a documentation using intellij's generate javadoc feature or using command 'javadoc'
		If a javadoc is written above a class, it is about that class.
		Similarly, above method, about method.
		To enhance documentation :
			Tags for class :
				@author - adds author name
				@version - version of the document
				@since - adds date of creation
				@see - adds a see also heading with link
			Tags for methods :
				@param - a parameter description
				@return - data type of return value
				@throws - exception thrown by the method
				@deprecated - for deprecation status
	*/

	
	}
}