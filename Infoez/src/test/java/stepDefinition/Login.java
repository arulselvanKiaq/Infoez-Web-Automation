package stepDefinition;

import org.junit.Assert;

import base.BaseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.LoginClass;

public class Login extends BaseClass{
	String EmailValueExpected;
	String PasswordValueExpected;
	
	LoginClass LC = new LoginClass(driver);
	
	@When("User is on the login page")
	public void user_is_on_the_login_page() {
	   url("https://d2mojgetgp5xie.cloudfront.net/login");
	}
	@When("User enters the valid {string}")
	public void user_enters_the_valid(String string) {
		EmailValueExpected = string;
		sendKeys(LC.email, string);
	}

	@Then("Email should be entered on Email field")
	public void email_should_be_entered_on_email_field() {
		String emailValueActual = getAttribute(LC.email,"value");
		Assert.assertEquals(EmailValueExpected,emailValueActual);
	}
	@When("User enter the valid {string}")
	public void user_enter_the_valid(String string) {
		PasswordValueExpected = string;
		sendKeys(LC.password, string);
	}
	@Then("Password should be entered on Password field")
	public void password_should_be_entered_on_password_field() {
		String passwordActual = getAttribute(LC.password,"value");
		Assert.assertEquals(PasswordValueExpected,passwordActual);
	}
	@When("User clicks the sign in button")
	public void user_clicks_the_sign_in_button() {
	    click(LC.signinClick);
	}
	@Then("user should see the {string}")
	public void user_should_see_the(String string) {
	    if(string.contains("Success")) {
	    	visibilitywait(LC.profilemenu);
	    	Assert.assertTrue(LC.profilemenu.isDisplayed());
	    }
	    else {
	    	visibilitywait(LC.InvalidMessage);
	    	Assert.assertTrue(LC.InvalidMessage.isDisplayed());
	    }
	}
}