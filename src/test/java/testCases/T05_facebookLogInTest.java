package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.browserEngine;
import utilities.userData;

public class T05_facebookLogInTest {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void browsersetUp(){

		driver=browserEngine.getBrowser("chrome");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@Test
	public void facebookLogIn() {
		
		driver.get(userData.fburl);
		
		driver.findElement(By.name("firstname")).sendKeys(userData.fname);
		driver.findElement(By.name("lastname")).sendKeys(userData.lname);
		driver.findElement(By.name("reg_email__")).sendKeys(userData.cemail);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys(userData.cemail);
		driver.findElement(By.name("reg_passwd__")).sendKeys(userData.fbpass);
		
		Select monthSelect=new Select(driver.findElement(By.id("month")));
		monthSelect.selectByVisibleText("Jan");
		
		Select daySelect=new Select(driver.findElement(By.id("day")));
		daySelect.selectByIndex(9);
		
		Select yearSelect=new Select(driver.findElement(By.id("year")));
		yearSelect.selectByValue("2018");
		
		driver.findElement(By.id("u_0_a")).click();
		
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

}
