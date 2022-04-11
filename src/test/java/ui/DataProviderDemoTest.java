package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemoTest {
	

	
	@Test(dataProvider = "data1",dataProviderClass = DataProviderDemo.class)
	public void test1(String username,String password) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		driver.close();
		
	}

	@Test(dataProvider = "data1",dataProviderClass = DataProviderDemo.class)
	public void test2(String username,String password,String message){
	
		System.out.println(username+"===="+password+"===="+message);
	
	}

}
