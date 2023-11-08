package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomPages.AddNewCategoryPage;
import pomPages.AddNewCoursePage;
import pomPages.AddNewUserPage;
import pomPages.AdminHomePage;
import pomPages.CategoryPage;
import pomPages.CourseListPage;
import pomPages.Loginpage;
import pomPages.UsersPage;
import pomPages.WelcomePage;

public class BaseClass<JavaUtility, ExcelUtility, propertiesUtility> {

	//@BeforeSuite
	//@BeforeTest
	
	
	public static final String sjutil = null;
	protected propertiesUtility property;
	protected ExcelUtility excel;
	protected JavaUtility jutil;
	protected WebDriverUnity WebUtil;
	protected WebDriverUnity driver;
	private Object ConstantPath;
	
	public static WebDriver sdriver;
	public static JavaUtility sjutil;
	public static Object sjutil;
	
	protected WelcomePage welcome;
	protected Loginpage Login;
	protected AdminHomePage home;
	protected UsersPage users;
	protected CourseListPage course;
	protected CategoryPage category;
	protected AddNewUserPage addauser;
	protected AddNewCoursePage addCourse;
	protected AddNewCategoryPage addCategory;
	
	@BeforeClass
	public void classConfig(WebDriverUnity webUtility) {
		property =new propertiesUtility();
		excel = new ExcelUtility();
		jutil =new JavaUtility();
		 webUtility = new WebDriverUnity();
		
		property.propertiesInitiazation(ConstantPath.PROPERTIES_PATH);
		driver=WebUtil.lounchBrowser( property.readFromProperties("broswer"));
		
		sdriver driver;
		sjutil = jutil;
	}
	@BeforeMethod
	public void methodConfig() {
		excel.excelInitialization(IConstantPath.EXCEL_PATH);
		
		welcome = new WelcomePage(driver);
		Login = new Loginpage(driver);
		home = new AdminHomePage(driver);
		users = new UsersPage(driver);
		category = new CategoryPage(driver);
		 AddUser = new AddNewUserPage(driver);
		addCourse = new AddNewCoursePage(driver);
		addCategory = new AddNewCategoryPage(driver);
		
		WebUtil .navigateToApp(property.redFromProperties("url"));
		Assert.assertEquals(welcome.getLogo(), "SkillRary-ECommerce");
		
		
		long time = Long.parseLong(property.redFromProperties("timeouts"));
		WebUtil.waitTillElementFound(time);
		
		welcome.ClickLoginButton();
		Assert.assertEquals(Login.getPageHeader(),"Login");
		
		
		
		Login.setEmail(property.readFromproperties("username"));
		Login.setpassword(property.readFromproperties("password"));
		Login.clickLogin();
				
		Assert.assertEquals(home, getAdminIcon(), "SkillRary");
		
		
	}
	private Object getAdminIcon() {
		// TODO Auto-generated method stub
		return null;
	}
	@AfterMethod
	public void methodTeardown() {
		excel.closeExcel();
		home.singOutofApp();
	}
	@AfterClass
	public void classTeardown() {
		WebUtil.closeAllWindow();
	}
	//@AfterTest
	//@AfterSuite
}
