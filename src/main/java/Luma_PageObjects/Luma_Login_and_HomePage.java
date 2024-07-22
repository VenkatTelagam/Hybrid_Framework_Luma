package Luma_PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_Login_and_HomePage {

	public WebDriver driver;
	//it is divided into 3 parts
	public Luma_Login_and_HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//identify the WebElements

	//Login
	@FindBy(id="email")
	WebElement txtEmail;

	@FindBy(id="pass")
	WebElement txtPassword;

	@FindBy(id="send2")
	WebElement btnLogin;

	//Homepage
	@FindBy(id="ui-id-5")
	WebElement menuOption;

	@FindBy(xpath="//a[text()='Tees']")
	WebElement linkTess;

	//ProductPage
	@FindBy(xpath="(//a[@class='product-item-link'])[1]")
	WebElement productLink;
	
	//ProductSizePage
	@FindBy(xpath="//div[@id='option-label-size-143-item-168']")
	WebElement sizeOption;
	
	@FindBy(xpath="//div[@id='option-label-color-93-item-49']")
	WebElement colorOption;
    
	@FindBy(xpath="//button[@id='product-addtocart-button']")
	WebElement btnAddToCart;
	
	
	//add cartpage
	@FindBy(xpath="//a[@class='action showcart']")
	WebElement optionAddToCart2;
	
	@FindBy(xpath="//button[@id='top-cart-btn-checkout']")
	WebElement btnCheckout;
	
	//Product Shipping page
	@FindBy(xpath="(//input[@class='radio'])[1]")
	WebElement btnShipping;
	
	@FindBy(xpath="//button[@class='button action continue primary']")
	WebElement btnNxt;
	
	//PaymentMthod page
	@FindBy(xpath="//button[@class='action primary checkout']")
	WebElement btnPlaceOrder;
	

	public void setEmail(String Email) {
		txtEmail.sendKeys(Email);
	}
	public void setPassword(String Password) {
		txtPassword.sendKeys(Password);
	}
	public void ClickLoginButton() {
		btnLogin.click();
	}

	//HomePage
	public void ClickMenuOption() {
		menuOption.click();
	}
	public void ClickLinkTess() {
		linkTess.click();
	}

	//ProductPage
	public void ClickProductLink() {
		productLink.click();
	}
	
	//ProductSizePage
	public void ClickProductSizeOption() {
		sizeOption.click();
	}
	public void ClickProductColorOption() {
		colorOption.click();
	}
	public void ClickbtnAddToCartOption() {
		btnAddToCart.click();
	}
	
	//AddCart page
	public void ClickbtnAddToCartOption2() {
		optionAddToCart2.click();
	}
	public void btnCheckout() {
		btnCheckout.click();
	}
	
	//Product Shipping Page
	public void btnShipping() {
		btnShipping.click();
	}
	public void btnNxt() {
		btnNxt.click();
	}
	
	//Paymentmethod page
	public void btnPlaceOrder() {
		btnPlaceOrder.click();
	}
	
}