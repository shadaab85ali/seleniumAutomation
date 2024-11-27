package StepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
//		*Capture FullScreen* 
		
//		TakesScreenshot screenshot=((TakesScreenshot)driver);
//
//		File src=screenshot.getScreenshotAs(OutputType.FILE);
//		
//		File dest=new File("D:\\Users\\HP\\eclipse-workspace\\AutomationProjectV2\\ScreenShots\\fullSS.png");
//		
//		FileUtils.copyFile(src, dest);
	// ----------------------------------------------------------------------------------------------------------------------	
		// * part of WebPage
		WebElement section=driver.findElement(By.xpath("//div[@class=\"orangehrm-login-error\"]"));
		File src=section.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("D:\\Users\\HP\\eclipse-workspace\\AutomationProjectV2\\ScreenShots\\sectionSS.png");
        FileUtils.copyFile(src, dest);

		
	}

}
