package ch06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayLisStreamTest {

	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Jack");
		sList.add("Edward");
		sList.add("mike");
		sList.add("Donald Trump");
		sList.add("Joe Biden");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.println(s));
		
		
		sList.stream().sorted().forEach(s -> System.out.print(s + " \t"));
		sList.stream().map(s -> s.length()).forEach(s->System.out.println(s)); 
		sList.stream().filter(s -> s.length()>10).forEach(s->System.out.println(s)); 

	}

}
