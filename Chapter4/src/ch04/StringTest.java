package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c = Class.forName("java.lang.String"); // S가 s로 바뀌면 오류가 난다
		
		Constructor[] cons = c.getConstructors();
		
		for (Constructor co :cons) {
			System.out.println(co);
		}
		
		Method[] m = c.getMethods();
		for(Method mth:m) { 
			System.out.println(mth);
		}
		
	}

}
