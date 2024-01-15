package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserFactory {
	 WebDriver driver;
	
	 public void init() {
		 System.setProperty("Webdriver.chrome.driver", "./driver/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://techfios.com/test/billing/?ng=admin/");
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		
	 }
	 
		 

}
