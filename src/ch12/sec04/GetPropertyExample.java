package ch12.sec04;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//os정보
		String osName = System.getProperty("os.name");
		System.out.println(osName);
		String userName = System.getProperty("user.name");
		System.out.println(userName);
		String userHome = System.getProperty("user.home");
		System.out.println(userHome);
		
		System.out.println("----------------");
		System.out.println("key: value");
		System.out.println("----------------");
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.printf("%-40s: %s\n", key, value);
		}
	}

}
