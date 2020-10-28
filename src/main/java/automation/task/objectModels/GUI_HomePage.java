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
	private By welcomeLabel = By.id("pagelet_welcome");

	///// Functions /////


	public void assertUserIsLoggedIn() {
		Assertions.assertEquals(true, ElementActions.isElementDisplayed(driver, welcomeLabel),
				AssertionComparisonType.EQUALS, AssertionType.POSITIVE);
	}

}
