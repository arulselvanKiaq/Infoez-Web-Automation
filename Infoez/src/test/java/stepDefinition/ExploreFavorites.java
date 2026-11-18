package stepDefinition;



import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.ExploreFavoritesClass;

public class ExploreFavorites extends BaseClass {
	 String ActualMessage;
	 String ExpectedMessage;
	 String ActualName;
	 String ExpectedName;
	 
	ExploreFavoritesClass EF = new ExploreFavoritesClass(driver);
	@When("user is on the landing page and click sigin for verify the Favorites")
	public void user_is_on_the_landing_page_and_click_sigin_for_verify_the_favorites() {
		 url("https://d2mojgetgp5xie.cloudfront.net/");
		 visibilitywait(EF.signin);
		 click(EF.signin);
	}

	@When("User click the customer login credentials and click sign in")
	public void user_click_the_customer_login_credentials_and_click_sign_in() {
		visibilitywait(EF.Customeridpassword);
		click(EF.Customeridpassword);
	    click(EF.loginbtn);
	}

	@When("User click the Explore module")
	public void user_click_the_explore_module() {
		wait.until(ExpectedConditions.invisibilityOf(EF.WelcomeToastMessage));
		visibilitywait(EF.Explore);
		click(EF.Explore);
		
	}

	@When("user select the Favorites")
	public void user_select_the_favorites() {
		//ScrollUp();
		visibilitywait(EF.FavoritesIcon);
	   click(EF.FavoritesIcon);
	}

	@Then("user should see the Added to favorites Toast message")
	public void user_should_see_the_added_to_favorites_toast_message() {
		
		visibilitywait(EF.AddedToastMessage);
		   String ActualMessage = EF.AddedToastMessage.getText().trim();
		   String ExpectedMessage = "Added to favorites";
		   Assert.assertEquals(ExpectedMessage, ActualMessage);
	}

	@When("user unselect the Favorites")
	public void user_unselect_the_favorites() {
		 click(EF.FavoritesIcon);
	}

	@Then("user should see the removed from favorites Toast message")
	public void user_should_see_the_removed_from_favorites_toast_message() {
		visibilitywait(EF.RemovedToastMessage);
		   String ActualMessage = EF.RemovedToastMessage.getText().trim();
		   String ExpectedMessage = "Removed from favorites";
		   Assert.assertEquals(ExpectedMessage, ActualMessage);
	}
	
	
	
	
	@When("user again select the favorites")
	public void user_again_select_the_favorites() {
		visibilitywait(EF.FavoritesIcon);
		   click(EF.FavoritesIcon);
	}

	@When("user click the Profile menu and click favorites")
	public void user_click_the_profile_menu_and_click_favorites() {
        
		
        invisibilitywait(EF.AddedToastMessage);
		visibilitywait(EF.ProfileMenu);
		elementToBeclick(EF.ProfileMenu);
		click(EF.ProfileMenu);
		visibilitywait(EF.FavoritesSection);
		elementToBeclick(EF.FavoritesSection);
		click(EF.FavoritesSection);
	   
	}

	@Then("user should see the selected favorites result")
	public void user_should_see_the_selected_favorites_result() {
		visibilitywait(EF.BusinessName);
	    String ActualName= EF.BusinessName.getText().trim();
	    String ExpectedName ="Mira Studio";
	    Assert.assertEquals(ExpectedName,ActualName);
	    System.out.println("Mira studio successfully verified in favorites list");
	}


}
