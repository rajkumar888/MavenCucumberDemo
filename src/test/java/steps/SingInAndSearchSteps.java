package steps;

import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagemodeldemo.HomePage;
import pagemodeldemo.SignInPage;

public class SingInAndSearchSteps {
	
	WebDriver driver;
	HomePage homepage;
	SignInPage signInpage;
	
	@Before()
	public void init(){
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@After()
	public void teaDown(Scenario scenario){
		driver.quit();
		System.out.println("End of Testing "+new Date());
	}

	
	@Given("user has opened the search page")
	public void user_has_opened_the_search_page() {
	   driver.get("http://automationpractice.com/");
	}

	@When("user has entered the {string} for search and click on search button")
	public void user_has_entered_the_for_search_and_click_on_search_button(String searchtext) {
		homepage = new HomePage(driver);
		homepage.searchForText(searchtext);
	}

	@Then("the seach page should be displayed with result")
	public void the_seach_page_should_be_displayed_with_result() {
	   System.out.println("Search result is displayed....."); 
	}

	@Given("user has opened the singin page")
	public void user_has_opened_the_singin_page() {
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@When("user has entered the userid {string} and password as {string} and cliked on signin button")
	public void user_has_entered_the_userid_and_password_as_and_cliked_on_signin_button(String userid, String password) {
		signInpage = new SignInPage(driver);
		signInpage.LoginWithUserIdAndPassword(userid, password);
	}

	@Then("the home page is displayed")
	public void the_home_page_is_displayed() {
	    
	}

	
	
}
