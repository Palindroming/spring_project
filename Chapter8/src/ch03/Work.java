package ch03;


public class Work {

	public static void main(String[] args) {
		
		String arr[] = {"경제통계의 이해","파이썬", "데이터정보처리입문","컴퓨터의 이해","유비쿼터스 컴퓨팅 개론"};
		
		for(int i = 1; i<=15; i++) {
			
			for(String j:arr) {
				
				System.out.println(j+" "+ i+ ""+ "강 요약정리");
			}
		}
		

	}

}
