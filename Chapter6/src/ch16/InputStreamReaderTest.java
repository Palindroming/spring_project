package ch16;

import java.io.FileInputStream;
import java.io.InputStreamReader;
public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		try(InputStreamReader fis = new InputStreamReader(new FileInputStream("reader.txt"))){
			
			int i;
			
			while((i = fis.read() )!= -1){
				System.out.print((char)i);
			}
			
		}catch (Exception e) {
			
			System.out.println(e);
		}
	}

}
