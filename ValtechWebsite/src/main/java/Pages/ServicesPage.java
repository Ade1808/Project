package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import testBase.TestBase;
import testUtil.TestUtil;


public class ServicesPage extends TestBase {
	
	
	@FindBy(xpath="//a[contains(text(),'Services')]")
	WebElement services;
	
	
	
	
	
	// Initialise the page Object 

	
	
			public void HomePage() {
				
				PageFactory.initElements(driver, this);
				
			}
			
			
			// Actions of the Page
			
			
			
			public String verifyServicesPageTitle() {
				
				String pagename =  driver.getTitle();
				
				Assert.assertEquals("Services", pagename);
				return pagename;
							
			
			}
			
			
		
				

}
