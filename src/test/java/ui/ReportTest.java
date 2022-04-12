package ui;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportTest {
	
	@Test
	public void reportTest1() {
		
		System.out.println("This is test 1");
		
	}
	@Test
	public void reportTest2() {
		
		Reporter.log("This is test2");
		System.out.println("This is test 2");
		
	}
	
	@Test
	public void reportTest3() {
		
		System.out.println("This is test 3");
		
	}
	
	@Test
	public void reportTest4() {
		
		System.out.println("This is test 4");
		
	}

}
