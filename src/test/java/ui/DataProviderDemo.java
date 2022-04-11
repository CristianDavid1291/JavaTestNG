package ui;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
	
	
	
	@DataProvider(name= "data1")
	public Object[][] dataSet1(Method m) {
		
		
		if(m.getName().equals("test1")) {
		
		return new Object[][] {
			{"standard_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"locked_out_user","secret_sauce"}
		};
	 }
		
		if(m.getName().equals("test2")) {
			
		return new Object[][] {
			{"user1","secret_sauce","message1"},
			{"user2","secret_sauce","message1"},
			{"user3","secret_sauce","message1"},
			{"user4","secret_sauce","message1"}
		};
	 }
	
		
		
		return null;
	}
	

}
