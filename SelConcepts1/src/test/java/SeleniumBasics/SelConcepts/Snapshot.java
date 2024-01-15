package SeleniumBasics.SelConcepts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Snapshot {
	
	@Test
	public static void learnSnapShot() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/automation-practice-form");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.id("firstName")).sendKeys("Surya");
		driver.findElement(By.xpath("//input[@id = 'lastName']")).sendKeys("Sivakumar");
		driver.findElement(By.id("userEmail")).sendKeys("suryask@gmail.com");
		driver.findElement(By.xpath("//label[@class= 'custom-control-label']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("987-568-4555");
		driver.findElement(By.id("dateOfBirthInput")).click();
		driver.findElement(By.className("react-datepicker__month-select")).click();
		Select dd1 = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		dd1.selectByValue("2");
		Select dd2 = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		dd2.selectByValue("1985");
		driver.findElement(By.xpath("//div[@class ='react-datepicker__day react-datepicker__day--005']")).click();
		Thread.sleep(3000);
		
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./snaps/image.png"));
        driver.quit();
	}

}
