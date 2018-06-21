package testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import testUtil.TestUtil;



public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	
	
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\LearnJava\\Practise\\ValtechWebsite\\src\\main\\java\\Config\\config.properties");
			prop.load(ip);
			}catch (FileNotFoundException e) {
			e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	public static  void initialization() throws InterruptedException {
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
			
		} else if(browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("IE")) {
			System.setProperty("webdriver.InternetExplorer.driver", "C:\\IEDriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITY_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		Thread.sleep(3000);
		
		
		

}
}
