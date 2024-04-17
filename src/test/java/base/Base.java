package base;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.ScreenshotOptions;
import com.microsoft.playwright.Playwright;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Base {
	public static Playwright playwright;
	public static Browser browser;
	public static Page page;

	public static String innerText(String xpath) {
		String s = page.locator(xpath).innerText();
		return s;
	}

	public static void fill(String xpath, String value) {
		page.locator(xpath).fill(value);
	}

	public static void navigate(String url) {
		page.navigate(url);
	}

	public static void click(String xpath) {
		page.locator(xpath).click();
	}

	public static void selectOption(String xpath, String value) {
		page.selectOption(xpath, value);
	}

	public static void assertion(String xpath, String text) {
		assertThat(page.locator(xpath)).hasText(text);
	}

	public static int generateNumber() {
		return (int) (Math.random() * 1000000);
	}

	public static void generateScheenshot(String filename) {
		ScreenshotOptions ssOptions = new ScreenshotOptions();
		page.screenshot(ssOptions.setPath(Paths.get(filename)));
	}

	public static void test() {
		System.out.println("New Line Add");
	}
}