package ch11;

public class MakeReport {

	StringBuffer buffer = new StringBuffer();
/*
 * StringBuffer는 문자열을 추가하거나 변경할 때 주로 사용하는 자료형이다. StringBuffer의 다양한 메서드를 살펴보면서 StringBuffer의 사용법을 알아보자.

StringBuffer 자료형은 append 메서드를 사용하여 문자열을 계속해서 추가해 나갈 수 있다. 


 */
	
	private String line = "===========================================\n";
	private String title = "  이름\t   주소 \t\t  전화번호  \n";
	private void makeHeader()
	{
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void generateBody()
	{
		buffer.append("James \t");
		buffer.append("Seoul Korea \t");
		buffer.append("010-2222-3333\n");
		
		buffer.append("Tomas \t");
		buffer.append("NewYork US \t");
		buffer.append("010-7777-0987\n");
	}
	
	private void makeFooter()
	{
		
		buffer.append(line);
	}
	// 여기까지 클라이언트 코드쪽에 알 필요 없음
	public String getReport()
	{
		makeHeader();
		generateBody();
		makeFooter();
		return buffer.toString();
	}
}
