package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.browserEngine;
import utilities.userData;

public class T04_qaOutsourcePageTest {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void browsersetUp(){

		driver=browserEngine.getBrowser("chrome");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@Test
	public void qaOutsourcePage() {
		
		driver.get(userData.outsrc);
		
		driver.findElement(By.name("fname")).sendKeys(userData.fname);
		driver.findElement(By.name("lname")).sendKeys(userData.lname);
		driver.findElement(By.name("cemail")).sendKeys(userData.cemail);
		driver.findElement(By.name("pnumber")).sendKeys(userData.pnumber);
	   Select s=new Select(driver.findElement(By.name("services")));
	   s.selectByVisibleText("Automation Testing");
	   
	   driver.findElement(By.xpath(userData.qaxpath)).sendKeys(userData.des);
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
	

}
