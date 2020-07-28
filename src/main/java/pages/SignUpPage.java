package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {

	public WebDriver driver;
	
	private By firstName=By.id("firstName");
	private By lastName=By.id("lastName");
	private By email=By.id("email");
	private By confirmEmail=By.id("confirmEmail");
	private By password=By.id("password");
	private By confirmPassword=By.id("confirmPassword");
	private By signUp=By.id("signUpButton");
	
	//constructor
	public SignUpPage(WebDriver driver2) {
	this.driver=driver2;
	}
  	 
	
	 public WebDriver getTitleWindow()
	 {
		 String parent=driver.getWindowHandle();
		 Set<String> s=driver.getWindowHandles();
		 for(String ss:s)
		 {
			 if(!ss.equals(parent))
			 {
				String w=driver.switchTo().window(ss).getTitle();
			
			 }
		 }
		 return driver;
	 }
	 
	 public void firstName() {
		 driver.findElement(firstName).sendKeys("Priyanka");
	}
	
public void lastName() {
	 driver.findElement(lastName).sendKeys("Gunjal");
}

public void email() {
	 driver.findElement(email).sendKeys("Priyankadighe2224@gmail.com");
}

public void confirmEmail() {
	 driver.findElement(confirmEmail).sendKeys("Priyankadighe2224@gmail.com");
}

public void password() {
	 driver.findElement(password).sendKeys("Priyanka");
}

public void confirmPassword() {
	 driver.findElement(confirmPassword).sendKeys("Priyanka");
}

public WebElement SignUp() {
	
	return driver.findElement(signUp);
	
}
	 
 

}

