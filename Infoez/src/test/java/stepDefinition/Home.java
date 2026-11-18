package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.HomeClass;

public class Home extends BaseClass {
	String homeUrl;
	String SearchInput;
	String CityInput;
	HomeClass HC = new HomeClass(driver);
	@Given("user is on the landing page and click sigin for verify the Search Functions")
	public void user_is_on_the_landing_page_and_click_sigin_for_verify_the_search_functions() {
		url("https://d2mojgetgp5xie.cloudfront.net/");
		 visibilitywait(HC.signin);
		 click(HC.signin);
	}

	@Given("User click the customer login credentials and click the sign in button")
	public void user_click_the_customer_login_credentials_and_click_the_sign_in_button() {
		visibilitywait(HC.Customeridpassword);
		click(HC.Customeridpassword);
	    click(HC.loginbtn);
	}

	@When("User enters the valid {string} on the search field")
	public void user_enters_the_valid_on_the_search_field(String string) {
		homeUrl = getCurrentURL();
		   sendKeys(HC.searchField, string);
		   SearchInput = string;
		   Assert.assertTrue(isEnabled(HC.searchField));
	}

	@When("User click the search button")
	public void user_click_the_search_button() {
		click(HC.searchButton);
	}
	
	@Then("user should see the name {string}")
	public void user_should_see_the_name(String string) {
		  if(string.contains("Related results shown")) {
		    	visibilitywait(HC.Descriptionn);
		    	Assert.assertTrue(getText(HC.Descriptionn).contains(SearchInput.toLowerCase()));
		    }
		    else if(string.contains("No business found")){
		    	visibilitywait(HC.NoBusinessFoundMessage);
		    	Assert.assertTrue(HC.NoBusinessFoundMessage.isDisplayed());
		    }
		    else {
		    	Assert.assertEquals(homeUrl,getCurrentURL());
		    }
	}
	@When("User enter the valid {string} name on the search field")
	public void user_enter_the_valid_name_on_the_search_field(String string) {
		homeUrl = getCurrentURL();
	    sendKeys(HC.searchCityField,string);
	    CityInput = string;
	    Assert.assertTrue(isEnabled(HC.searchCityField));
	}

	@When("User click the city search button")
	public void user_click_the_city_search_button() {
		 click(HC.searchButton);
	}

	@Then("user should see the city {string}")
	public void user_should_see_the_city(String string) {
		if(string.contains("Matching")) {
			MultipleElementsVisibility(HC.citiesResult);
			for(WebElement i : HC.citiesResult) {
				String city = getText(i).toLowerCase();
				Assert.assertTrue(city.contains(CityInput.toLowerCase()));
			}
		}
		else if(string.contains("No business found")){
			visibilitywait(HC.NoBusinessFoundMessage);
	    	Assert.assertTrue(HC.NoBusinessFoundMessage.isDisplayed());
		}
		else {
			Assert.assertEquals(homeUrl,getCurrentURL());
		}}
	

}
