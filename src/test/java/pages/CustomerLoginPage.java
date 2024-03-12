package pages;

import base.Base;

public class CustomerLoginPage extends Base {
	private static final String menuCustomerLoging = "text=Customer Login";
	private static final String customerUserId = "//input[@name='mailuid']";
	private static final String customerUserPass = "//input[@name='pwd']";
	private static final String customerLoginButton = "//input[@name='login-submit']";

	public void menuCustomerLoging() {
		click(menuCustomerLoging);
	}

	public void customerUserId() {
		fill(customerUserId, "david@gmail.com");
	}

	public void customerUserPass() {
		fill(customerUserPass, "1234");
	}

	public void customerLoginButton() {
		click(customerLoginButton);
	}
}
