package hybridModel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.excelReader;

public class runnerFile {

	public static WebDriver driver;

	@Test
	public void objectRunner() throws IOException {

		excelReader.fileReader();

		for (int iRow=1; iRow<5; iRow++) {

			String cellvalue=excelReader.sheetReader(iRow, 4);

			if(cellvalue.equals("OpenBrowser"))
			{
				keywordObjects.OpenBrowser();
			}
			else if(cellvalue.equals("UserLogInPage"))
			{
				keywordObjects.UserLogInPage();
			}
			else if(cellvalue.equals("Email"))
			{
				keywordObjects.Email();
			}
			else if(cellvalue.equals("Password"))
			{
				keywordObjects.Password();
			}
			else if (cellvalue.equals("CheckBox"))
			{
				keywordObjects.CheckBox();
			}
		}
		System.out.println("Hybrid Model is successfully passed");
	}

}
