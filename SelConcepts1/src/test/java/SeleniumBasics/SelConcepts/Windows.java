package SeleniumBasics.SelConcepts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windows {
	//@Test
	public static void learnNewTab() {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("tabButton")).click();
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String each : windowHandles) {
		System.out.println(driver.switchTo().window(each));
		}
		System.out.println(driver.getCurrentUrl());
		
	}
	
	//@Test
	public static void learnNewWindow() {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String each : windowHandles) {
		System.out.println(driver.switchTo().window(each));
		}
		System.out.println(driver.getCurrentUrl());
		
		//driver.switchTo().newWindow(WindowType.TAB); for version 4 or newer
	}
}






























