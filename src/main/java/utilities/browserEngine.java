package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserEngine {

public static WebDriver driver;
	
	public static WebDriver getBrowser(String browserType) {
		switch (browserType) {
		case "firefox":
			System.setProperty ("webdriver.gecko.driver","C:\\myjava\\P2\\forumAutomation\\drivers\\geckodriver.exe" );
			return	driver = new FirefoxDriver();
		case "chrome":
			System.setProperty ("webdriver.chrome.driver", "C:\\Digital Point\\Automation\\Drivers\\chromedriver.exe");;
			return	driver = new ChromeDriver();
		case "IE":
			System.setProperty ("webdriver.ie.driver", "C:\\myjava\\P2\\forumAutomation\\drivers\\IEDriverServer.exe");
			return	driver = new InternetExplorerDriver();
		default:
			System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
			return driver = new FirefoxDriver();
		}
	}
}
