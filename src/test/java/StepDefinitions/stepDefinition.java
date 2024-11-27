package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {

	
	public String baseURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver=new ChromeDriver();
	
	@Given("Launch browser")
	public void launch_browser() {
	    
		driver.manage().window().maximize();
		
		driver.get(baseURL);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
	}

	@When("User enters username and password")
	public void user_enters_as_username_and_as_password() throws InterruptedException {
		System.out.println("Enter username n pwd");
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\\\"password\\\"]")).sendKeys("admin123");
		Thread.sleep(3000);

		
	}

	@When("Click on login button")
	public void click_on_login_button() throws InterruptedException {
		System.out.println("Login Button Pressed");

		driver.findElement(By.xpath("//button[\\\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\\\"]")).click();
		Thread.sleep(3000);

	}

	@Then("Page Title should be OrangeHRM")
	public void page_title_should_be_orangehrm() {
	    String pageTitle=driver.getTitle();
	    if(pageTitle.equals("OrangeHRM")) {
	    	System.out.println("Login Success");
	    }
	    else {
	    	System.out.println("Login Failed");
	    }
	}

	@When("User click on LogOut")
	public void user_click_on_log_out() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Browser closes")
	public void browser_closes() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
