import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://facebook.com");//url in the browser
		/*
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("estefanialomonaco@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("poron9ga");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		*/
		
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("test@gmail.com");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("1234");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		
		
	}

}
