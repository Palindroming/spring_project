package ch07;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if (s1.getBytes().length>= s2.getBytes().length) return s1; else return s2;
	}}

public class ReduceTest {

	public static void main(String[] args) {
		
		String greetings[] = {"hi!!!!!", "helloooo","Good Morning","nice to meet ya"};
		
//		System.out.println(Arrays.stream(greetings).reduce("", (s1,s2)->
//			
//		{if (s1.getBytes().length>= s2.getBytes().length) return s1; else return s2;}
//				
//				
//				));
//		
	System.out.println(Arrays.stream(greetings).reduce(new CompareString()).get());
		
		  
		}
	}

/* binaryOperator를 이용해서 배열에 여러 문자열이 있을 때 길이가 가장 긴 문자열 찾기 */


