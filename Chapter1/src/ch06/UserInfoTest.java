package ch06;

public class UserInfoTest {
	
	public static void main(String[] args) {
		
		Userinfo userLee = new Userinfo();
		userLee.userId = "a12345";
		userLee.userPassWord = "zxcvbn12345";
		userLee.userName = "Lee";
		userLee.phoneNumber ="01034556699";
		userLee.userAddress = "Seoul, Korea";
		//디폴트 생성자 사용
		
		System.out.println(userLee.showUserInfo());
		
		Userinfo userKim = new Userinfo("b12345","09876mnbvc","Kim");
		System.out.println(userKim.showUserInfo());
		
	}

} 
