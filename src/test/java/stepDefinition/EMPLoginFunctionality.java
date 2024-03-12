package stepDefinition;

import org.testng.Assert;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.EmployeeLoginPage;

public class EMPLoginFunctionality extends Base{
	EmployeeLoginPage employeeLoginPage = new EmployeeLoginPage();
	@And("I click on EMP Login")
	public void i_click_on_emp_login() {
		employeeLoginPage.menuEmpLoging();
	}
	@Then("Enter user Id")
	public void enter_user_id() {
		employeeLoginPage.empUserId();
	}
	@And("Enter user Pass")
	public void enter_user_pass() {employeeLoginPage.empUserPass();}
	@And("I click on EMP Login Button") public void i_click_on_emp_login_button() {employeeLoginPage.empLogingButton();}
	@Then("verify EMP Id")
	public void verify_emp_id() {
		String employeeId = innerText("//h2[1]");
		Assert.assertEquals(employeeId, "Employee Id: 102");
		System.out.println(employeeId);
	}
	@And("verify EMP Home page Slogan")
	public void verify_emp_home_page_slogan() {
		String welcomeTest = page.textContent("//h2[@style='text-align:center;']");
		Assert.assertEquals(welcomeTest, "Welcome Test ");
		System.out.println(welcomeTest);
	}

}
