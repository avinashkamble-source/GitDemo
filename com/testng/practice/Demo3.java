package com.testng.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo3 {

	@Test()
	public void f8() {
		System.out.println("Hyderabad Demo3 f8");
	}

	@Test(dataProvider = "getData", groups = "Demo3" )
	public void f9(String aQ, String year, String city) {
		System.out.println("Bengaluru Demo3 f9");
		System.out.println("Bengaluru Demo3 f9--->" + aQ);
		System.out.println("Bengaluru Demo3 f9--->"+ year);
		System.out.println("Bengaluru Demo3 f9-->" + city);
	}

	@DataProvider
	public Object[][] getData() {
		//String qualifications = "Hello";
		Object[][] qualifications = new Object[3][3];
		qualifications[0][0] ="BE";
		qualifications[0][1] ="2015";
		qualifications[0][2] ="BAN";
		
		qualifications[1][0] ="BEC";
		qualifications[1][1] ="2016";
		qualifications[1][2] ="APN";
		
		qualifications[2][0] ="CEC";
		qualifications[2][1] ="2017";
		qualifications[2][2] ="XYZ";
		
		
		/*
		 * ArrayList< String> qualifications = new ArrayList<String>();
		 * qualifications.add("BE"); qualifications.add("BCE");
		 * qualifications.add("BAE"); qualifications.add("BRE");
		 */
		return qualifications;
	}

	@Test(groups = "Demo3", dependsOnMethods = "f9")
	public void f10() {
		System.out.println("Ballari Demo3 f10");
	}

	@Parameters({ "URL", "USERNAME", "PASSWORD" })
	@Test(groups = "Demo3", dependsOnMethods = "f10")
	public void f11(String url, String username, String password) {
		System.out.println("Poona Demo3 f11");
		System.out.println("Poona Demo3 f11-->" + url);
		System.out.println("Poona Demo3 f11--->" + username);
		System.out.println("Poona Demo3 f11-->" + password);

	}
}
