package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerClass {
	WebDriver driver;
	public registerClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//button[@data-testid='header-signin-btn']")
	public WebElement signin;
	@FindBy(xpath = "//button[@data-testid='login-submit-btn']")
	public WebElement loginbtn;
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/form/p/a")
	public WebElement createone;
	@FindBy(xpath = "//button[@data-testid='quick-customer']")
	public WebElement Customeridpassword;
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/form/div[2]/input")
	public WebElement fullName;
	@FindBy(xpath = "//input[@type='email']")
	public WebElement email;
	@FindBy(xpath = "//input[@data-testid='register-phone']")
	public WebElement phone;
	@FindBy(xpath="//input[@type='password']")
	public WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	public WebElement submit;
	@FindBy(xpath="//div[text()='Welcome to Infoez']")
	public WebElement successfulMessage;
	@FindBy(xpath="//*[@id=\"root\"]/div/main/div/div/h1")
	public WebElement NotCreated;
}
