package pages;

import base.Base;

public class EmployeeLoginPage extends Base {
	private static final String menuEmpLoging = "//a[@href='elogin.php']";
	private static final String empUserId = "//input[@name='mailuid']";
	private static final String empUserPass = "//input[@name='pwd']";
	private static final String empLogingButton = "//input[@name='login-submit']";

	public void menuEmpLoging() {
		click(menuEmpLoging);
	}

	public void empUserId() {
		fill(empUserId, "testpilot@gmail.com");
	}

	public void empUserPass() {
		fill(empUserPass, "1234");
	}

	public void empLogingButton() {
		click(empLogingButton);
	}
}
