package ch14;

import java.io.*;
public class FileOutputStreamTest1 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("output2.txt", true);
		
		try(fos){
			
			byte[] bs = new byte[26];
			byte data = 65;
			for (int i = 0; i<bs.length; i++) {
				bs[i] = data;
				data++;
			}
			
			fos.write(bs);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("output completed!!");
		
	

}}
