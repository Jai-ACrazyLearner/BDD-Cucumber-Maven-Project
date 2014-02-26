package com.BrightTalk.Features.SeleniumSmokes;

import java.util.List;

import org.hamcrest.text.pattern.Parse;
import org.junit.Assert;
import org.junit.Assume;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BrightTalk.BrowserFactory;
import com.BrightTalk.MethodsInterface;
import com.BrightTalk.WebdriverUtils;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class F002_ContentExplore extends BrowserFactory implements MethodsInterface {


	@Before
	public void SelectBrowser() {
		try {
			BrowserFactory.selectingBrowserInLocalMachineorGrid("Chrome");
			BrowserFactory.driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@After
	public void CloseBrowser() {
		BrowserFactory.driver.close();
	}

	@Given("^I have Url 'BrightTalk - URL' - \"([^\"]*)\"$")
	public void I_have_Url_BrightTalk_URL_(String URL) throws Throwable {
		BrowserFactory.driver.get(URL);
	}
	@Given("^I am on the Brightlak home page$")
	public void I_am_on_the_Brightlak_home_page() throws Throwable {
		WebdriverUtils.assertUrlVerification("www.brighttalk.com");
	}

	@When("^I See the page$")
	public void I_See_the_page() throws Throwable {
		WebdriverUtils.assertVerifyPageSource("Webinars and videos for professionals and their communities");
	}
	@Then("^I should see displayed 'image' file with 'id' logo \"([^\"]*)\"$")
	public void I_should_see_displayed_image_file_with_id_logo(String Image) throws Throwable {
		WebdriverUtils.assertVerifyPageSource(Image);
	}
	@Then("^Under the 'span' tag I should see 'display' text saying \"([^\"]*)\"$")
	public void Under_the_span_tag_I_should_see_display_text_saying(String DisplayText) throws Throwable {
		WebdriverUtils.assertVerifyPageSource(DisplayText);
	}
	@When("^I click link 'ExploreContent' button 'id' - \"([^\"]*)\"$")
	public void I_click_link_ExploreContent_button_id_(String ExploreButton) throws Throwable {
		WebdriverUtils.driver.findElement(By.id(ExploreButton)).click();
	}
	@Then("^I should see all list of Comunities$")
	public boolean I_should_see_all_list_of_Comunities() throws Throwable {
	
		List<WebElement> ExploreContentData = WebdriverUtils.driver.findElements(By.xpath("//html/body/div/div/div/div[2]/div[2]/ul/li"));
		Thread.sleep(5000);
		int answer1= ExploreContentData.size();
		System.out.println(answer1);
		for(WebElement data: ExploreContentData){
			System.out.println(data.getText());
		}
		String	finalSize = String.valueOf(answer1);
		return finalSize.equals(11);
	}
}


