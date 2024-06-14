package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class loginPage {
	
	
	public loginPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	
	@FindBy(name="username")
	public WebElement usernameField;
	
	
	@FindBy(name="password")
	public WebElement passwordField;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement loginButton;
	

}
