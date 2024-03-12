package JUnit;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitPrac {

	@Test
	public void checkBoxes() {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/checkbox");
		driver.findElementByXPath("//div[@class = 'rct-options']/button").click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");

		WebElement checkOffice = driver.findElementByXPath("(//label['tree-node-office']/descendant::span)[29]");
		checkOffice.click();
		//System.out.println(checkOffice.isEnabled());

	List<WebElement> list = driver.findElementsByXPath(
				"((//li[@class = 'rct-node rct-node-parent rct-node-expanded'])[5]//following::ol)[1]");

		for (WebElement each : list) {

			System.out.println(each.getText());
			//System.out.println(each.isEnabled());

		} 

		List<WebElement> list2 = driver.findElementsByXPath("//*[local-name()='svg' and @class = 'rct-icon rct-icon-check']");

		for (WebElement each2 : list2) {
			
			System.out.println(each2.isEnabled());
		}
		
		// System.out.println(driver.findElementByXPath("(//*[local-name()='svg'])[73]").isEnabled());
		// System.out.println(driver.findElementByXPath("(//*[local-name()='svg'])[75]").isEnabled());
		// System.out.println(driver.findElementByXPath("(//*[local-name()='svg'])[77]").isEnabled());
		// System.out.println(driver.findElementByXPath("(//*[local-name()='svg'])[78]").isEnabled());
		driver.close();
	}

}
