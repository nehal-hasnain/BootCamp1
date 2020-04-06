package testCases;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.browserEngine;
import utilities.logInfo;
import utilities.userData;

public class T01_homePageValidation {

	public static WebDriver driver;

	@BeforeMethod
	public void browsersetUp(){

		driver=browserEngine.getBrowser("chrome");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}


	@Test
	public void homePageValidation() throws InterruptedException {
		driver.get(userData.appUrl);
		//logInfo.info(userData.info);
		String aTitle=driver.getTitle();
		Assert.assertEquals(aTitle, userData.eTitle);
		//logInfo.debug(userData.debug);


		driver.findElement(By.partialLinkText("Quote")).click();
		//logInfo.fatal(userData.fatal);
		Thread.sleep(3000);
		driver.navigate().back();


	}

	@AfterMethod
	public void tearDown () throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}


}
