package ch18;



public class CompanyTest {

	
	public static void main(String[] args) {
		
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
	
	
	
		System.out.println(company1);
		System.out.println(company2);
/*
 * company1과 company2는 모두 Company.getInstance() 메서드를 통해 생성되므로, 동일한 Company 객체의 참조값을 가지게 됩니다. 따라서 콘솔에 출력된 값은 같습니
 */
		
		
		
}
}