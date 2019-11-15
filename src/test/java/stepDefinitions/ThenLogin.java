package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;

public class ThenLogin {
	WebDriver driver = SetUpClass.driver;
	
	@Then("User should be in profile page")
	public void user_should_be_in_profile_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println("user is in profile page");
		Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=my-account", "Error");
		//driver.close();
	}
	@Then("User see authentication failed error")
	public void user_see_authentication_failed_error() {
		Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=authentication", "Error Authentication");
		//driver.close();
	}
	
	@Then("User see email is needed error {string}")
	public void user_see_email_is_needed_error(String error){
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class= 'alert alert-danger']//child::ol//child::li")).getText(), error, "Error invalid email");
		//driver.close();
	}
	@Then("User should see one item in cart {string}")
	public void user_should_see_one_item_in_cart(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	
//Password is required. An email address required.
}
