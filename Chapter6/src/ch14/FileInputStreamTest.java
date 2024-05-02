package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileInputStreamTest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis= null;
		
		try {
			 fis = new FileInputStream("input.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		catch(Exception e) {
			System.out.println(e);
		}
			
		
			try {
				fis.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		 finally {
			 try {
				 fis.close();
				 System.out.println("the end");
			 }
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
