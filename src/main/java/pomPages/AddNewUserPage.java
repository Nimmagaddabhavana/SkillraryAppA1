package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewUserPage {

	//Declaration
	@FindBy(xpath = "//b[text()='Add New User']")
	private WebElement PageHeader;
	
	@FindBy(xpath = "//input[@id='email' and @required]")
	private WebElement emailTF ;
	
	@FindBy(xpath = "//input[@id='password' and @required]")
	private WebElement passwordTF ;
	
	@FindBy(xpath = "//input[@id='firstname' and @required]")
	private WebElement  firstnameTF;
	
	@FindBy(xpath = "//input[@id='lastname' and @required]")
	private WebElement lastnameT;
	
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement addressTextArea;
	
	@FindBy(xpath = "//input[@id='photo'])[2]")
	private WebElement photo;
	
	@FindBy(xpath = "//button[@name='add']")
	private WebElement saveButton;

	private Object contactInfoTF;

	private Object lastnameTF;

	private CharSequence email;

	private CharSequence password;

	private CharSequence firstname;

	private Object lastname;

	private CharSequence adress;

	private Object contacat;

	private CharSequence photopath;

	private WebElement pageHeader;
	
	
	//Initialization
	public void AddNewUserpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	//Utilization
	public String getPageHeader() {
		return pageHeader.getText();
	}
	public void creatNewUser(String email, String password, String firstname, String lastname, String address, String contact, String photopath) {
	
		emailTF.sendKeys(email);
		passwordTF.sendKeys(password);
		firstnameTF.sendKeys(firstname);
		lastnameTF).sendKeys(lastname);
		addressTextArea.sendKeys(adress);
		contactInfoTF).sendKeys(contacat);
		photo.sendKeys(photopath);
		saveButton.click();
		
	}
}
