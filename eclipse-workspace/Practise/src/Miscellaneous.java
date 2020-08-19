import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;



public class Miscellaneous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		
		//maximize window
		driver.manage().window().maximize();
		
		//delete all cookies
		driver.manage().deleteAllCookies();
		
		
		//delete only one cookie
		//driver.manage().deleteCookieNamed(arg0);
		
		//session-delete sessionc cookie
		//driver.manage().deleteCookieNamed(sessionKey);
		//click on any link
		//verify login url
		
		
		driver.get("http://google.com");
		
		
		
		//convert object to screenshot taker- casting driver object to take screenshot method object
		//usar users folder, directo en C no funciona
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\Screenshots\\screenshot_1.png"));	
		
		
	}

}
