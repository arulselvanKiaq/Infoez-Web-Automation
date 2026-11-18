package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExploreSaveClass {
	public WebDriver driver;
	public ExploreSaveClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@data-testid='nav-explore']")
	public WebElement exploreNavigation;
	@FindBy(xpath="(//button[@aria-label='Toggle favorite']/parent::div/following-sibling::div//h3)[1]")
	public WebElement expectedBuisnessName;
	@FindBy(xpath="//h1[@data-testid='business-name']")
	public WebElement actualBusinessName;
	@FindBy(xpath="//button[text()='Save']")
	public WebElement saveButton;
	@FindBy(xpath="//button[text()='Saved']")
	public WebElement savedButton;
	@FindBy(xpath="//*[text()='Saved to favorites']")
	public WebElement saveSuccessMessage;
	@FindBy(xpath="//*[text()='Removed from favorites']")
	public WebElement unSaveSuccessMessage;
	@FindBy(xpath="(//button[@aria-label='Toggle favorite']/parent::div/parent::a)[1]")
	public WebElement resultImage;
}
