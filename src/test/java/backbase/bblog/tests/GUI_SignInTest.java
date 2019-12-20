package backbase.bblog.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.browser.BrowserFactory;
import com.shaft.tools.io.ExcelFileManager;

import backbase.bblog.objectModels.GUI_HomePage;
import backbase.bblog.objectModels.GUI_SignInPage;
import io.qameta.allure.Description;

public class GUI_SignInTest {

	private WebDriver driver;
	private GUI_SignInPage signInPage;
	private GUI_HomePage homePage;
	private ExcelFileManager testDataReader;

	@Test(description = "TC# 2 - Verify Sign In with valid username and password")
	@Description("When user sign in with valid credentials, then he should be logged in successfully")
	public void verifyValidSignIn() {
		homePage.navigateToSignInPage();
		signInPage.submitSignInCredentials(testDataReader.getCellData("username"), testDataReader.getCellData("password"));
		homePage.assertUserIsLoggedIn();
	}

	@BeforeClass
	public void beforeClass() {
		driver = BrowserFactory.getBrowser();
		signInPage = new GUI_SignInPage(driver);
		homePage = new GUI_HomePage(driver);
		testDataReader = new ExcelFileManager(
				System.getProperty("testDataFolderPath") + "TestDataSheet.xlsx");
		BrowserActions.navigateToURL(driver, System.getProperty("authenticatedURL"));
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
