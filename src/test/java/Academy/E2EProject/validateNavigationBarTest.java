package Academy.E2EProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjets.LandingPage;
import resources.base;

public class validateNavigationBarTest extends base {

	WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void basePageNavigation() throws IOException
	{
		
		LandingPage lp=new LandingPage(driver);
		lp.getTitle().getText();
		
		Assert.assertTrue(lp.getTitle().getText().equalsIgnoreCase( "Featured Courses"));
		Assert.assertTrue(lp.NavigationBar().isDisplayed());
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
