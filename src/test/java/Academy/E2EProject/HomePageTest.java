package Academy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjets.FogotPassWord;
import pageObjets.LandingPage;
import pageObjets.LoginPage;
import resources.base;

public class HomePageTest extends base{
	public static Logger log=LogManager.getLogger(base.class.getName());
	WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		log.info("Home  Page Driver INITILIZED.!!!");
		
	}
	@Test(dataProvider="getData")
	public void basePageNavigation(String userName, String password) throws IOException
	{
		driver.get(prop.getProperty("url"));
		
		LandingPage landingPage=new LandingPage(driver);
		LoginPage lp=landingPage.getLogin();
		
		
		lp.email.sendKeys(userName);
		lp.password.sendKeys(password);
		lp.login.click();
		FogotPassWord fp=lp.ForgotPassword();
		fp.email.sendKeys("abc@ab.com");
		fp.commitButton.click();
		
		
	}
	
	@DataProvider
	public Object getData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="nonrestricted@qw.com";
		data[0][1]="1232323";
		//data[0][2]="Restricted User";
		
		
		 data[1][0]="restricted@qw.com"; 
		 data[1][1]="1232323";
		 
		//data[1][2]="Non Restricted User";
		
		return data;
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
