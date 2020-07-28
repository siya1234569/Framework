package Tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LandingPage;
import pages.SignUpPage;
import resources.base;
//to validate if featured products is present on browser or not
public class validateTitle extends base{
	
	  private static Logger Log=LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialise() throws IOException
	{
		driver=initializeDriver();
		Log.info("Driver is initialised");
		driver.get(prop.getProperty("url"));
		Log.info("navigated to homepage");
	}
	
	@Test
	public void basePagenavigation() throws IOException
	{
		 
		
		//you can access methods of another class by inheritance or by making an object of that class
		
		//driver.findElement(By.xpath("//a[@class='color0-hov selected']")).click();
		LandingPage lp=new LandingPage(driver);
		//compare the text from browser to the actual text
		Assert.assertEquals(lp.getTitle().getText(), "Facebook");
		 Log.info("succesfully validated Facebook  title ");
		
		
	} 
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver=null;  ///to minimize use of memory driver should make null
	}

}
