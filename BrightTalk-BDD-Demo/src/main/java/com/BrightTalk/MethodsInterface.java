package com.BrightTalk;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public interface  MethodsInterface {

	
	@Before
	/**
	 * Which Browser you wanna Run your Test
	 * @param Browser
	 */
	public void SelectBrowser();
	@After
	public void CloseBrowser();
	
}
