package ch06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		
		int [] arr = new int [100];
		
		
		
		for(int i=0; i <100; i++ ) {
			
			arr[i] = i+1;
			
		}
		IntStream is = Arrays.stream(arr); //한번 밖에 쓰지 못함, 다시 쓰려면 재생성해야함

		is.forEach(n ->System.out.println(n));
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum); 
		
		Arrays.stream(arr).filter(s -> s >=99).forEach(s->System.out.println(s));
	}

}
