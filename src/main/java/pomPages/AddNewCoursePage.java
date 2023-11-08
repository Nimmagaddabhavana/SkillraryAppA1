package pomPages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUnity;

public class AddNewCoursePage {

	//Declaration
	@FindBy(xpath="//b[text()='Add New Course']")
	private WebElement PageHeader;
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement nameTF;
	
	@FindBy(id="category")
	private WebElement categoryDropdown;

	
	@FindBy(id="price")
	private WebElement priceTF;
	
	@FindBy(xpath="//input[@id='photo'])[2]")
	private WebElement PhotoButton;
	
	@FindBy(xpath="//button[@name='add']")
	private WebElement saveButton;
	
	@FindBy(xpath="//html/body/p")
	private WebElement descriptionTextArea;
	
	@FindBy(xpath ="//iframe[@title='Rich Text Editor, editor']")
	private WebElement descriptionFrame;
	
	//Initialization
	public AddNewCoursePage(WebDriverUnity driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setName(String courseName) {
		nameTF.sendKeys(courseName);
	}
	
	public void selectCategory(WebDriver web, String category) {
	 web.handleDropDown(category, categoryDropdown);
	
	}
	public void setPrice(String price) {
		priceTF.sendKeys(price);
	}
	
	public void uploadphpto(String photoPath) {
		PhotoButton.sendKeys(photoPath);
	}
	public void setDescription(WebDriver web, String text) {
		 web.switchBackFrame(descriptionFrame);
		descriptionTextArea.sendKeys(text);
		web.switchBackFrame();
	}
	public void clickSaveButton() {
		saveButton.click();
	
		
	}
}
