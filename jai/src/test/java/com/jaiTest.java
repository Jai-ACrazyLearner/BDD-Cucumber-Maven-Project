package com;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class jaiTest {

	

	@Test
	public void jai()
	{
			System.out.println("Welcome Jai");
	}
	@Test
	public void jai1()
	{
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.newlandchase.com/nc_blog/article/tier_1_psw_switches_into_tier_2_general_a_straightforward_affair");
		driver.quit();
	}
	@Test
	public void jai2()
	{
			System.out.println("Welcome Jai gog");
	}
	


	
}
