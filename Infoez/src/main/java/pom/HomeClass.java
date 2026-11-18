package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeClass {
	public WebDriver driver;
	public HomeClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//button[@data-testid='header-signin-btn']")
	public WebElement signin;
	@FindBy(xpath = "//button[@data-testid='login-submit-btn']")
	public WebElement loginbtn;
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[2]/div[2]/button[3]")
	public WebElement Customeridpassword;
	@FindBy(xpath="//input[@data-testid='hero-search-query']")
	public WebElement searchField;
	@FindBy(xpath="//button[@data-testid='hero-search-submit']")
	public WebElement searchButton;
	@FindBy(xpath="//div[@class='p-5 flex-1 flex flex-col']/p")
	public WebElement Descriptionn;
	@FindBy(xpath ="//h3[@class='mt-6 font-display font-semibold text-xl']")
	public WebElement NoBusinessFoundMessage;
	@FindBy(xpath="//input[@data-testid='hero-search-location']")
	public WebElement searchCityField;
	@FindBy(xpath="//span[@class='flex items-center gap-1']")
	public List<WebElement> citiesResult;
	@FindBy(xpath="//a[@data-testid='nav-explore']")
	public WebElement exploreNavigation;
}

