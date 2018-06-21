package TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.AboutPage;
import Pages.ContactPage;
import Pages.HomePage;
import Pages.ServicesPage;
import Pages.WorkPage;
import testBase.TestBase;
import testUtil.TestUtil;

public class AboutTestCase  extends TestBase{
	
	HomePage homePage;
	TestUtil testUtil;
	AboutPage aboutpage;
	ContactPage contactpage;
	WorkPage workpage;
	ServicesPage servicespage;
	
	

	
public AboutTestCase() {
		
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
	public void verifyAboutPageTitleTest() {
		
		String hometitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(hometitle, "About", "Title is not Matched");
}	

}
