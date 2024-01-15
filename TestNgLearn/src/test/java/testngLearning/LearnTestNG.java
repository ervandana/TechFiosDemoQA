package testngLearning;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearnTestNG {

	String browser = null;
	String url = null;
	WebDriver driver;
	
	By USER_Name_Field = By.xpath("//input[@id = 'username']");
	By USER_Pswd_Field = By.xpath("//input[@id = 'password']");
	By USER_Login_Button = By.xpath("//button[@name ='login']");
	By DashBoard_Page_Validation = By.xpath("//h2[text()='Dashboard ']");
	By Side_Menu = By.xpath("//*[@id=\"side-menu\"]/li[2]/a");
	By AddContact_Menu = By.xpath("//ul[@class ='nav nav-second-level collapse in']//a");
	By ListContact_Menu = By.xpath("//ul[@class ='nav nav-second-level collapse in']/li[2]/a");

	@BeforeClass
	public void readConfigFile() {

		// read external file through Scanner, InputStream, FileReader, BufferReader
		try {
			InputStream input = new FileInputStream("src\\test\\java\\Config\\config.properties");
			
			Properties prop = new Properties();
			prop.load(input);
			browser = prop.getProperty("browser");
			url = prop.getProperty("url");

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@BeforeMethod
	public void init() {

		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

	}

	@Test
    public void homework4() {
    	driver.findElement(USER_Name_Field).sendKeys("techfiosdemo@gmail.com");
    	driver.findElement(USER_Pswd_Field).sendKeys("abc123");
    	driver.findElement(USER_Login_Button).click();
    	//Assert.assertEquals("Page Not Found!", driver.findElement(DashBoard_Page_Validation));
    	driver.findElement(Side_Menu).click();
    	driver.findElement(AddContact_Menu).click();
	}

}
