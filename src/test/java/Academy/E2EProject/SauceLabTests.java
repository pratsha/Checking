package Academy.E2EProject;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SauceLabTests {
	
	@Test
	public void SauceLabOne() throws MalformedURLException
	{
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		MutableCapabilities sauceOptions = new MutableCapabilities();

		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setExperimentalOption("w3c", true);
		browserOptions.setCapability("platformName", "Windows 10");
		browserOptions.setCapability("browserVersion", "92.0");
		browserOptions.setCapability("sauce:options", sauceOptions);
		
		WebDriver driver = new RemoteWebDriver(
			    new URL("https://oauth-prateekk.bhatnagar-35a73:56bdb536-570b-4792-8686-650ea0c3cacb@ondemand.eu-central-1.saucelabs.com:443/wd/hub"),browserOptions
			);
		
		driver.get("https://saucelabs.com/platform/platform-configurator#/");
		
	}

}
