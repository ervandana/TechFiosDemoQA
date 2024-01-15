package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.CommonMethods;
import utils.ProjectMethods;

public class LoginPage extends ProjectMethods {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//WebElement
	@FindBy (how = How.XPATH, using = "input[@id='username']") WebElement USERNAME_ELEMENT;
	@FindBy (how = How.ID, using = "password") WebElement PASSWORD_ELEMENT;
	@FindBy (how = How.ID, using= "login") WebElement LOGINBUTTON_ELEMENT;
	@FindBy (how = How.ID, using= "newUser") WebElement NEWUSER_ELEMENT;
	
	public LoginPage enterUsername(String uName) {
		
		locateElementValue(USERNAME_ELEMENT, uName);
		return this;
		
	}
	
	public LoginPage enterPassword(String psswd) {
		
		locateElementValue(PASSWORD_ELEMENT, psswd);
		return this;
		
	}
	
	public ProfilePage clickLogin() {
		
		click(LOGINBUTTON_ELEMENT);
		return new ProfilePage();
		
	}
	
	public RegisterPage clickNewuser() {
		
		click(NEWUSER_ELEMENT);
		return new RegisterPage();
		
	}

}
