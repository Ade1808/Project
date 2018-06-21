package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import testBase.TestBase;
import testUtil.TestUtil;



public class HomePage extends TestBase {
	@FindBy(xpath="//a[contains(text(),'About')]")
	WebElement about;
	
	@FindBy(xpath="//a[contains(text(),'Work')]")
	WebElement work;
	
	
	@FindBy(xpath="//a[contains(text(),'Services')]")
	WebElement services;
	
	@FindBy(xpath="//a[contains(text(),'Latest news')]")
	WebElement latestnews;
	
	
	
	// Initialise the page Object 

	
	
			public HomePage() {
				
				PageFactory.initElements(driver, this);
				
			}
			
			
			// Actions of the Page
			
			
			
			public String verifyHomePageTitle() {
				
				return driver.getTitle();
							
			}
			public boolean verifyLatestNews() {
				
				return latestnews.isDisplayed();
				
			}
			
			public AboutPage ClickOnAboutLink() {
			
			about.click();
			return new  AboutPage();
			
			
		}
		
			public ServicesPage ClickOnServicesLink() {
				
				services.click();
				return new  ServicesPage();
				
			
		}
			
			public WorkPage ClickOnWorkLink() {
				
				work.click();
				return new  WorkPage();
				
	
}
			public ContactPage ClickOnContactLink() {
				
				work.click();
				return new  ContactPage();
			
}
}
	