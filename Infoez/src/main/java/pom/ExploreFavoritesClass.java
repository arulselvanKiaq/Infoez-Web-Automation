package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExploreFavoritesClass {
	WebDriver driver;
	public ExploreFavoritesClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//button[@data-testid='header-signin-btn']")
	public WebElement signin;
	@FindBy(xpath = "//button[@data-testid='login-submit-btn']")
	public WebElement loginbtn;
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[2]/div[2]/button[3]")
	public WebElement Customeridpassword;
	@FindBy(xpath ="//*[@id=\"root\"]/div/header/div/nav/a[1]")
	public WebElement Explore;
	@FindBy(xpath ="//*[@id=\"root\"]/div/section/ol/li/div[2]/div")
	public WebElement WelcomeToastMessage;
	@FindBy(xpath = "//button[starts-with(@data-testid,'favorite-toggle-btn-')]")
	public WebElement FavoritesIcon;
	@FindBy(xpath ="//div[text()='Added to favorites']")
	public WebElement AddedToastMessage;
	@FindBy(xpath ="//div[text()='Removed from favorites']")
	public WebElement RemovedToastMessage;
	@FindBy(xpath ="//button[@data-testid='user-menu-btn']")
	public WebElement ProfileMenu;
	@FindBy(xpath ="//button[@data-testid='menu-favorites']")
	public WebElement FavoritesSection;
	@FindBy(xpath ="//h3[normalize-space()='Mira Studio']")
	public WebElement BusinessName;
}
