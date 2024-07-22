package Luma_Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Luma_PageObjects.Luma_Registration;


public class Luma_TC_001_Registration extends Luma_BaseClass {
	
	public Luma_Registration lr;
	
	@Test
	public void LumaRegistertest() throws IOException {	
		
		lr=new Luma_Registration(driver);
		
		lr.ClickCreateAnAccountLink();
		log.info("Luma CreateAnAccountLink clicking activity is completed");
		
		lr.setFirstName(FName);
		log.info("First Name is entered");
		
		lr.setLastName(LName);
		log.info("Last Name is entered");
		
		lr.setEmailAddress(Email);
		log.info("Email is entered");
		
		lr.setPassword(Password);
		log.info("Password Entered");
		
		lr.setConfirmPassword(CPassword);
		log.info("Confirm Password is entered");
		
		lr.ClickCreateAnAccountButton();
		log.info("Luma account creation is completed");
		
		
		
	String Act_title=driver.getTitle();
		String Exp_title="My Account23";
		
		if(Act_title.equals(Exp_title)) {
			
			Assert.assertTrue(true);
			System.out.println("testcases is passed");
		}else {
			
			
			Assert.assertTrue(false);
			System.out.println("Testcase is failed");
		} 
			
	} 
	
}
