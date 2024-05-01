package ch08;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer("이순신", 40, 100);
		Customer customerKim  = new Customer("김유신", 27, 100);
		Customer customerHong = new Customer("홍길동", 13, 50);
		
		
		List<Customer> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		
		System.out.println("==Print customer lists in the order they were added== ");
		
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		System.out.println("the number of the customer is " +  customerList.stream().count());
		
		System.out.println("==travle price==");
		System.out.println(customerList.stream().mapToInt(c->c.getPrice()).sum());
		System.out.println("==customer order than 20 years old==");
		customerList.stream().filter(s->s.getAge()>=20).map(c->c.getName()).forEach(n->System.out.println(n));
	}
	
	

}
