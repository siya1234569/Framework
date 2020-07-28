package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LandingPage;
import resources.base;

public class SearchFunctionality extends base{
	
	@BeforeTest
	public void initialise() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		//Log.info("user successfully browsing Shutterfly.com");
	}
	@Test
	public void validate_Search()
	{
		LandingPage lp=new LandingPage(driver);
		driver.findElement(By.className("overlay-modal-close")).click();
        
		WebElement ele = driver.findElement(By.className("uig-single-srch-icon-container"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		
		
	}
	//to validate search options shown or not
	@Test
	public void TC_01()
	{
		Actions action=new Actions(driver);
		WebElement search=driver.findElement(By.xpath("//div[@class='uigSrchTxtFieldContainer']"));
		//WebDriverWait wait1=new WebDriverWait(driver,200);
	    //wait1.until(ExpectedConditions.elementToBeClickable(search));
	   // Action a1=action.moveToElement(search).build();
	   // a1.perform();
	  //  search.click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", search);
		Assert.assertTrue(search.isEnabled(),"is enabled");
		//WebDriverWait wait1=new WebDriverWait(driver,200);
	    //wait1.until(ExpectedConditions.elementToBeClickable(search));
		WebElement id=driver.findElement(By.id("searchBar"));
		  driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		//executor.executeAsyncScript("arguments[0].value='mugs'",id); 

		executor.executeScript("document.getElementById('searchBar').value='mugs'");
		//Action a=action.sendKeys(search, "mugs").build();
		//a.perform();
		//search.clear();
	    //search.sendKeys("mugs");
	
	}
	

}
