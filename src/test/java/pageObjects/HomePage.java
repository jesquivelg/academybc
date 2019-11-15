package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//how = How.CLASS_NAME, using = "login"
	@FindBy(className = "login")
	WebElement signInBtn;
	
	public void cickOnSignIn() {
		signInBtn.click();
	}
	
	
}
