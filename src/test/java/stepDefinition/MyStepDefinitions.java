package stepDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pages.LandingPage;
import pages.SignUpPage;
import resources.base;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;

@RunWith(Cucumber.class)
public class MyStepDefinitions extends base{

    @Given("^Initialise browser with chrome$")
    public void initialise_browser_with_chrome() throws Throwable {
		driver = initializeDriver();

    }

    @When("^User enters username and password and signin button$")
    public void user_enters_username_and_password_and_signin_button() throws Throwable {
      
    }

    @Then("^User signIn succsesfuly$")
    public void user_signin_succsesfuly() throws Throwable {
        
    }

    @And("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String arg1) throws Throwable {
		driver.get(arg1);

    }

    @And("^Click on Signin link on homepage to land on secure sign in page$")
    public void click_on_signin_link_on_homepage_to_land_on_secure_sign_in_page() throws Throwable {
    	driver.findElement(By.xpath("//a[@class='color0-hov selected']")).click();
		LandingPage lp = new LandingPage(driver);
		lp.getSignIn().click();// similar to driver.findelement by.

    	
    	
    }

    @And("^Click on signIn with Email$")
    public void click_on_signin_with_email() throws Throwable {
    	SignUpPage sn = new SignUpPage(driver);
		sn.SignInEmail();
    }

}