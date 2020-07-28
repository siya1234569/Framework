package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LandingPage {

	public WebDriver driver;
	//all variables made private to achieve encapsulation
	private By signIn=By.xpath("//a[@id='user-menu']");
	private By signUp=By.xpath("//a[@class='uig-button uig-secondary-button']");
	private By search=By.xpath("//input[@placeholder='Search']");
	
	//constructor
	public LandingPage(WebDriver driver2) {
		this.driver=driver2;
	}
	
 public WebElement getSignIn()
 {
	 return driver.findElement(signIn);
 }

 public WebElement getSignUp()
 {
	 return driver.findElement(signUp);
 }
 
 public WebElement clickOnSearch()
 {
	return driver.findElement(search);
 }
 

	


}
