package ch13.domain.userinfo.dao;

import ch13.domain.userinfo.UserInfo;

public interface UserInfoDao {
	
	void insertUserInfo(UserInfo userinfo);
	void updatetUserInfo(UserInfo userinfo);
	void deleteUserInfo(UserInfo userinfo);
	
	
}
