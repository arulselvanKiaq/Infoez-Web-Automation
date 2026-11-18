package stepDefinition;

import org.junit.Assert;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.registerClass;

public class Register extends BaseClass{
	String FullNameValueExpected;
	String EmailValueExpected;
	String PhoneValueExpected;
	String PasswordValueExpected;
	
	registerClass RC = new registerClass(driver);
	
	@Given("user launches the Register page Application URL")
	public void user_launches_the_register_page_application_url() {
	    url("https://d2mojgetgp5xie.cloudfront.net/");
	}

	@Given("user click the sigin button")
	public void user_click_the_sigin_button() {
		visibilitywait(RC.signin);
	   click(RC.signin);
	}

	@Given("user click the create one link")
	public void user_click_the_create_one_link() {
		visibilitywait(RC.createone);
	    click(RC.createone);
	}

	@When("user enters Full name {string}")
	public void user_enters_full_name(String string) {
		visibilitywait(RC.fullName);
		FullNameValueExpected = string;
		sendKeys(RC.fullName, string);
	}

	@When("user enters Email {string}")
	public void user_enters_email(String string) {
		visibilitywait(RC.email);
		EmailValueExpected = string;
		sendKeys(RC.email, string);
	}

	@When("user enters Phone {string}")
	public void user_enters_phone(String string) {
		visibilitywait(RC.phone);
		PhoneValueExpected = string;
		sendKeys(RC.phone, string);
	}

	@When("user enters Password {string}")
	public void user_enters_password(String string) {
		visibilitywait(RC.password);
		PasswordValueExpected = string;
		sendKeys(RC.password, string);
	}

	@When("user click the create account button")
	public void user_click_the_create_account_button() {
		visibilitywait(RC.submit);
	   click(RC.submit);
	}

	@Then("user should see {string}")
	public void user_should_see(String string) {
		 if(string.contains("Success")) {
		    	visibilitywait(RC.successfulMessage);
		    	Assert.assertTrue(RC.successfulMessage.isDisplayed());
		    }
		    else {
		    	visibilitywait(RC.NotCreated);
		    	Assert.assertTrue(RC.NotCreated.isDisplayed());
		    }
		}
	
}
