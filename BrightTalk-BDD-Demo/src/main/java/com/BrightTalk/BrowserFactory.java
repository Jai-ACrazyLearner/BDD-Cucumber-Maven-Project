package com.BrightTalk;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserFactory {

	public static WebDriver driver;

		public static void selectingBrowserInLocalMachineorGrid (String Browser) {
			switch(Browser){

			case "Firefox":
				try{
				driver = new FirefoxDriver();
				}
				 catch(Exception e)
		            {
		                throw new RuntimeException("Browser give "+Browser+ " did not load..");
		            }
				break;
			case "Safari":
				try{
			//	driver = new SafariDriver();
				}
				 catch(Exception e)
		            {
		                throw new RuntimeException("Browser give "+Browser+ " did not load..");
		            }
				break;
			case "Opera":
				try{
					System.setProperty("webdriver.opera.driver", "//Applications//Opera.app");
				//driver = new OperaDriver();
				}
				 catch(Exception e)
		            {
		                throw new RuntimeException("Browser give "+Browser+ " did not load..");
		            }
				break;
			case "Chrome":
				System.setProperty("webdriver.chrome.driver", "//Users//jaiprakashgogineni//Documents//chrome//chromedriver-2");
				driver=new ChromeDriver();
				break;
			case "Grid":
				try
				{
					WebdriverUtils.Wait(50000);
					System.out.println("grid started");
					WebdriverUtils.Wait(5000);
					DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					capabilities.setCapability("version", "17");
					capabilities.setCapability("platform", Platform.XP);
					driver = new RemoteWebDriver(
							new URL("http://gogjai:6aa03e68-dcc7-4326-ab70-336a886d3167@localhost:4445/wd/hub"),
							capabilities);
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			
		}
}
