package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SignInPage {

	public WebDriver driver;
	
	private By signin=By.className("signIn-label");
	private By clickOnsignIn=By.xpath("//a[@class='uig-button uig-primary-button']");
	private By email=By.xpath("//input[@id='email']");
	private By password=By.id("password");
	private By signInbutton=By.id("signInButton");
	private By hellotext=By.xpath("//span[@class='uig-hello-text']");

	
	
	
	
	public SignInPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement signIn()
	{
		return driver.findElement(signin);
		
	}
	
	public WebElement clickOnSighIn()
	{
		return driver.findElement(clickOnsignIn);
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement getSignIn()
	{
		return driver.findElement(signInbutton);
	}
	
	public WebElement DisplayHelloText()
	{
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebElement element=driver.findElement(hellotext);
		WebDriverWait wait=new WebDriverWait(driver, 1000);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		System.out.println(element.getText());
		return element;
	}
	
}
