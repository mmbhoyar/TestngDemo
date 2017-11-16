package com.login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * A Module
 * @author Yogesh
 *
 */
public class ZTest {
	
@BeforeClass
 public void aaa(){
	 System.out.println("inside before A-class ");
 }
	

@AfterClass
public void aa1(){
	 System.out.println("inside after A-class");
}

  @Test(groups={"a"})
  public void a1() {
	  System.out.println("a1");
  }
  
  @Test(groups={"a"})
  public void a2() {
	  System.out.println("a2");
  }
  
  @Test(groups={"a","smoke"})
  public void a3() {
	  System.out.println("a3");
  }
  
  @AfterSuite
  public void demo(){
	  System.out.println("inside after suite");
  }

  @AfterTest
	public void xx(){
		System.out.println("inside After test -- A-Class");
	}
  
}
