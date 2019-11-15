package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import pageObjects.HomePage;
import pageObjects.LogIn;

public class GivenLogin {
	public WebDriver driver = SetUpClass.driver;
	HomePage hp;
	LogIn lg;
	
	@Given("User click on Sign in")
	public void userclick_on_Sign_in() {
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println("User click sign in");
	    //driver.findElement(By.className("login")).click();
		hp = new HomePage(driver);
		hp.cickOnSignIn();
		
	}

	@Given("User should be logged")
	public void user_should_be_logged() {
		hp = new HomePage(driver);
		hp.cickOnSignIn();
		lg = new LogIn(driver);
		lg.logInToPage();
		
	}
}
