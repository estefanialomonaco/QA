import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		
		//maximize screen
		driver.manage().window().maximize();
		// Create Action Class
		Actions a = new Actions(driver);
		WebElement move= driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		WebElement write= driver.findElement(By.id("twotabsearchtextbox"));
				
		//write in CAPS
		
		a.moveToElement(write).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
			
		// apoyar mouse sobre un menu y que se despliegue, y apretar ahí botón derecho del mouse
		a.moveToElement(move).contextClick().build().perform();
		
			
		
		

	}

}
