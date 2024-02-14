package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConduitPageLoginStepDef {
	
	WebDriver driver;
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.manage().window().maximize();
		  driver.get("https://react-redux.realworld.io/#/login?_k=a4v3l0");
	    
	}
	@When("User enters credentials")
	public void user_enters_credentials() {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Username@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Username");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	   
	}
	@Then("Should display Success Msg")
	public void should_display_success_msg() {
		boolean isUserValid = driver.findElement(By.xpath("//a[text() = 'Your Feed']")).isDisplayed();
		Assert.assertTrue(isUserValid);
	 }
	
	
	@When("User enters invalid credentials")
	public void user_enters_invalid_credentials() {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Username@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Usernam");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	@Then("Should display Error Msg")
	public void should_display_error_msg() {
		boolean check=driver.findElement(By.xpath("//li[contains(text(),'Email or password')]")).isDisplayed();
	    Assert.assertTrue(check);
	 }	
	
	
	@After
	public void attachReportWithScreen(io.cucumber.java.Scenario scenario)
		{
			if(scenario.isFailed())
			{
				TakesScreenshot screen = (TakesScreenshot)driver;
				byte[] img = screen.getScreenshotAs(OutputType.BYTES);
				scenario.attach(img, "img/png", "ScreenshotImage");
			}
		}



	
}
