package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Category {
	WebDriver driver;
	public Category(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ul[@class = 'product_list grid row']/li")
	List<WebElement> articles;
	
	@FindBy(xpath = "//span[text() = 'Add to cart']")
	List<WebElement> addToCart;
	
	@FindBy(xpath = "//span[contains(text(), 'Proceed to')]")
	WebElement proceedToCheckout;
	
	@FindBy(xpath = "//a[@class = 'btn btn-default button button-medium']")
	WebElement btnProceedToCheckout;
	public void selectArticle(int index) {
		if(index <= articles.size()-1) {
			Actions ac = new Actions(driver);
			ac.moveToElement(articles.get(index)).perform();
			addToCart.get(index).click();
		} else {
			System.out.println("Error Lista");
		}
	}
	public void clickProceedToCheckout() {
		proceedToCheckout.click();
	}
	
	public void clickProceedtoCheckoutMod() {
		btnProceedToCheckout.click();
	}
	
}
