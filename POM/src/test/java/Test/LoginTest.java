package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTest {
	
	
	
	
	
	
	//@Parameters({"uName","psswd"})
	@Test(dataProvider= "data")
	
	public void logintest1(String uName, String psswd) {
		
		new LoginPage()
		.enterUsername(uName)
		.enterPassword(psswd)
		.clickLogin();
	}

}
