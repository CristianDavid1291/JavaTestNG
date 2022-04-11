package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleAndText {
	
	@Test
	public void titleTest() throws InterruptedException {
		
		SoftAssert softAssert = new SoftAssert();
		String titleExpected = "Artículos electrónicos, arr autos, ropa, objetos de colección, cupones y más | eBay";	
		String textExpected = "Buscar";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String title = driver.getTitle();
		String text = driver.findElement(By.xpath("//input[@id='gh-btn']")).getAttribute("value");
		System.out.println("Verifying tittle");
		softAssert.assertEquals(title, titleExpected,"Title verification failed");
		
		System.out.println("Verifying text");
		softAssert.assertEquals(text, textExpected,"Text verification failed");
		
		System.out.println("Closing browser");
		driver.close();
		softAssert.assertAll();
		
	}
	

}
