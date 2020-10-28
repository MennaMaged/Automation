package automation.task.objectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;

public class GUI_SignInPage {

	private WebDriver driver;

	public GUI_SignInPage(WebDriver driver) {
		this.driver = driver;
	}

	///// Elements /////
	private By username = By.xpath("//input[@placeholder='Username']");
	private By password = By.xpath("//input[@placeholder='Password']");
	private By signInButton = By.xpath("//button[@type='submit']");

	///// Functions /////

	public void submitSignInCredentials(String usernameStr, String passwordStr) {
		ElementActions.type(driver, username, usernameStr);
		ElementActions.type(driver, password, passwordStr);
		ElementActions.click(driver, signInButton);
	}

}
