package ch13.domain.userinfo.dao.oracle;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracle implements UserInfoDao {

	
	public void insertUserInfo(UserInfo userinfo) {
		System.out.println("Insert into ORACLE DB userID = " + userinfo.getUserId());
	}

	public void updatetUserInfo(UserInfo userinfo) {
		System.out.println("Update into ORACLE DB userID = "+ userinfo.getUserId());
		
	}

	
	public void deleteUserInfo(UserInfo userinfo) {
		System.out.println("Delete from ORACLE DB userID = "+ userinfo.getUserId());
		
	}
 
}
