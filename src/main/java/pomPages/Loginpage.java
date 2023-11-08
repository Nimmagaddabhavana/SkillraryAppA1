package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUnity;

public class Loginpage {
	
	//Declaration
	@FindBy(xpath = "//h3[text()='Login']")
	private WebElement pageHeader;

	@FindBy(id = "email")
	private WebElement emailTF;
	
	@FindBy(id = "password")
	private WebElement passwordTF;
	
	@FindBy(id = "login")
	private WebElement loginButton;
	
	//Initialization
	public  Loginpage(WebDriverUnity driver) {
		PageFactory.initElements(driver, this);
		
	}
	//UtiliZation
	
	public String getPageHeader() {
		return pageHeader.getText();
	}
	
	public void setEmail(String email) {
		emailTF.sendKeys(email);
	}
	public void setPassword(String password) {
		passwordTF.sendKeys(password);
		
	}
	public void clickLogin() {
		loginButton.submit();
	}
}
