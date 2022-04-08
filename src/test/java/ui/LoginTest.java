package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeTest
	public void loginToApplication() {
		
		System.out.println("Login to application");
		
	}

	@AfterTest
	public void logOutToApplication() {
		
		System.out.println("LogOut from application");
		
	}
	
	@BeforeMethod
	public void connectToDB() {
		
		System.out.println("Connect to DB");
		
	}
	
	@AfterMethod
	public void disconnectFromDB() {
		
		System.out.println("Disconnect from DB");
		
	}
	
	@Test(priority = 1,description = "This is a login test")
	public void aTest1(){
	
		System.out.println("Test1");

	}
	
	@Test(priority = 2, description = "This is a logOut test")
	public void aTest2() {
		
		System.out.println("Test2");
		
	}

}
