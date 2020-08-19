import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Assignment_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#checkBoxOption1")).click();//cliquear para que esté seleccionada
		Assert.assertTrue(driver.findElement(By.cssSelector("input#checkBoxOption1")).isSelected());//chequear si está seleccionado el checkbox
		driver.findElement(By.cssSelector("input#checkBoxOption1")).click();//cliquear para sacar la selección
		Assert.assertFalse(driver.findElement(By.cssSelector("input#checkBoxOption1")).isSelected());//false, no puede estar seleccionada
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
