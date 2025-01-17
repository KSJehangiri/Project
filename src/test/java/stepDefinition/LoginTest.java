package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Base;

public class LoginTest extends Base {
	
	

	@Given("I open chrome browser")
	public void i_open_chrome_browser() {
		openBrowser();
	    
	}
	@Given("I visit the environment")
	public void i_visit_the_environment() {
   driver.get("https://login.salesforce.com");
}
	    
	@Given("I enter username")
	public void i_enter_username() {
		driver.findElement(By.id("username")).sendKeys("batch09@codegator.us");   
	}
	@Given("I enter password")
	public void i_enter_password() {
	driver.findElement(By.id("password")).sendKeys("Welcome3");
			
	}
	    
	@When("I click the login button")
	public void i_click_the_login_button() {
		driver.findElement(By.id("Login")).click();
	}
	@Then("I should see the home page")
	public void i_should_see_the_home_page() {
    boolean present =	driver.findElement(By.cssSelector("a[title='Home Tab']")).isDisplayed();
    Assert.assertTrue(present);	
	    	}

}
