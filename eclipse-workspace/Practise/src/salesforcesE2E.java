import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforcesE2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		/*
		driver.get("http://rediff.com/");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'login')]")).sendKeys("estefilomo");
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("1234234");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
	
		driver.get("http://google.com/");
		//driver.findElement(By.xpath("//div[@class='gb_qe gb_i gb_Pg gb_Fg']/div[2]/a")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("me pone triste no conseguir trabajo");
		*/
		
		
		/*
		driver.get("https://www.rahulshettyacademy.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='header-upper']//li[2]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='header-upper']//li[2]/following-sibling::li[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='header-upper']//li[2]/following-sibling::li[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='header-upper']//li[2]/following-sibling::li[3]")).click();
		*/
		
		
		//ejemplos
		driver.get("http://qaclickacademy.com/interview.php");
		//driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();
	}

}
