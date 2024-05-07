package ch18;


import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAceessFileTest {

	
	
	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		
		rf.writeInt(100);
		System.out.println("pos: "+ rf.getFilePointer());
		rf.writeDouble(3.14);
		System.out.println("pos: "+ rf.getFilePointer());

		rf.writeUTF("안녕하세요"); //한글이 3byte씩 쓰인다.			
		System.out.println("pos: "+ rf.getFilePointer());
		
		rf.seek(0); //
		System.out.println(rf.readInt());
		System.out.println(rf.readDouble());
		System.out.println(rf.readUTF());
		
	}

}
