package Pages;

import org.junit.Assert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class WorkPage extends TestBase {
	
	@FindBy(xpath="//a[contains(text(),'Work')]")
	WebElement works;
	
	
	
	
	
	// Initialise the page Object 

	
	
			public void HomePage() {
				
				PageFactory.initElements(driver, this);
				
			}
			
			
			// Actions of the Page
			
			
			
			public String verifyWorkPageTitle() {
				
				String pagename =  driver.getTitle();
				
				Assert.assertEquals("Work", pagename);
				return pagename;
							
			
			}

}
