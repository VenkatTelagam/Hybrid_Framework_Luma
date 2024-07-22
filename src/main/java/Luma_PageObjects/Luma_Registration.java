package Luma_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_Registration {


	public WebDriver driver;

	//it is divided into 3 parts
	public Luma_Registration(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//identify the WebElements

	@FindBy(xpath="(//a[text()='Create an Account'])[1]")
	WebElement lnkCreateAccount;

	@FindBy(id="firstname")
	WebElement txtFirstname;

	@FindBy(id="lastname")
	WebElement txtLastname;

	@FindBy(id="email_address")
	WebElement txtEmailaddress;

	@FindBy(id="password")
	WebElement txtPassword;

	@FindBy(id="password-confirmation")
	WebElement txtCPassword;

	@FindBy(xpath="//button[@title='Create an Account']")
	WebElement btnCreateAnAccount;


     //create the corresponding actions

	public void ClickCreateAnAccountLink() {
		lnkCreateAccount.click();
	}
	public void setFirstName(String fname) {
		txtFirstname.sendKeys(fname);
	}
	public void setLastName(String Lname) {
		txtLastname.sendKeys(Lname);
	}
	public void setEmailAddress(String Email) {
		txtEmailaddress.sendKeys(Email);
	}
	public void setPassword(String Password) {
		txtPassword.sendKeys(Password);
	}
	public void setConfirmPassword(String CPassword) {
		txtCPassword.sendKeys(CPassword);
	}
	public void ClickCreateAnAccountButton() {
		btnCreateAnAccount.click();
	}
}
