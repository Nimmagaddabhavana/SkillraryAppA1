package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUnity;

public class AdminHomePage {
	
	//Declaration
	@FindBy(xpath = "//span[text()='SkillRary Admin']")
	private WebElement adminIcon;
	
	@FindBy(xpath = "//span[text()='User']")
	private WebElement userTab;
	
	@FindBy(xpath = "//span[text()='courses']")
	private WebElement courseTab ;
	
	@FindBy(xpath = "//span[text()='Course List']")
	private WebElement courseListLink;
	
	@FindBy(xpath = "//span[text()='Category']")
	private WebElement cateroryLink;
	
	@FindBy(xpath = "//span[text()='Sing out']")
	private WebElement  singOutLink;

	private WebElement coursesTab;

	private WebElement categoryLink;

	private WebElement signOutLink;
	
	//Initialization
	public AdminHomePage (WebDriverUnity driver) {
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public String getAdminicon() {
		return adminIcon.getText();
	}
	public void clickUsersTab() {
		userTab.click();
	}
	public void clickCoursesTab() {
		coursesTab.click();
	}
	public void clickCategoryLink() {
		categoryLink.click();
	}
	public void SignOutofApp() {
		adminIcon.click();
		signOutLink.click();
	}
}

