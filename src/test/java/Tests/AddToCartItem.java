package Tests;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;

public class AddToCartItem extends base {

	@BeforeTest
	public void initialise() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void TC_01()
	{
		WebElement element=driver.findElement(By.className("overlay-modal-close"));
		WebDriverWait wait1=new WebDriverWait(driver,200);
	    wait1.until(ExpectedConditions.elementToBeClickable(element)).click();
		driver.findElement(By.xpath("//a[@id='cat-link-1176213']//span[@class='cat-item-text'][contains(text(),'Gifts')]")).click();
		driver.findElement(By.xpath("//a[@class='btn-primary']")).click();
		WebElement myelement=driver.findElement(By.className("modal-close"));

		WebDriverWait wait2=new WebDriverWait(driver,200);
	    wait2.until(ExpectedConditions.elementToBeClickable(myelement)).click();
		driver.findElement(By.xpath("//body[@class='device-COMPUTER brand-SFLY responsive may-release-header']/div[@id='totallyNonConflictingWrapper']/div[@id='docWide']/main[@id='main-content']/div[@id='app-container']/div/div[@class='rightContent']/div[@class='thumbnailArea']/div[@class='thumbnail-grid']/div[3]/div[1]")).click();
		
		driver.findElement(By.xpath("//a[@class='uig-button uig-primary-button personalize-button']")).click(); 
		
		WebElement element1=driver.findElement(By.xpath("//div[@class='empty-message-text']"));
		WebDriverWait wait3=new WebDriverWait(driver,500);
	    wait3.until(ExpectedConditions.elementToBeClickable(element1)).click();
		driver.findElement(By.xpath("//a[contains(text(),'Upload')]")).click();
		driver.findElement(By.xpath("//a[@id='sfly_6']")).click();
		
	}
}
