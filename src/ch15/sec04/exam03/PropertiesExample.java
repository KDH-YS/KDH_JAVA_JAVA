package ch15.sec04.exam03;

import java.util.*;

public class PropertiesExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		prop.load(PropertiesExample.class.getResourceAsStream("database.properties"));
	
		String driver = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String  password = prop.getProperty("password");
		String admin = prop.getProperty("admin");
		

		System.out.printf("driver: %s \nurl: %s \nusername: %s \npassword: %s \nadmin: %s "
		,driver,url,username,password,admin);
	}

}
