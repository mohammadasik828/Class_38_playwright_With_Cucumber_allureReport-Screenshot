package pages;

import base.Base;

public class CreateOrderPage extends Base {
	private static final String orderPrdMenu = "text=Order Product";
	private static final String selectProdName = "//select[@name='prodId']";
	private static final String inputOrdDate = "//input[@name='ordDate']";
	private static final String ordSubmitButton = "//button[@type='submit']";

	public void orderPrdMenu() {
		click(orderPrdMenu);
	}

	public void selectProdName() {
		selectOption(selectProdName, "Camera");
	}

	public void inputOrdDate() {
		fill(inputOrdDate, "11/21/2023");
	}

	public void ordSubmitButton() {
		click(ordSubmitButton);
	}
}
