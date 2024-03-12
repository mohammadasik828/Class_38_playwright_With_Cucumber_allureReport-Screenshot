package stepDefinition;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CustomerLoginPage;
import pages.LandingPage;
public class CustomerLoginFunctionality extends Base{
	CustomerLoginPage customerLoginPage = new CustomerLoginPage();
	LandingPage landingpage = new LandingPage();
	@Given("I am in landing page") public void i_am_in_landing_page() {navigate("https://it.microtechlimited.com");}
	@When("I Click on Login menu") public void i_click_on_login_menu() {landingpage.clickLoginMenu();}
	@Then("Click on Customer Login") public void click_on_customer_login() {customerLoginPage.menuCustomerLoging();}
	@Then("Enter User Id")
	public void enter_user_id() {
		customerLoginPage.customerUserId();
	}
	@And("I Enter Password")
	public void i_enter_password() {
		customerLoginPage.customerUserPass();
	}
	@And("I Click on Login Button")
	public void i_click_on_login_button() {
		customerLoginPage.customerLoginButton();
	}
	@Then("Verify that I am in Home Page Slogan Welcome David")
	public void verify_that_i_am_in_home_page_slogan_welcome_david() {
		String welcomeMessage = innerText("//h2[2]");
		System.out.println(welcomeMessage);
		assertion("//*[@id='divimg']/div/h2[2]", "Welcome Davidd");
	}

}
