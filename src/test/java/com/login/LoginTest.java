package com.login;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demo.login.AppConstants;
import com.demo.login.LoginController;



public class LoginTest {
	
	/**
	 * AssertEquals -- content equality of an object
	 * AssertSame -- Ref equality of an object
	 * AssertNotEquals
	 * AssertThrow
	 * AssertNull
	 * AsserNotNull
	 * AssertSame
	 * AssertNotSame
	 * AssertTrue
	 * AssertFalse
	 */
	
  @Test
  public void invalidLogin() {
	  LoginController loginController = new LoginController();
	  Assert.assertEquals(loginController.authenticate("admin","adm"),AppConstants.LOGIN_FAILED);
  }
  
  @Test
  public void validLogin() {
	  LoginController loginController = new LoginController();
	  Assert.assertEquals(loginController.authenticate("admin","admin1"),AppConstants.LOGIN_SUCCESSSFUL);
  }
  
  @Test
  public void passwordNull() {
	  LoginController loginController = new LoginController();
	  Assert.assertEquals(loginController.authenticate("admin",null),AppConstants.USERNM_PASSWORD_CANNOT_BLANK);
  }
  
  @Test
  public void usernameNull() {
	  LoginController loginController = new LoginController();
	  Assert.assertEquals(loginController.authenticate(null,"adm"),AppConstants.USERNM_PASSWORD_CANNOT_BLANK);
  }
  
  @Test
  public void bothNull() {
	  LoginController loginController = new LoginController();
	  Assert.assertEquals(loginController.authenticate(null,null),AppConstants.USERNM_PASSWORD_CANNOT_BLANK);
  }
  
}
