package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.browserEngine;
import utilities.logInfo;
import utilities.userData;

public class T03_knowledgeFunctionalityTest {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void setUpBrowser() {
		
		driver=browserEngine.getBrowser("chrome");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);	
	}

	@Test
	public void knowledgeCentrePageFunctionalityPage() {
		
		driver.get(userData.appUrl);
		
		driver.findElement(By.linkText(userData.kcentre)).click();
		//logInfo.info(userData.kcntr);
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
}
