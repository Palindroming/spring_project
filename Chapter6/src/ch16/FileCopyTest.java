package ch16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
public class FileCopyTest {
	
	public static void main(String[] args) {
		
		long milisecond = 0;
//		try(FileInputStream fis = new FileInputStream("a.zip");
				try(BufferedInputStream bis = new BufferedInputStream( new FileInputStream("a.zip"));

//				FileOutputStream fos = new FileOutputStream("copy.zip")){
			
						BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"))){

			milisecond = System.currentTimeMillis();
			
			
			int i;
			while( (i=bis.read()) != -1) {
				bos.write(i);
			}
			milisecond = System.currentTimeMillis() - milisecond;

			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("It tooks "+ milisecond);
		
	
	}

}
