package com.login;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class xTest {
  
	@BeforeTest
	public void xx(){
		System.out.println("inside before test -- C-Class");
	}
	
	@Test(groups={"c"},priority=1)
	  public void z1() {
		  System.out.println("c1");
	  }
	  
	@Test(groups={"c","xyz","smoke"})
	  public void c2() {
		  System.out.println("c2");
	  }
	  
	@Test(groups={"c"})
	  public void c3() {
		  System.out.println("c3");
	  }
	
	@Test(groups={"c","pqr"})
	  public void c4() {
		  System.out.println("c4");
	  }
	
	  @Test(groups={"smoke"})
	  public void c5() {
		  System.out.println("c5");
	  }
	
	  
	
}
