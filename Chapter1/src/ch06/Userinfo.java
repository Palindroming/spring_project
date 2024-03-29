package ch06;

public class Userinfo {
	
	
	public String userId;
	public String userPassWord;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	
	public Userinfo() {}
	
	public Userinfo(String userId, String userPassWord, String userName) {
		
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		
	}
	
	public String showUserInfo() {
		
		return "고객님의 아이디는" + userId + "이고, 등록된 이름은 "+ userName + "입니다.";
		
	}

}
