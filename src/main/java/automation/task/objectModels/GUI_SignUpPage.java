package automation.task.objectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;
import com.shaft.validation.Assertions;

public class GUI_SignUpPage {

	private WebDriver driver;

	public GUI_SignUpPage(WebDriver driver) {
		this.driver = driver;
	}

	///// Elements /////
	private By pageTitle = By.xpath("//h1[contains(text(),'Sign')]");

	///// Functions /////

	public void assertSignUpPageIsOpened() {
		Assertions.assertEquals("Sign Up", ElementActions.getText(driver, pageTitle),
				Assertions.AssertionComparisonType.EQUALS, Assertions.AssertionType.POSITIVE);
	}

}
