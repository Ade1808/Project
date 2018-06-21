package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage;
import testBase.TestBase;
import testUtil.TestUtil;



public class HomePageTestCases {
	
	public class HomePageTest extends TestBase {
		HomePage homePage;
		TestUtil testUtil;
		

		
	public HomePageTest() {
			
			super();
			
	}
	 
		@BeforeMethod
		public void setUp() throws InterruptedException{
		initialization();
		

}
		
		@Test(priority =1)
		public void verifyHomePageTitleTest() {
			
			String hometitle = homePage.verifyHomePageTitle();
			Assert.assertEquals(hometitle, "Where Experiences are Engineered - Valtech", "Title is not Matched");
	}
		
		@Test(priority =2)
		public void verifyClickOnAboutLinkTest() {
			AboutPage= homePage.ClickOnAboutLink();
		}
		
		@Test(priority =3)
		public void verifyClickOnContactLinkTest() {
			ContactPage= homePage.ClickOnContactLink();
			
		}
		
		@Test(priority =4)
		public void verifyClickOnWorkLinkTest() {
			WorkPage= homePage.ClickOnWorkLink()
			
		}
		
		@Test(priority =5)
		public void verifyClickOnServicesLinkTest() {
			ServicesPage= homePage.ClickOnServicesLink()
			
		}
		
		@AfterTest
		public void Close() {
			
			driver.quit();
		}
}
}


