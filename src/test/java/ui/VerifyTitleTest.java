package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest {
	
	@Test
	public void titleTest() throws InterruptedException {
		
		String titleExpected = "Artículos electrónicos, asdsda autos, ropa, objetos de colección, cupones y más | eBay";		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String title = driver.getTitle();
		
		Assert.assertEquals(title, titleExpected,"The titles are not the same");
		driver.close();
		
		
	}
	

}
