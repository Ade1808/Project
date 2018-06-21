package TestCases;

import org.testng.Assert;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import Pages.AboutPage;
import Pages.ContactPage;
import Pages.HomePage;
import Pages.ServicesPage;
import Pages.WorkPage;
import testBase.TestBase;
import testUtil.TestUtil;



public class HomePageTestCases {
	
	public class HomePageTest extends TestBase {
		HomePage homePage;
		TestUtil testUtil;
		AboutPage aboutpage;
		ContactPage contactpage;
		WorkPage workpage;
		ServicesPage servicespage;
		
		

		
	public HomePageTest() {
			
			super();
			
	}
	 
		@BeforeMethod
		public void setUp() throws InterruptedException{
		initialization();
		
		aboutpage = new AboutPage();
		workpage = new WorkPage();
		servicespage = new ServicesPage();
		contactpage = new ContactPage();

}
		
		@Test(priority =1)
		public void verifyHomePageTitleTest() {
			
			String hometitle = homePage.verifyHomePageTitle();
			Assert.assertEquals(hometitle, "Where Experiences are Engineered - Valtech", "Title is not Matched");
	}
		
		@Test(priority =2)
		public void verifyClickOnAboutLinkTest() {
			aboutpage= homePage.ClickOnAboutLink();
		}
		
		@Test(priority =3)
		public void verifyClickOnContactLinkTest() {
			contactpage= homePage.ClickOnContactLink();
			
		}
		
		@Test(priority =4)
		public void verifyClickOnWorkLinkTest() {
			workpage= homePage.ClickOnWorkLink();
			
		}
		
		@Test(priority =5)
		public void verifyClickOnServicesLinkTest() {
			servicespage= homePage.ClickOnServicesLink();
			
		}
		
		@AfterTest
		public void Close() {
			
			driver.quit();
		}
}
}


