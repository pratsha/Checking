package pageObjets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FogotPassWord {
	public WebDriver driver;
	public FogotPassWord(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user_email")
	public WebElement email;
	@FindBy(name="commit")
	public WebElement commitButton;

}
