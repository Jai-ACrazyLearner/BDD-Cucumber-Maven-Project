package com.BrightTalk.Features.SeleniumSmokes;

import com.BrightTalk.WebdriverUtils;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class F003_BrightTalkLogin {


	@Given("^I am in home page$")
	public void I_am_in_home_page() throws Throwable {
		WebdriverUtils.assertVerifyPageSource("Join for free");
	}

	@When("^I click login 'button'$")
	public void I_click_login_button() throws Throwable {
		WebdriverUtils.Click("//html/body/div/div/div/div[3]/div/a/span");
	}

	@When("^I gave 'Email' - \"([^\"]*)\", 'password' - \"([^\"]*)\"$")
	public void I_gave_Email_password_(String email, String Password) throws Throwable {
		WebdriverUtils.SendkeysByID("user_login_email", email);
		WebdriverUtils.SendkeysByID("user_login_password", Password);	
	}

	@When("^I press loginbutton to 'logintoApp'$")
	public void I_press_loginbutton_to_logintoApp() throws Throwable {
		WebdriverUtils.Click("//html/body/div/div/div/div[3]/div[2]/form/div[2]/button");
	}
	@Then("^I should See \"([^\"]*)\"$")
	public void I_should_See(String arg1) throws Throwable {
		WebdriverUtils.assertVerifyPageSource("Welcome to BrightTALK. Get started by exploring BrightTALK for relevant videos and webinars. As you subscribe to channels this feed will populate with relevant content.");	
	}

}
