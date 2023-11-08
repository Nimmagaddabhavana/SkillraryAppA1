package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUnity;

public class UsersPage {
	 
	private static final WebElement userListLastPage = null;

	//Declaration
	@FindBy(xpath = "//h1[normalize-space(text())='user']")
	private WebElement PageHeader;
	
	@FindBy(xpath = "//a[text())='New']")
	private WebElement PluseNewButton;
	
	@FindBy(xpath = "//ul[@class='pagnition']/li[last()-1]/a")
	private WebElement usersListLastPage;
	
	@FindBy(xpath = "//table/tbody/tr[last()]/td[3]")
	private WebElement lastUser;
	
	//Initialization
	public UsersPage (WebDriverUnity driver) {
		PageFactory.initElements(driver, this);
	
	}
	
	//Utilization
	public String getPageHeader() {
		return PageHeader.getText();
	}
	public void clickNewButton() {
		PluseNewButton.click();
	}
	public void clickUserListLastPage() {
		userListLastPage.click();
	}
	public String getLastUserName() {
		return lastUser.getText();
}
}
