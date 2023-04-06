package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasicDemo3 {

	@Test(enabled=false)
	public void webLogin() {
		System.out.println("WEB AUTOMATION");
	}
	@Parameters({"URL","APIKEY/USERNAME"})
	@Test
	public void phoneLogin(String url,int key) {
		System.out.println("PHONE AUTOMATION");
		System.out.println(url);
		System.out.println(key);
	}
	@Test(dataProvider="getData")
	public void phoneSignin(String username,String password) {
		System.out.println("PHONE AUTOMATION");
		System.out.println(username);
		System.out.println(password);
	}
	@Test
	public void phoneRegin() {
		System.out.println("PHONE AUTOMATION");
	}
	@Test(dependsOnMethods= {"phoneLogin","phoneRegin"})
	public void phoneLogout() {
		System.out.println("PHONE AUTOMATION");
	}
	@Test(groups= {"smoke"})
	public void apiLogin() {
		System.out.println("API AUTOMATION");
	}
	@AfterSuite(groups= {"smoke"})
	public void lastSuit() {
		System.out.println("AFTER SUITE EXECUTION");
	}
	@DataProvider
	public Object[][] getData() {
		//1st combination username password -good credit score
		//2nd combination username password -no credit score
		//3rd combination username password-fraude credit score
		Object[][] ob = new Object[3][2];
		ob[0][0]="firstusername";
		ob[0][1]="password";
		
		ob[1][0]="secondusername";
		ob[1][1]="passwordsecond";
		
		ob[2][0]="thirdusername";
		ob[2][1]="passwordthird";
		return ob;
	}
}

