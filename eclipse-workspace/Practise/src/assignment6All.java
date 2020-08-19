import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class assignment6All {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(2000);
		// text from option 3
		String pedo=driver.findElement(By.xpath("//input[@name='checkBoxOption3']")).getText();		
		
		System.out.println(pedo);
		
		
		// click in option 3
		//driver.findElement(By.id("checkBoxOption3")).click();

		// dropdown- iterar hasta opción de variable optionCheckbox = a valor de Dropdown, y select it

		//WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));

		//List<WebElement> options = dropdown.findElements(By.tagName("option"));

		//Iterator<WebElement> it = options.iterator();

		/*
		while (it.hasNext()) {
			if (it.next().getText().equals(optionCheckbox));
				
			{
				it.next().click();
				continue;
			}
		}

		
		//driver.findElement(By.id("name")).sendKeys(optionCheckbox);*/

		
		
		
		
		
		// driver.findElement(By.id("alertbtn")).click();

		/*
		 * String Alert = driver.switchTo().alert().getText();
		 * 
		 * if (Alert.contains(optionCheckbox)) {
		 * 
		 * driver.switchTo().alert().accept(); }
		 * 
		 * else {
		 * 
		 * System.out.println("No funcionó"); }
		 */

	}

}
