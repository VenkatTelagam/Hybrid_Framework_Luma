package Luma_Testcases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Luma_Utilities.ReadingDataLuma;




public class Luma_BaseClass {
	
public static WebDriver driver;
	
	public Logger log;
	
    ReadingDataLuma rdl =new ReadingDataLuma();
    
    //Registration
    public String FName=rdl.getFirstName();
    public String LName=rdl.getLastName();
    public String Email=rdl.getEmail();
    public String Password=rdl.getPassword();
    public String CPassword=rdl.getCPassword();
    
    //Login
    public String LEmail=rdl.getLoginEmail();
    public String LPassword=rdl.getLoginPassword();
    
    
    
	@BeforeClass
	@Parameters({"browser","URL"})
	public void openApplication(String br,String url) {
		
		if(br.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(br.equals("edge")) {
			driver=new EdgeDriver();
		}
		else if(br.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	     driver.manage().window().maximize();
	     
	     log=Logger.getLogger("Hybrid_Framework_Luma");
			PropertyConfigurator.configure("Log4j.properties");
	
	}
	
	/*@AfterClass
	public void closeApplication() {
		
		driver.close();
	}*/
	
	public String captureScreen(String tname) {
		String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
		TakesScreenshot screenshot=((TakesScreenshot)driver);
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		
		//project home directory (./)
		String destination=System.getProperty("user.dir")+"\\Screenshots\\"+tname+"_"+timestamp+".png";
		try {
			FileUtils.copyFile(source, new File(destination));
		}catch(Exception e) {
			e.getMessage();
		}
		return destination;	
	}
}