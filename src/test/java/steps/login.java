package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {

	@Given("i launch fb application")
	public void i_launch_fb_application() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("i launch fb application");
	}

	@Given("click on login")
	public void click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("click on login");
	}

	@When("enter {string} user name")
	public void enter_user_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("enter "+string+" username");
	}

	@When("enter {string} password")
	public void enter_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("enter "+string+" password");
	}

	@When("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("click on login button");
	}

	@Then("user {string} able to login successfully")
	public void user_able_to_login_successfully(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user "+string+" able to login successfully");
	}


}
