//package com.complete.filehandling;
import java.io.*;
import java.util.Scanner;

public class FileHandling{
	public static void main(String[] args){
		
		String path = "D:/courses/Languages/JAVA/complete/src/com/complete/filehandling/";
		String filename = "test.txt";
		File f = new File(path+filename);
		// generating a file
		{
			try{
				f.createNewFile();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		// writing to a file
		{
			String content = "Hello, this is a test file\n1234567890";
			try{
				FileWriter fw = new FileWriter(path+filename);
				fw.write(content);
				fw.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		// reading a file
		{
			try{
				Scanner sc = new Scanner(f);
				while(sc.hasNextLine()){
					System.out.println(sc.nextLine());
				}				
				sc.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		// deleting a file
		{
			File fd = new File(path+"delete.txt");
			if(fd.delete()) System.out.println("Deleted delete.txt");
			else System.out.println("Problem occured during deletion.");
		}
		
	}
}