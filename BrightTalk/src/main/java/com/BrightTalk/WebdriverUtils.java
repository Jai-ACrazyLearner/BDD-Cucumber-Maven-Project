package com.BrightTalk;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtils extends BrowserFactory{

	public static boolean isElementPresent(By element) {
        try {
            return driver.findElement(element).isDisplayed();
        }
        catch (Exception e)
        {
            return false;
        }
    }
    public static void Select(By Webelement) {
    	Select select = new Select(driver.findElement(Webelement));
  
	}
    public static void implicitWait(int seconds) {
		
    	driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
    public static void explicitWait(int i, String id) {
    
    	WebElement myDynamicElement = (new WebDriverWait(driver, i))
    	  .until(ExpectedConditions.presenceOfElementLocated(By.id(id)));	
	}
    public static boolean isTextPresent(String text) {
        return driver.findElement(By.tagName("body")).getText().contains(text);
    }
    public static void assertUrlVerification(String URLtxt) {
    	Assert.assertTrue(driver.getCurrentUrl().contains(URLtxt));
	}
    public static void assertVerifyPageSource(String pageSource) {
    	Assert.assertTrue(driver.getPageSource().contains(pageSource));
	}
    public static void assertbyID(String ID,String Expected) {
    	Assert.assertTrue(driver.findElement(By.id(ID)).getText().matches(Expected));
	}
    public static void islinkTextEnabled(String Linktext) {
    	driver.findElement(By.linkText(Linktext)).isEnabled();
		
	}
    public static void clikOnLinkText(String Linktext) {
    	driver.findElement(By.linkText(Linktext)).click();;
	}
    public static  void SendkeysXpath(String Xpath,String Info)
	{
		driver.findElement(By.xpath(Xpath)).click();
		driver.findElement(By.xpath(Xpath)).sendKeys(Info);
	}
	public static String Gettext(String XPath)
	{
		String Answer = driver.findElement(By.xpath(XPath)).getText();
		return Answer;
	}
	public static  String GetAttribute(String Xpath, String AttributeName)
	{
		String Attribute= driver.findElement(By.xpath(Xpath)).getAttribute(AttributeName);
		return Attribute;
	}
	public static String GetTagName(String Xpath)
	{
		String TagName= driver.findElement(By.xpath(Xpath)).getTagName();
		return TagName;
	}
	public static  void SendkeysByID(String ID, String input)
	{
		driver.findElement(By.id(ID)).sendKeys(input);;	
	}
	public static  void SendkeysByCSSPath(String CSS)
	{
		driver.findElement(By.cssSelector(CSS));	
	}
	public static void Wait(int i) throws Exception
	{
	Thread.sleep(i);
	}
	public static void Click (String X_path)
	{
		driver.findElement(By.xpath(X_path)).click();
	}   
}
