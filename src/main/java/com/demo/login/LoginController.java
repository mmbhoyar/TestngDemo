package com.demo.login;

/**
 * 
 * @author Yogesh
 *
 */
public class LoginController {
	
	/**
	 * 
	 * @param p_username
	 * @param p_password
	 * @return
	 */
	public String authenticate(String p_username,String p_password){
		
		String returnValue=AppConstants.LOGIN_FAILED;
		LoginDAO login = new LoginDAOImpl();
		String dbuserName = login.getUserName();
		String dbpassword = login.getPassword();
		
		if(null==p_username || "".equals(p_username)){
			returnValue=AppConstants.USERNM_PASSWORD_CANNOT_BLANK;
		}
		else if(null==p_password || "".equals(p_password)){
			returnValue=AppConstants.USERNM_PASSWORD_CANNOT_BLANK;
		}
		else if(p_username.equals(dbuserName) && p_password.equals(dbpassword)){
			returnValue=AppConstants.LOGIN_SUCCESSSFUL;
		}
		
		return returnValue;
	}

	
}
