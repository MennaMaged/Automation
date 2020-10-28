package automation.task.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.browser.BrowserFactory;

import automation.task.objectModels.GUI_HomePage;
import automation.task.objectModels.GUI_SignUpPage;
import io.qameta.allure.Description;

public class GUI_SignUpTest {

	private WebDriver driver;
	private GUI_SignUpPage signUpPage;
	private GUI_HomePage homePage;

	@Test(description = "TC# 10 - Verify that clicking Sign up button will navigate user to Sign up page")
	@Description("When user click on sign up button at home page, then he should be navigated to sign up page")
	public void verifyNavigationToSignUpPage() {
		homePage.navigateToSignUpPage();
		signUpPage.assertSignUpPageIsOpened();
	}

	@BeforeClass
	public void beforeClass() {
		driver = BrowserFactory.getBrowser();
		signUpPage = new GUI_SignUpPage(driver);
		homePage = new GUI_HomePage(driver);
		BrowserActions.navigateToURL(driver, System.getProperty("authenticatedURL"));
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
