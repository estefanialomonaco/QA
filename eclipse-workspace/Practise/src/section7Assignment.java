import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class section7Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.cleartrip.com/");

		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click();//saqué el punto

		Thread.sleep(1000);

		WebElement adult = driver.findElement(By.xpath("//select[@id='Adults']"));

		Thread.sleep(2000);
		Select dropdownFlights = new Select(adult);
		dropdownFlights.selectByValue("3");

		WebElement children = driver.findElement(By.xpath("//*[@id='Childrens']"));
		Select dropdownFlightsCh = new Select(children);
		dropdownFlightsCh.selectByValue("1");

		driver.findElement(By.linkText("More options: Class of travel, Airline preference")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Lufthansa (LH)");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}
}