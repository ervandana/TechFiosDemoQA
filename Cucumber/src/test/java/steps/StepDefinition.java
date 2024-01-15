package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestBase;

public class StepDefinition extends TestBase {
	
	@Before
	public void openLogin() {
		
		initDriver();
	}
	
	@Given("user is in DemoQA boostore login page")
	public void user_is_in_DemoQA_boostore_login_page() {
		
	}

	@When("user enters username {string}")
	public void user_enters_username(String string) {

	}

	@When("user enters password {string}")
	public void user_enters_password(String string) {

	}

	@When("clicks on login button")
	public void clicks_on_login_button() {

	}

	@Then("user should land on profile page")
	public void user_should_land_on_profile_page() {

	}
	
	
	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}
	
}
