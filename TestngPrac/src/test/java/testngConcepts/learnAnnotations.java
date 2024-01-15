package testngConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class learnAnnotations {
	
	WebDriver driver;
	String browser;
	
	public void init () {
		
		if(browser.equalsIgnoreCase(browser)) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		
	} else if(browser.equalsIgnoreCase(browser)) {
		if(browser.equalsIgnoreCase(browser)) {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		
		}
	}
		}

}
