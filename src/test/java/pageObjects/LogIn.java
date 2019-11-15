package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {

	public LogIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "email")
	WebElement lblEmail;
	
	@FindBy(name = "passwd")
	WebElement lblPass;
	
	@FindBy(id = "SubmitLogin")
	WebElement btnSignIn;
	
	public void sendEmail(String email) {
		lblEmail.sendKeys(email);
	}
	public void sendPass(String pass) {
		lblPass.sendKeys(pass);
	}
	public void clickSignIn(){
		btnSignIn.click();
	}
	public void logInToPage() {
		lblEmail.sendKeys("aa@aaa.com");
		lblPass.sendKeys("askldkas");
		btnSignIn.click();
	}
	
}
