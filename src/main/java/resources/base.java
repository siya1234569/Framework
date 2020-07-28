package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	public static WebDriver driver;

	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
		 prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\new java workspace\\frameworkDesign2\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);//loading data.properties
		String browserName=prop.getProperty("browser");//getting property from data.properties
		
		
		if(browserName.equals("chrome"))
		{
			//WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe"); 
			 driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "e:\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE"))
		{
			System.setProperty("webdriver.IE.driver", "e:\\IEdriver.exe");
			  driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		return driver;//return driver object back to use in another classes
		
		
	}
	
	public void getScreenshot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\shscr\\"+result+"screenshot2.png"));
	}
    
}
