package hooks;

import org.openqa.selenium.WebDriver;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
	public static WebDriver driver;
	@Before
	public static void start() {
		chromeOption();
	}
	@After
	public static void tearDown() {
		close();
	}
}