package PageObjects;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="email")
	private WebElement uname;
	
	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(id="SubmitLogin")
	private WebElement loginBtn;
	
	
	public void signInForm(String email, String pass) {
		uname.sendKeys(email);
		password.sendKeys(pass);
		loginBtn.click();
	}
	
	public boolean validateErrorPage(String expURL, WebDriver driver) {
		boolean fnStatus = false;
		String actURL = driver.getCurrentUrl();
		fnStatus = actURL.equals(expURL);
		
		return fnStatus;
	}
}
