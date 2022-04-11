package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {
	
	Boolean dataSetUp = true; 

	@Test(enabled=false)
	public void skipTest1() {
		
		System.out.println("Skipping this test1");
		
	}
	
	@Test
	public void skipTest2() {
		
		System.out.println("Skipping this test2");
		throw new SkipException("Skipping this test through exception");
		
	}
	
	@Test
	public void skipTest3() {
		
		
		System.out.println("Skipping this test3 based on condition");
		if(dataSetUp) {
			System.out.println("Excuted test");
		}else {
		 throw new SkipException("Skipping this test through exception");
		}
	}
}
