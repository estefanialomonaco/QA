import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutosugDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");

		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-incognito");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-web-security");

		ChromeDriver driver = new ChromeDriver(options);
		
		
		
		driver.get("https://www.makemytrip.com");
		    
		
		  driver.findElement(By.id("fromCity")).click();
		  
		  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		  
		  WebElement source =
		  driver.findElement(By.xpath("//input[@placeholder='From']"));
		  
		  source.sendKeys("MUM");
		  
		  Thread.sleep(2000);
		  
		  source.sendKeys(Keys.ARROW_DOWN);
		  
		  source.sendKeys(Keys.ENTER);
		  
		  // Enter text Bangalore to destination search
		  
		  WebElement destination =
		  driver.findElement(By.xpath("//input[@placeholder='To']"));
		  
		  destination.sendKeys("Bengaluru");
		  
		  Thread.sleep(2000);
		  
		  destination.sendKeys(Keys.ARROW_DOWN);
		  
		  destination.sendKeys(Keys.ENTER);
		  
		  Thread.sleep(2000);
		 
		
		
		
	
		
		
		
		
	}
}
