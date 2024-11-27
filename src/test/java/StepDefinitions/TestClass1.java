package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestClass1 {
	
	@BeforeTest
	public void launchDriver() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("Test1 = "+driver.getTitle());

	}
@Test
	public void Test1() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		System.out.println("Test1 = "+driver.getTitle());
	}
@Test
	public void Test2() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	System.out.println("Test2 = "+driver.getTitle());}
@Test
	public void Test3() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	System.out.println("Test3 = "+driver.getTitle());}
	
	
	
	
}
