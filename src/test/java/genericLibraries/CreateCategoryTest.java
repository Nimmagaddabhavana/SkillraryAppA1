package TestScripts;

//this the create Category test

	package genericLibraries;

	import java.util.Map;

	import org.testng.asserts.SoftAssert;

	public class CreateCategoryTest extends BaseClass {
		
		public void createCategoryTest() {
			SoftAssert soft = new SoftAssert();
			home.clickCoursesTab();
			home.clickCategoryLink();
			soft.assertTrue(category.getPageHeader().contains("Category"));
			
			
			category.clickNewBitton();
			Thread.sleep(3000);
			soft.assertEquals(addCategory.getPageHeader(), "Add New Category");
			Map<String, String> map =  excel.readFromExcel("sheet1", "Add category");
			String categoryName = map.get("Name")+jutil.generateRendomNum(100);
			addCategory.setName(categoryName);
			addCategory.clickSave();
			
			soft.assertTrue(category.getSuccessMessege().contains("Success"));
			boolean isPresent = false;
			List<webElement> categoryList = category.getCategoryList();
			for (WebElement e : categoryList) {
				if(e.Text())
			}
			
			soft.assertTrue(isPresent);
			
			
			category.clickDeleteButton(categoryName, driver);
			category.clickDelete();
			soft.assertTrue(category.getSuccessMessege().contains("Success"));
			soft.assertAll();
		}
		
		

	}

