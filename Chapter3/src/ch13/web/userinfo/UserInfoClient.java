package ch13.web.userinfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMysql;
import ch13.domain.userinfo.dao.oracle.UserInfoOracle;


public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties() ;
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("1234");
		userInfo.setPassword("#$@#");
		userInfo.setUserName("wow");
		
		UserInfoDao userInfoDao = null;
		
		if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracle();}
		
		else if (dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMysql();}
		
		else {
			System.out.println("DB error");
		return;}
		
		
		userInfoDao.insertUserInfo(userInfo); 
	}
	
		
		
	

}
