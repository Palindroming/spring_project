package ch13.domain.userinfo.dao.mysql;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoMysql implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userinfo) {
		// TODO Auto-generated method stub
		
		System.out.println("Insert into MySQL DB userID = "+ userinfo.getUserId());
	}

	@Override
	public void updatetUserInfo(UserInfo userinfo) {
		// TODO Auto-generated method stub
		System.out.println("Update into MySQL DB userID = "+ userinfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userinfo) {
		System.out.println("Delete from MySQL DB userID = "+ userinfo.getUserId());
		
	}

	
}
