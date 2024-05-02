package ch15;

import java.io.FileWriter;
public class FileWriterTest {

	public static void main(String[] args) {
		
		
		try(FileWriter fw = new FileWriter("Writer.txt",true)){
			
			fw.write('A'); //문자 하나 출력
			char buf[] = {'B','C','D','E','F','G'};
			
			fw.write(buf);
			fw.write("hello this work very nice"); //String 출력
			fw.write(buf,1,2);
			fw.write("65");
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("print completed");
	}

}
