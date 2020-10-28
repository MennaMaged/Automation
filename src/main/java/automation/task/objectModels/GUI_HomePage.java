package automation.task.objectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;
import com.shaft.validation.Assertions;
import com.shaft.validation.Assertions.AssertionComparisonType;
import com.shaft.validation.Assertions.AssertionType;

public class GUI_HomePage {

	private WebDriver driver;

	public GUI_HomePage(WebDriver driver) {
		this.driver = driver;
	}

	///// Elements /////
	private By signInLink = By.xpath("//a[@href='#/login']");
	private By signUpLink = By.xpath("//a[@href='#/register']");
	private By yourFeedLabel = By.xpath("//a[text()='Your Feed']");

	///// Functions /////

	public void navigateToSignInPage() {
		ElementActions.click(driver, signInLink);
	}
	
	public void navigateToSignUpPage() {
		ElementActions.click(driver, signUpLink);
	}

	public void assertUserIsLoggedIn() {
		Assertions.assertEquals(true, ElementActions.isElementDisplayed(driver, yourFeedLabel),
				AssertionComparisonType.EQUALS, AssertionType.POSITIVE);
	}

}
