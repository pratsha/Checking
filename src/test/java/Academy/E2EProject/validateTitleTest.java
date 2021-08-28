package Academy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjets.LandingPage;
import resources.base;

public class validateTitleTest extends base {

	WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		log.info("Driver initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigation DONE!!!");
	}
	@Test
	public void basePageNavigationTitle() throws IOException
	{
		
		LandingPage lp=new LandingPage(driver);
		lp.getTitle().getText();
		
		Assert.assertTrue(lp.getTitle().getText().equalsIgnoreCase( "Featured Courses123"));
		Assert.assertTrue(lp.NavigationBar().isDisplayed());
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
}
