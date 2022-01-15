package pagemodelTests;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pagemodeldemo.HomePage;
import pagemodeldemo.SignInPage;

public class HomePageDemo {

	WebDriver driver;
	String url="http://automationpractice.com/";

	@BeforeClass()
	public void init() throws IOException {

		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	@AfterClass()
	public void tearDown() throws IOException {

		driver.quit();
		System.out.println("End of Testing "+new Date());
	}

	@Test
	public void testCaseforHomePage() {

		driver.get(url);
		
		HomePage homepage = new HomePage(driver);

		homepage.searchForText("Shirt");

	}
	
	
	@Test
	public void testCaseforSignInPage() {

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		SignInPage signInpage = new SignInPage(driver);

		signInpage.LoginWithUserIdAndPassword("hello@gmail.com", "testPassword");

	}
}
