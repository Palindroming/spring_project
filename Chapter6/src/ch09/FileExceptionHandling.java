package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {
		
		
	try(FileInputStream fis = new FileInputStream("a.txt")){
		
		System.out.println("read");
	}catch(FileNotFoundException e) {
		System.out.println(e);
	}catch(IOException e) {
		System.out.println(e);
	}
	
	System.out.println("end");
			 
		

}
}