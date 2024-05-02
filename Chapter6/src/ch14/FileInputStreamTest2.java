package ch14;

import java.io.FileInputStream;
import java.io.*;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("inputs2.txt")){
			
			byte[] bs = new byte[10];
			int i;
			while((i=fis.read(bs))!= -1) {
				
				for(int k= 0 ; k<i; k++) {
					System.out.print((char)bs[k]);
				}
				
				System.out.println(": "+ i+ "byte read");
			}
		} catch(Exception e) {
			System.out.println(e);
		} System.out.println("the end");
	 
	}
}
