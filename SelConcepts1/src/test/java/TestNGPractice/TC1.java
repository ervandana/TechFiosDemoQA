package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.CommonMethods;
import Utils.ProjectMethods;

public class TC1 extends ProjectMethods{
	
	@Test(enabled = false)
	public void profilePage() {
		
		driver.findElement(By.linkText("You Don't Know JS")).click();
		String actualISBN = driver.findElement(By.id("userName-value")).getText();
		String expectedISBN = "9781491904244";
		Assert.assertEquals(actualISBN, expectedISBN, expectedISBN);
		System.out.println(expectedISBN);
		scrollPage("window.scrollBy(0,250)", "null");
		driver.findElement(By.id("addNewRecordButton")).click();
		
	}
	
	
	@Test
	public void bookStorePage(){ 
		//driver.findElement(By.id("userName-label")).click();
		
		Actions mouseAction = new Actions(driver);
		mouseAction.click();
		mouseAction.moveToElement(driver.findElement(By.id("gotoStore"))).build().perform();
		
		//CommonMethods.scrollPage("window.scrollTo(0,documen.body.scrollHeight)", "null");
		
		driver.findElement(By.id("gotoStore")).click();
		driver.findElement(By.linkText("Git Pocket Guide")).click();
		String actualISBN = driver.findElement(By.id("userName-value")).getText();
		String expectedISBN = "9781491904244";
		Assert.assertEquals(actualISBN, expectedISBN, expectedISBN);
		System.out.println(expectedISBN);
		CommonMethods.scrollPage("window.scrollBy(0,250)", "null");
		driver.findElement(By.id("addNewRecordButton")).click();
	}
}
