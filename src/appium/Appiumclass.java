package appium;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Appiumclass {
	public static void main(String args[]) throws MalformedURLException
	{
		

	AndroidDriver<AndroidElement>  driver;

		// TODO Auto-generated method stub
	 File appDir = new File("src");
     File app = new File(appDir, "ApiDemos-debug.apk");
     DesiredCapabilities capabilities = new DesiredCapabilities();
     
     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "my-emulator");
     capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
     capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
     capabilities.setCapability("autoGrantPermissions", true);
     capabilities.setCapability("–session-override", true);
		
		
		
		
		
		
		
		
		  capabilities.setCapability("appPackage",
		  "io.appium.android.apis");
		  capabilities.setCapability("appActivity",
		  ".ApiDemos");
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
    driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	    
	    
	}
	
	

}

