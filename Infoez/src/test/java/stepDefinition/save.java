package stepDefinition;

import org.junit.Assert;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.ExploreSaveClass;
import pom.LoginClass;

public class save extends BaseClass{
	String expectedBusinessName;
	LoginClass LC = new LoginClass(driver);
	ExploreSaveClass ES = new ExploreSaveClass(driver);
	
	@When("User logged into the application for save and unsave the business")
	public void user_logged_into_the_application_for_save_and_unsave_the_business() {
		url("https://d2mojgetgp5xie.cloudfront.net/login");
		sendKeys(LC.email, "customer@infoez.com");
		sendKeys(LC.password, "Customer@123");
		click(LC.signinClick);
	}

	@Then("User should be logged in successfully for verify the save and unsave the business")
	public void user_should_be_logged_in_successfully_for_verify_the_save_and_unsave_the_business() {
		visibilitywait(LC.profilemenu);
		Assert.assertTrue(LC.profilemenu.isDisplayed());
	}

	@When("User opens the explore page and user clicks on a business image")
	public void user_opens_the_explore_page_and_user_clicks_on_a_business_image() {
		elementToBeclick(ES.exploreNavigation);
		click(ES.exploreNavigation);
		visibilitywait(ES.expectedBuisnessName);
		expectedBusinessName = getText(ES.expectedBuisnessName);
		elementToBeclick(ES.resultImage);
		click(ES.resultImage);
	}

	@Then("Business details page should be displayed")
	public void business_details_page_should_be_displayed() {
		visibilitywait(ES.actualBusinessName);
		Assert.assertEquals(expectedBusinessName, getText(ES.actualBusinessName));
	}

	@When("User click the save icon")
	public void user_click_the_save_icon() {
		try {
			elementToBeclick(ES.saveButton);
			click(ES.saveButton);
		}
		catch(Exception e) {
			System.err.println("Business is already saved");
		}
	}

	@Then("Business should be saved successfully")
	public void business_should_be_saved_successfully() {
		try {
			visibilitywait(ES.saveSuccessMessage);
			Assert.assertTrue(ES.saveSuccessMessage.isDisplayed());
		}
		catch(Exception e) {
			System.err.println("Business is already saved");
		}
	}

	@When("User clicks the save icon again")
	public void user_clicks_the_save_icon_again() {
		if (ES.savedButton.isDisplayed()) {
			click(ES.savedButton);
		} else {
			System.out.println("Business is already unsaved");
		}
	}

	@Then("Business should be removed from saved items")
	public void business_should_be_removed_from_saved_items() {
		visibilitywait(ES.unSaveSuccessMessage);
		Assert.assertTrue("Business was not removed from saved list", ES.unSaveSuccessMessage.isDisplayed());
	}



}
