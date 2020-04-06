package testCases;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.browserEngine;
import utilities.logInfo;
import utilities.userData;

public class T02_qaServicePageFunctionality {

	public static WebDriver driver;

	@BeforeMethod
	public void browsersetUp(){

		driver=browserEngine.getBrowser("chrome");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public void qaPageFunctionalityTest() throws InterruptedException {

		driver.get(userData.appUrl);
		Actions act=new Actions(driver);

		WebElement qa=driver.findElement(By.xpath(userData.slink));
		act.moveToElement(qa).build().perform();
		WebElement 	at=driver.findElement(By.linkText(userData.at));
		act.moveToElement(at).click().build().perform();
		//logInfo.info(userData.ainfo);
		driver.navigate().back();

		WebElement qa1=driver.findElement(By.xpath(userData.slink));
		act.moveToElement(qa1).build().perform();
		WebElement mt=driver.findElement(By.linkText(userData.mt));
		act.moveToElement(mt).click().build().perform();
		//logInfo.error(userData.merror);
		driver.navigate().back();

		WebElement qa2=driver.findElement(By.xpath(userData.slink));
		act.moveToElement(qa2).build().perform();
		WebElement api=driver.findElement(By.linkText(userData.api));
		act.moveToElement(api).click().build().perform();
		//logInfo.debug(userData.apidebug);
		driver.navigate().back();

		WebElement qa3=driver.findElement(By.xpath(userData.slink));
		act.moveToElement(qa3).build().perform();
		WebElement mbt=driver.findElement(By.linkText(userData.mqa));
		act.moveToElement(mbt).click().build().perform();
		//logInfo.fatal(userData.mfatal);
		driver.navigate().back();

		WebElement qa4=driver.findElement(By.xpath(userData.slink));
		act.moveToElement(qa4).build().perform();
		WebElement st=driver.findElement(By.linkText(userData.st));
		act.moveToElement(st).click().build().perform();
		//logInfo.warn(userData.swarn);
		driver.navigate().back();

		WebElement qa5=driver.findElement(By.xpath(userData.slink));
		act.moveToElement(qa5).build().perform();
		WebElement pt=driver.findElement(By.linkText(userData.pt));
		act.moveToElement(pt).click().build().perform();
		//logInfo.info(userData.pinfo);
		driver.navigate().back();
	}



	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
}

