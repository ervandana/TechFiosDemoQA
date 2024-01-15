package SeleniumBasics.SelConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {
	
	@Test (priority =1)
	public static void learnFrames() {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/frames");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		System.out.println(driver.switchTo().frame("frame1").getTitle());
		driver.switchTo().defaultContent();
		System.out.println(driver.switchTo().frame("frame2").getTitle());
		
		
	}
	
	@Test(priority =2)
	public static void nestedFrames() {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/nestedframes");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		System.out.println(driver.switchTo().frame("frame1").getCurrentUrl());
		//System.out.println(driver.switchTo().frame("Child Iframe").getTitle());
		
	}

}
