package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.When;
import pageObjects.Category;
import pageObjects.LogIn;
import pageObjects.MyAccountPage;

public class WhenLogin {
	WebDriver driver = SetUpClass.driver;
	LogIn login;
	MyAccountPage map;
	Category cat;
	
	@When("User enters valid email address {string}")
	public void user_enters_valid_email_address(String email) {
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println("User enter email address");
		//driver.findElement(By.id("email")).sendKeys(email);
		login = new LogIn(driver);
		login.sendEmail(email);
		
	}
	
	@When("User enters valid password {string}")
	public void user_enters_valid_password(String passwd) {
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println("user enters password");
		//driver.findElement(By.id("passwd")).sendKeys(pass);
		login.sendPass(passwd);
	}
	
	@When("User clicks Sign in")
	public void user_clicks_Sign_in() {
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println("User click sign in");
		//driver.findElement(By.id("SubmitLogin")).click();
		login.clickSignIn();
	}
	
	@When("User enters invalid email address {string}")
	public void user_enters_invalid_email_address(String email) {
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println("User enter email address");
		login.sendEmail(email);
	}
	
	@When("User enters invalid password {string}")
	public void user_enters_invalid_password(String pass) {
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println("user enters password");
		login.sendPass(pass);
	}
	@When("User click on women")
	public void user_click_on_women(){
		//driver.findElement(By.className("sf-with-ul")).click();
		map = new MyAccountPage(driver);
		map.clickWomenNavBar();
		
	}
	@When("User click add an article to cart")
	public void user_click_add_an_article_to_cart() {
		//Actions action = new Actions(driver);
		//action.moveToElement(driver.findElement(By.xpath("//ul[@class = 'product_list grid row']//child::ul"))).perform();
		//driver.findElement(By.xpath("//div[@class = 'button-container']//child::a")).click();
		cat = new Category(driver);
		cat.selectArticle(0);
	}
	@When("User click proceed to checkout")
	public void user_click_proceed_to_checkout() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		cat.clickProceedToCheckout();
		cat.clickProceedtoCheckoutMod();
	}
}
