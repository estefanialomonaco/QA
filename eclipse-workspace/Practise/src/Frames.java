import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
	
		//frame es un container, por eso no funciona así nomás con click, Selenium no los puede identificar.
		//hay que decirle a selenium que no es un frame, para que lo pueda automatizar
		
		
		//contar frames
		driver.findElement(By.tagName("iframe")).getSize();
		
		//switch to frame
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		
		//switch to frame using index
		driver.switchTo().frame(0);
		
	
		//Define Actions
		Actions drag= new Actions(driver);
	
		//Create WebElement 'source'- el elemento que quiero draggear
		WebElement source= driver.findElement(By.id("draggable"));
		
		//Create WebElement 'target'- el elemento sobre el que quiero droppear
		WebElement target= driver.findElement(By.id("droppable"));

				
		//hacer drag and drop
		drag.dragAndDrop(source, target).build().perform();

		//salir del frame
		driver.switchTo().defaultContent();
		
	}

}
