package ch11;

import java.util.HashSet;

public class HashSetTest {
	
	public static void main(String[] args) {
		
		HashSet<String> hashset = new HashSet<String>();
		hashset.add(new String("김유신"));
		hashset.add(new String("이해찬"));
		hashset.add(new String("유시민"));
		hashset.add(new String("정동영"));
		hashset.add(new String("한명숙"));
		
		System.out.println(hashset);
		
		
	}

}
