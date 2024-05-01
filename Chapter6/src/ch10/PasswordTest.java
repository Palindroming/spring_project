package ch10;

public class PasswordTest {
	
	private String password;
	

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) throws PasswordException {
		if(password==null) {
			throw new PasswordException("password can not be null");
		}
		else if (password.length()>5) {
			throw new PasswordException("The password must be at least 5 characters long. ");
			
		}
		else if (password.matches("[a-zA-Z]+")){
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
		}
		this.password = password;


			
	}
	
	
	


	public static void main(String[] args) {
		
	PasswordTest test = new PasswordTest();
	try {
		test.setPassword("abcd2");
		System.out.println("no error");	
	} catch (PasswordException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
		
	}

}
