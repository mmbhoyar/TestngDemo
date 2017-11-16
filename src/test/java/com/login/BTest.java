package com.login;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * B
 * @author Yogesh
 *
 */
public class BTest {
  
		
		@BeforeMethod
		public void m1(){
			System.out.println("inside before m1 method B-Class");
		}
		
		@AfterMethod
		public void m2(){
			System.out.println("inside after m1 method B-Class");
		}
		
	  @Test(groups={"B","smoke"})
	  public void b1() {
		  System.out.println("b1");
	  }
	  
	  @Test(groups={"B"})
	  public void b2() {
		  System.out.println("b2");
	  }
	  
	  @Test(groups={"B"})
	  public void b3() {
		  System.out.println("b3");
	  }
	 
	  @BeforeSuite
	  public void demo(){
		  System.out.println("inside before suite");
	  }
	
	  
	  @Test(dependsOnMethods="t2")
	  public void t1(){
		  System.out.println("inside t1 method");
	  }
	
	  @Test
	  public void t2(){
		  int i=10/0;
		  System.out.println("inside t2");
	  }
}
