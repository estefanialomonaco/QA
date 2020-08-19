import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class prueba {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");



		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);

				
			driver.manage().window().maximize();

			driver.get("https://www.mercadolibre.com.ar/");
			
			

			//categorias - hover over
			WebElement mainMenu=driver.findElement(By.linkText("Categorías"));
			action.moveToElement(mainMenu).build().perform();
			Thread.sleep(2000);
			
			//tecnologia- hover over
			WebElement tecno= driver.findElement(By.xpath("/html/body/header/div/div[2]/ul/li[2]/nav/section[1]/ul[2]/li[1]/a"));
		
			action.moveToElement(tecno).build().perform();
			Thread.sleep(2000);


			//click en tvs
			WebElement tvs= driver.findElement(By.xpath("/html/body/header/div/div[2]/ul/li[2]/nav/section[2]/div/div/article[6]/h2/a"));

			
			action.moveToElement(tvs).click().build().perform();

			
			
	}
	
			
			
}
