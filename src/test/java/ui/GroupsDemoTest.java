package ui;


import org.testng.annotations.Test;

public class GroupsDemoTest {
	

	
	@Test(priority = 1, groups="regression")
	public void aTest1(){
	
		System.out.println("Test1");

	}
	
	@Test(priority = 2,groups="regression")
	public void aTest2() {
		
		System.out.println("Test2");
		
	}
	
	@Test(priority = 2, groups={"regression","bvt"} )
	public void aTest3() {
		
		System.out.println("Test3");
		
	}
	
	@Test(priority = 2, groups="bvt" )
	public void aTest4() {
		
		System.out.println("Test4");
		
	}

}
