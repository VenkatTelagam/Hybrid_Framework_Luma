package Luma_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadingDataLuma {
	
	
	Properties pro;
	public ReadingDataLuma() {
		File file=new File("./Configuration/Data.properties");
		
		try {
			//it is coverting any file in reaading mode
			FileInputStream fis=new FileInputStream(file);
			
			pro=new Properties();
			pro.load(fis);//loading the properties file
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}	
	
	//Registration
	public String getFirstName() {
		
		 String FName=pro.getProperty("FirstName");
		 return FName;
	}
	public String getLastName() {
		String LName=pro.getProperty("LastName");
		return LName;
	}
	public String getEmail() {
		String Email=pro.getProperty("Email");
		return Email;
	}	
	public String getPassword() {
		String Password=pro.getProperty("Password");
		return Password;
	}	
	public String getCPassword() {
		
		String CPassword=pro.getProperty("ConfirmPassword");
		return CPassword;
	}
	
	//Login
	public String getLoginEmail() {
		String LEmail=pro.getProperty("LEmail");
		return LEmail;
	}	
	public String getLoginPassword() {
		String LPassword=pro.getProperty("LPassword");
		return LPassword;
}
}