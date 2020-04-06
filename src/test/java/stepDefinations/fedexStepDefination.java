package stepDefinations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.userData;

public class fedexStepDefination {
	
	public static WebDriver driver;

	@Given("^User is on Fedex login page$")
	public void user_is_on_fedex_login_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Digital Point\\eclipse-workspace\\My Practice\\BootCamp1\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(userData.fedexUrl);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	}

	@When("^User fills up the registration page with following information$")
	public void user_fills_up_the_registration_page_with_following_information(DataTable data) throws Throwable {
		
		List<List<String>> obj=data.raw();
		
		driver.findElement(By.name("firstName")).sendKeys(obj.get(0).get(0));
		driver.findElement(By.name("lastName")).sendKeys(obj.get(0).get(1));
		driver.findElement(By.name("email")).sendKeys(obj.get(0).get(2));
		driver.findElement(By.name("retypeEmail")).sendKeys(obj.get(0).get(3));
		driver.findElement(By.name("address1")).sendKeys(obj.get(0).get(4));
		driver.findElement(By.name("city")).sendKeys(obj.get(0).get(5));
		driver.findElement(By.name("zip")).sendKeys(obj.get(0).get(6));
		driver.findElement(By.name("phone")).sendKeys(obj.get(0).get(7));
		driver.findElement(By.name("loginId")).sendKeys(obj.get(0).get(8));
		driver.findElement(By.name("password")).sendKeys(obj.get(0).get(9));
		driver.findElement(By.name("retypePassword")).sendKeys(obj.get(0).get(10));
		driver.findElement(By.name("reminderAnswer")).sendKeys(obj.get(0).get(11));

	}


	@When("^User selects Province, Country, Secret quesion$")
	public void user_selects_province_country_secret_quesion() throws Throwable {
		
		Select provSelect=new Select(driver.findElement(By.xpath("//*[@id=\"state\"]")));
		provSelect.selectByValue("ON");
		
		Select qSelect=new Select(driver.findElement(By.xpath("//*[@id=\"reminderQuestion\"]")));
		qSelect.selectByIndex(1);

	}

	@When("^User checks the check boxes$")
	public void user_checks_the_check_boxes() throws Throwable {
		
		driver.findElement(By.id("acceptterms")).click();
		driver.findElement(By.id("cboptin")).click();
		driver.findElement(By.id("accountType3Radio")).click();

	}

	@Then("^Fdex user account is created succesfully$")
	public void fdex_user_account_is_created_succesfully() throws Throwable {
		
		System.out.println("Fedex user account has succfully created");

	}


}
