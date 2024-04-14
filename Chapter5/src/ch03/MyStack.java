package ch03;

import ch01.MyArray;

public class MyStack {
	
	int top;
	MyArray arraystack;
	
	public MyStack() {
		top = 0;
		arraystack = new MyArray();
	}
	
	public MyStack(int size) {
		
		arraystack = new MyArray(size);
		
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack is full");
			return;
		}
		arraystack.addElement(data);
		top++;
	}
	
	public int pop() {
		
		if(top ==0) {
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		return arraystack.removeElement(--top);
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		return arraystack.getElement(--top);
	}
	
	public int getSize() {
		return top;
	}
	
	public boolean isFull() {
		if(top == arraystack.ARRAY_SIZE) {
			return true;
		}
		else return false;
		
	}
	
	public boolean isEmpty() {
		if(top==0) {
			return true;
		}
		else return false;
		
	}
	
	public void printAll() {
		arraystack.printAll();
	}
	
}
