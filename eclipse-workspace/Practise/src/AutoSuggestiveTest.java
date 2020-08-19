import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestiveTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ksrtc.in");

		WebDriverWait w = new WebDriverWait(driver, 5);

		// Print element that is in From Place, example city BENGALURU

		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ENTER);
		// System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());
		// no se permite obtener hidden elements en selenium

		// Javascript DOM CAN EXTRACT HIDDEN ELEMENTS
		// selenium cannot identify hidden elements (ajax implementation)
		// investigate the properties of object if it has any hidden text- in this case
		// BENGALURU, that is in the from textbox selected

		// JavascriptExecutor

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// js sirve para ejecutar javascript DOM api, y buscar hidden elements

		// this is how to print a value in javascript
		// name of the city in the from to place
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);

		System.out.println(text);

		int i=0;
		
		// fIND THE OPTION THAT IS AN AIRPORT

		while (!text.equalsIgnoreCase("BENGALURU INTATION AIPORT")) {
		//while (!text.contains("AIRPORT")) {
			
			i++;

			// System.out.println(text);

			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
			if (i>10) {
				
				break;
			}
		}
			if (i>10) {
				
				System.out.println("Element not found");
			}
			else {
				
				System.out.println("Element found");

			}
			
			// }

			// driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ENTER);
			// System.out.println(text);

			// OTRA OPCION QUE SIRVE PARA ENCONTRAR CIUDAD CON AIRPORT
			/*
			 * List <WebElement> options
			 * =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
			 * 
			 * for (WebElement option:options) //option es la variable en donde se guarda
			 * 'BENG' y todos los que van iterando
			 * 
			 * {
			 * 
			 * if(option.getText().contains("AIRPORT"))
			 * 
			 * {
			 * 
			 * System.out.println(option.getText()); break;
			 * 
			 * }
			 * 
			 * }
			 */

		}

	}

