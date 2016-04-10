package com.BrightTalk.Features.SeleniumSmokes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BrightTalk.BrowserFactory;
import com.BrightTalk.MethodsInterface;
import com.BrightTalk.WebdriverUtils;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class F001_BrightTalkSignup extends BrowserFactory {
	
	@Given("^I go to the signup page$")
	public void I_go_to_the_signup_page() throws Throwable {   
		WebdriverUtils.assertVerifyPageSource("Join for free");
	}
	@Given("^I fill in the following:$")
	public void I_fill_in_the_following(DataTable arg1) throws Throwable {
	   
		WebdriverUtils.SendkeysByID("user_registration_first_name", "Fname");
		WebdriverUtils.SendkeysByID("user_registration_last_name", "Lname");
		
		Select select = new Select(driver.findElement(By.id("user_registration_timezone")));
		Thread.sleep(5000);
		select.selectByVisibleText("United States - New York");
		
		WebdriverUtils.SendkeysByID("user_registration_email_address", "testinguser@gmail.com");
		WebdriverUtils.SendkeysByID("user_registration_password", "password");
		WebdriverUtils.SendkeysByID("user_registration_password_confirm", "password");
		}	
	@When("^I press button 'Proceeed'$")
	public void I_press_button_Proceeed() throws Throwable {
		WebdriverUtils.Click("//html/body/div/div/div/div[3]/div/form/div[3]/button");
	}
	@Then("^I should see \"([^\"]*)\"$")
	public void I_should_see(String Welcometxt) throws Throwable {
		WebdriverUtils.assertVerifyPageSource(Welcometxt);
	}
}
