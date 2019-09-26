package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stepdefs {
	WebDriver driver;
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Vignes\\chromedriver.exe");
		  driver = new ChromeDriver();
	}

	@When("user provides the correct credentials")
	public void LoginMethod() {
		driver.get("http://10.232.237.143:443//TestMeApp//fetchcat.htm");
		driver.findElement(By.partialLinkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();
		System.out.println("printll");
	}
	 
	

	@Then("user rendered to TestMeApp home page")
	public void user_rendered_to_TestMeApp_home_page() {
		String test= driver.getTitle();
	   Assert.assertEquals("HOME", test);
	}
   
}
