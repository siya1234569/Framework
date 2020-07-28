package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LandingPage;
import pages.SignUpPage;
import resources.base;

public class HomePage extends base {

	private static Logger Log = LogManager.getLogger(base.class.getName());
	private By signUp=By.id("signUpButton");


	@BeforeTest
	public void initialise() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		Log.info("user succesfuly browsing Shutterfly.com");
	}


	@Test
	public void basePagenavigation() throws IOException {

		// you can access methods of another class by inheritance or by making an object
		// of that class
		
		try {
		driver.findElement(By.className("overlay-modal-close")).click();
		}
		catch(Exception e)
		{
			System.out.println("stale element reference exception");
		}
        LandingPage lp = new LandingPage(driver);
		lp.getSignIn().click();
		WebDriverWait wait = new WebDriverWait(driver,100); 
		wait.until(ExpectedConditions.elementToBeClickable(lp.getSignUp())).click();
	   
		SignUpPage sn = new SignUpPage(driver);
		sn.getTitleWindow();
		sn.firstName();
		sn.lastName();
		sn.email();
		sn.confirmEmail();
		sn.password();
		sn.confirmPassword();
		
		WebElement myelement = driver.findElement(By.id("signUpButton"));
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].scrollIntoView()", myelement);
		WebDriverWait wait1=new WebDriverWait(driver,200);
	    wait1.until(ExpectedConditions.elementToBeClickable(myelement));
	    myelement.click(); 
		Log.info("user succesfuly SignUp into the application");
		
	}

	

	@AfterTest
	public void tearDown()
	{
		
		driver.close();
		driver = null; /// to minimize use of memory driver should make null

	}


	
}
