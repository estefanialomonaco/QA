import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calendars {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://spicejet.com/");
		
		
		Thread.sleep(2000);	
		
		driver.findElement(By.id("familyandfriend")).click();
		
		
		/*
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());//si me da true, está mal y falla, porque no puede estar seleccionada
		
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());//false en consola, bc not selected
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());//si da false, es que no está seleccionada. y tiene q estarlo, va a fallar. 
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());//true en consola
		
		//count number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
			
		//enabled or disabled element-radio button
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")); //ver que imprime para elemento casilla de calendario, antes de cliquear round trip
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); //si cliqueo, se me habilita el calendar
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));//ver que imprime elemento casilla calendario, después de cliquear, tiene que subir opacity-
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		
		{
			
			System.out.println("it's enabled");
				Assert.assertTrue(true);
		}
		else
		{
			System.out.println("it's not enabled");
			Assert.assertTrue(false);//que falle el test si no está enabled.
			*/
		}
	}
	
//}
		
		
		
		
		
		
		