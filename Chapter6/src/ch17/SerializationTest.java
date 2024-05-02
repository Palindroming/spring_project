package ch17;

import java.io.FileOutputStream;
import java.io.FileInputStream;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Person implements Serializable{
	
	String name;
	 String job;
	public Person() {
		
		
	}
	public Person(String name, String job) {
		this.name = name;
		this.job= job;
		
	}
	
	
	public String toString() {
		return name + " "+ job;
	}
	
}


	
	

public class SerializationTest {

	public static void main(String[] args) {
		
		Person personLee = new Person("leesonsin","boss");
		Person personkim = new Person("kimjungeun","pig");
		Person p = new Person("no", "else");
		try( FileOutputStream fos = new FileOutputStream("serial.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personLee);
			oos.writeObject(personkim);
			oos.writeObject(p);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		try( FileInputStream fis = new FileInputStream("serial.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Person pLee = (Person)ois.readObject();
			Person pkim = (Person)ois.readObject();
			Person pp = (Person)ois.readObject();
			
			System.out.println(pLee);
			System.out.println(pkim);
			System.out.println(pp);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
				
	}

}
