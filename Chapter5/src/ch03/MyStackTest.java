package ch03;

public class MyStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyStack stack = new MyStack(3);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		stack.printAll();
		System.out.println("=====================");
		
		stack.pop();
		stack.pop();
		System.out.println(stack.peek());
	}

}
