package stepdefinition;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.testproject.pages.AuthenticationPage;
import com.testproject.pages.HomePage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	
	public static WebDriver driver;	
	//private String baseURL="http://automationpractice.com/index.php";

	HomePage homePage;
	AuthenticationPage authenticationPage;
	

	@Given("^User is on AuthenticationPage$")
	public void user_is_on_AuthenticationPage() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chent\\workspace\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("chrome.switches", "--disable-extensions");
		driver = new ChromeDriver(options);
		
		homePage=new HomePage(driver);
		homePage.navigatetoAuthenticationPage();
		Thread.sleep(5000);
		
		
	    
	}

	@When("^User enters his valid credentials$")
	public void user_enters_his_valid_credentials() throws Exception {
		authenticationPage.setCreateAccountEmailAddress("chen44@gmail.com");
		
	    
	    
	}

	@When("^clicks create an account button$")
	public void clicks_create_an_account_button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		authenticationPage.navigateToCreateAccountPage();
	}

	@Then("^User is directed to CreateAccount Page$")
	public void user_is_directed_to_CreateAccount_Page() throws Exception {
	    System.out.println("User in CreateAccount Page");
	    
	}
	
	
	
	
	@Given("^I am on a new user registration page$")
	public void i_am_on_a_new_user_registration_page() throws Exception {
	 System.out.println("i am on registration page");
	}
	    

	@When("^I enter valid data on the page$")
	public void i_enter_valid_data_on_the_page(DataTable table) throws Exception {
		System.out.println("Entering datatable values");
	    List<List<String>> data=table.raw();
	    Iterator<List<String>> it = data.iterator();
	    while(it.hasNext()){
	    System.out.println(it.next().get(1));
	    }
	   
	}

	@Then("^the user registration should be successful$")
	public void the_user_registration_should_be_successful() throws Exception {
		System.out.println("successfully registered");
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	
		
		
		
	
	
	
}
