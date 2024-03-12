package stepDefinition;

import base.Base;
import io.cucumber.java.en.Then;
import pages.CreateOrderPage;

public class CustomerLoginOrderFunctionality extends Base{
	
	CreateOrderPage createOrderPage = new CreateOrderPage();
	@Then("I Click Customer Product Menu")
	public void i_click_customer_product_menu() {
		createOrderPage.orderPrdMenu();
	}
	@Then("Select Product Name")
	public void select_product_name() {
		createOrderPage.selectProdName();
	}
	@Then("Input Order Date")
	public void input_order_date() {
		createOrderPage.inputOrdDate();
	}
	@Then("I Click Order Submit Button") public void i_click_order_submit_button() {createOrderPage.ordSubmitButton();}


}
