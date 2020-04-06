package hybridModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.userData;

public class keywordObjects {
	
	public static WebDriver driver;
	
	public static void OpenBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Digital Point\\eclipse-workspace\\My Practice\\BootCamp1\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	public static void UserLogInPage() {
		driver.get(userData.digipointurl);
		driver.findElement(By.linkText("USER LOGIN")).click();
	}

	public static void AdminLogInPage() {
		driver.get(userData.digipointurl);
		driver.findElement(By.linkText("ADMIN LOGIN")).click();
	}
	
	public static void Email() {
		driver.findElement(By.name("email")).sendKeys(userData.cemail);
	}
	
	public static void Password() {
		driver.findElement(By.name("password")).sendKeys(userData.fbpass);
	}
	
	public static void CheckBox() {
		driver.findElement(By.xpath(userData.chbox)).click();
	}
}
