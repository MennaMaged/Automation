package automation.task.objectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;
import com.shaft.validation.Assertions;
import com.shaft.validation.Assertions.AssertionComparisonType;
import com.shaft.validation.Assertions.AssertionType;

public class GUI_LoginPage {

	private WebDriver driver;

	public GUI_LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	///// Elements /////
	private By username = By.id("email");
	private By password = By.id("pass");
	private By signInButton = By.id("u_0_b");

	///// Functions /////

	public void submitLoginCredentials(String usernameStr, String passwordStr) {
		ElementActions.type(driver, username, usernameStr);
		ElementActions.type(driver, password, passwordStr);
		ElementActions.click(driver, signInButton);
	}
	
	public void assertUserIsOnLoginPage() {
	Assertions.assertEquals(true, ElementActions.isElementDisplayed(driver, username),
			AssertionComparisonType.EQUALS, AssertionType.POSITIVE);
	}

}
