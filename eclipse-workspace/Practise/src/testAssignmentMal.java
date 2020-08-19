
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testAssignmentMal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		// text from option 3
		String optionCheckbox = driver.findElement(By.xpath("//div[@class='right-align']//label[3]")).getText();

		// click in option 3
		driver.findElement(By.id("checkBoxOption3")).click();

		// dropdown- iterar hasta opción de variable optionCheckbox = a valor de
		// Dropdown, y select it

		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));

		List<WebElement> options = dropdown.findElements(By.tagName("option"));

		for (int i = 0; i < options.size(); i++) {

			if (options.get(i).getText().equalsIgnoreCase(optionCheckbox)) {

				options.get(i).click();
				break;

			}

		}

		driver.findElement(By.id("name")).sendKeys(optionCheckbox);

		driver.findElement(By.id("alertbtn")).click();

		String Alert = driver.switchTo().alert().getText();

		if (Alert.contains(optionCheckbox)) {

			driver.switchTo().alert().accept();
		}

		else {

			System.out.println("No funcionó");
		}

	}

}
