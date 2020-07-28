package Tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.SignInPage;
import resources.base;

public class validateSignInDetails extends base{
	
	public static Logger log=LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialise() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("user succesfuly browsing Shutterfly.com");
	}

	@AfterTest
	public void tearDown()
	{
		
		driver.close();
		driver = null; /// to minimize use of memory driver should make null
       log.info("browser have successfully closed window");
	}
	
	@Test(dataProvider="getData")
	public void to_validate_User(String enterEmail,String password,String text) throws IOException
	{
	
	try {
	driver.findElement(By.className("overlay-modal-close")).click();
	}
	catch(Exception e)
	{
		System.out.println("stale element reference exception");
	}
	
	SignInPage s=new SignInPage(driver);
	s.signIn().click();
	s.clickOnSighIn().click();
	s.getEmail().sendKeys(enterEmail);
	s.getPassword().sendKeys(password);
	System.out.println(text);
	((SignInPage) s).getSignIn().click();
     Assert.assertTrue(s.DisplayHelloText().isDisplayed(),"yes its displayed");
     log.info("user is successfully signIn into application");
	
	
	

	}	
	
	@DataProvider
	public Object[][] getData()
	{
		//row stands for how many different datatypes test should run
		//colomns stands for how many values per each test
		Object[][] data=new Object[2][3];
		//1th row
		data[0][0]="priyankadighe2224@gmail.com";
		data[0][1]="Priyanka";
		data[0][2]="valid user";
		//2st row
		data[1][0]="priyankadighe2224@gmail.com";
		data[1][1]="suraj";
		data[1][2]="Invalid user";
		
		return data;
	}

}
