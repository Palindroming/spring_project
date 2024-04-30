package ch04;

public class StringConcatTest {

	public static void main(String[] args) {
		
		
		String s1= "roh";
		String s2 = "muhyeon";
		
		
//		StringConcatmpl sc = new StringConcatmpl();
//		sc.makeString(s1,s2);
//		
		StringConcat concat = (x,y) -> System.out.println(x +"" +y); //실제적으로 람다 함수 내부에 익명 클래스가사용됨
		concat.makeString(s1, s2);

	}

}
