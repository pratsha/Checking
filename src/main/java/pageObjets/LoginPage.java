
package pageObjets;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	@FindBy(id="user_email")
	public WebElement email;
	
	
	@FindBy(id="user_password")
	public WebElement password;
	
	@FindBy(name="commit")
	public WebElement login;
	
	@FindBy(className="link-below-button")
	public WebElement forgotPassword;

	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public FogotPassWord ForgotPassword()
	{
		forgotPassword.click();
		return new FogotPassWord(driver);
	}

}
