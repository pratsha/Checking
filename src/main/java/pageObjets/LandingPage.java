package pageObjets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/* <div class="text-center"> <h2>Featured Courses</h2> </div> */
	
	@FindBy(css="[class='text-center'] h2")
	WebElement featuredText;
	 
	@FindBy(css="[href*='sign_in']")
	WebElement Login;
	//class="nav navbar-nav navbar-right"
	@FindBy(css=".navbar-collapse.collapse")
	WebElement NavigationBar;
	
	
	
	
	public LoginPage getLogin()
	{
		Login.click();
		return new LoginPage(driver);
	}
	
	public WebElement getTitle()
	{
		return featuredText;
	}
	
	public WebElement NavigationBar()
	{
		return NavigationBar;
	}

}
