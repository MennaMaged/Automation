package automation.task.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.browser.BrowserFactory;
import com.shaft.tools.io.ExcelFileManager;

import automation.task.objectModels.GUI_HomePage;
import automation.task.objectModels.GUI_LoginPage;
import io.qameta.allure.Description;

public class GUI_LoginTest {

	private WebDriver driver;
	private GUI_LoginPage loginPage;
	private GUI_HomePage homePage;
	private ExcelFileManager testDataReader;

	@Test(description = "TC# 1 - Verify Login with valid username and password")
	@Description("When user login with valid credentials, then he should be logged in successfully")
	public void verifyValidLogin() {
		loginPage.submitLoginCredentials(testDataReader.getCellData("username"), testDataReader.getCellData("password"));
		homePage.assertUserIsLoggedIn();
	}
	
	@Test(description = "TC# 2 - Verify Login with invalid username and invalid password")
	@Description("When user login with invalid credentials, then he shouldn't be logged in")
	public void verifyInvalidLogin() {
		loginPage.submitLoginCredentials(testDataReader.getCellData("username","Data2"), testDataReader.getCellData("password","Data2"));
		loginPage.assertUserIsOnLoginPage();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver = BrowserFactory.getBrowser();
		loginPage = new GUI_LoginPage(driver);
		homePage = new GUI_HomePage(driver);
		testDataReader = new ExcelFileManager(
				System.getProperty("testDataFolderPath") + "TestDataSheet.xlsx");
		BrowserActions.navigateToURL(driver, System.getProperty("baseURL"));
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
}
