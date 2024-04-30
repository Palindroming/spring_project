package ch03;


@FunctionalInterface // 한 인터페이스에 하나의 메서드만 넣을 수 있도록
public interface MyNumber {

	public int getMax(int x, int y);
	
}
