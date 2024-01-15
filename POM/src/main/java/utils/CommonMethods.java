package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CommonMethods {

	public static RemoteWebDriver driver;
	
	
	

	public static void startApp(String browser, String url) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./driver/edgedriver.exe");
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}


	public static WebElement locateElement(String locator, String locValue) {

		switch (locator) {
		case "id":
			return driver.findElementById(locValue);
		case "class":
			return driver.findElementByClassName(locValue);
		case "xpath":
			return driver.findElementByXPath(locValue);
		case "LinkText":
			return driver.findElementByLinkText(locValue);
		case "name":
			return driver.findElementByName(locValue);

		}
		return null;
	}

	public static void locateElementValue(WebElement ele, String data) {
		ele.sendKeys(data);

	}
    
	public static void click (WebElement ele) {
		ele.click();
	}
    
	public static void scrollPage(String x, Object y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(x, y);
		
	}
	
	public static void teardown() {

		driver.close();

	}
}
