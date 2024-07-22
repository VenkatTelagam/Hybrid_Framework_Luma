package Luma_Testcases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Luma_PageObjects.Luma_Login_and_HomePage;
import Luma_Utilities.XLUtils;



public class Luma_TC_002_Login_HomePage extends Luma_BaseClass {

	@Test(dataProvider="LumaLoginData")
	public void loginTest(String Email,String Password) throws InterruptedException {

		Luma_Login_and_HomePage ll=new Luma_Login_and_HomePage(driver);
		

		//ll.clickSignIn();
		ll.setEmail(Email);
		ll.setPassword(Password);
		ll.ClickLoginButton();

		//Home page
		ll.ClickMenuOption();
		ll.ClickLinkTess();
		
		//ProductPage
		ll.ClickProductLink();
		
		//ProductSizePage
		
		ll.ClickProductSizeOption();
		ll.ClickProductColorOption();
		ll.ClickbtnAddToCartOption();
		
		Thread.sleep(5000);
		
		//Addcart Page
		ll.ClickbtnAddToCartOption2();
        ll.btnCheckout();
        
        Thread.sleep(5000);
        //product shipping page
        ll.btnShipping();
        ll.btnNxt();
        
        Thread.sleep(5000);
        //paymentmethod page
        ll.btnPlaceOrder();
        
	}

	@DataProvider(name="LumaLoginData")
	String [][] getData() throws IOException{

		String path="F:\\Eclipse work space\\Hybrid_Framework_Luma\\src\\main\\java\\Luma_TestData\\LumaLoginData.xlsx";

		//it is identify the rowcount
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		//identify the colcount
		int colcount=XLUtils.getCellcount(path, "Sheet1", 1);

		String logindata[][]=new String[rownum][colcount];
		//0,1
		for(int i=1;i<=rownum;i++) {//it is represents rows

			for(int j=0;j<colcount;j++) {//it is represents the columns

				logindata[i-1][j]=XLUtils.getcelldata(path, "Sheet1", i, j);
			}

		}
		return logindata;
	}

}

