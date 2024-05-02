package ch15;

import java.io.FileReader;

public class FileReaderTest {

	public static void main(String[] args) {

		try(FileReader fr = new FileReader("reader.txt")){
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i); } }
				
			 catch (Exception e) {
				System.out.println(e);
			}
		System.out.println("\nread complete");
			
		}
	}


