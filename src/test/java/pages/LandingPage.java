package pages;
import base.Base;
public class LandingPage extends Base{
	    
private static final String landingPageLogingMenu = "//a[@href='elogin.php']";
 public  void clickLoginMenu() {
	 click(landingPageLogingMenu);
 }
}
