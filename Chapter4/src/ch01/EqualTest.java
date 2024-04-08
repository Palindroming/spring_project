package ch01;

public class EqualTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student std1 = new Student(100, "lee");
		Student std2 = new Student(100, "lee");
		Student std3 = std1;
		
		System.out.println(std1==std2);
		System.out.println(std1.equals(std2));
		System.out.println(std3==std1);
		 
		System.out.println(std1.hashCode());	
		System.out.println(std2.hashCode());	
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		
		
		System.out.println(str1.hashCode());	
		System.out.println(str2.hashCode()); 
		  
		Integer i = 100;
		System.out.println(i.hashCode());//Integer의 경우, hashcode 값을 찍어보면 그 정수 값이 나온다.
		
		System.out.println(System.identityHashCode(i));
		
		std1.setStudentName("Park");
		
		Student copyStudent = (Student)std1.clone();
	
		System.out.println(copyStudent); 
		
		
	}
	

	
}
