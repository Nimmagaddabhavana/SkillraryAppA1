package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUnity;

public class WelcomePage {
	//Declaration
	@FindBy(xpath = "//a[@class='navbar-brand']")
	private WebElement logo;
	
	@FindBy(xpath = "//a[@text()='LOGIN']")
	private WebElement loginButton;
	
	//Initialization
	public WelcomePage(WebDriverUnity driver) {
		PageFactory.initElements(driver, this);
		
	}
	//Utilization
	public String getLogo() {
		return logo.getText();
	}
	public void ClickLoginButton() {
		loginButton.click();
		
	}
	
	
}
