package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectMethods extends CommonMethods {
	
	static By userName = By.id("userName");
	static By password = By.id("password");
	
	
	@Parameters({"link"})
	//@BeforeMethod
	public static void loginPage(String link) {
		CommonMethods.startApp("chrome", link);
		
		CommonMethods.scrollPage("window.scrollBy(0,250)", "null");
		
		WebElement eleUserName = CommonMethods.locateElement("id", "userName");
		//CommonMethods.locateElementValue(eleUserName, username);
		WebElement elePassword = CommonMethods.locateElement("id", "password");
		//CommonMethods.locateElementValue(elePassword, pswd);
		WebElement loginButton = driver.findElement(By.id("login"));
		CommonMethods.click(loginButton);
	}
	
	//@AfterMethod
	public void close() {
		CommonMethods.teardown();
		
		
	}

}
