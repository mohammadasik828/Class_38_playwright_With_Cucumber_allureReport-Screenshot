package stepDefinition;

import java.io.ByteArrayInputStream;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import com.microsoft.playwright.BrowserType.LaunchOptions;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
public class Hooks extends Base {
    @Before
    public static void startUp() {
        String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
        playwright = Playwright.create();
        ArrayList<String> arguments = new ArrayList<>();
        arguments.add("--start-maximized");
        LaunchOptions launchOptions;
        launchOptions = new LaunchOptions().setHeadless(false).setArgs(arguments)
                .setExecutablePath(Paths.get(chromePath));
        browser = playwright.chromium().launch(launchOptions);
        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
        page = context.newPage();
    }
    @After
    public static void close(Scenario scenario) {
			try {
				String screenshotName = scenario.getName().replace("", "");
				if (scenario.isFailed()) {
					scenario.log("this is my failure message");
					byte[] screenshot = page.screenshot(new Page.ScreenshotOptions().setFullPage(true));
					scenario.attach(screenshot, "image/png", screenshotName);
				}
			} catch ( Exception e){
				e.printStackTrace();
			}
		}

	}