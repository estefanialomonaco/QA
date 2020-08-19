import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script = "return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(script);

		

		int i = 0;

		while (!text.equalsIgnoreCase("India")) {

			i++;
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

			text = (String) js.executeScript(script);

			if (i > 10) {

				break;
			}
		}
		if (i > 10) {

			System.out.println("Element not found");
		} else {

			System.out.println("Element found");

		}

		if (text.equalsIgnoreCase("India")) {

			System.out.println("Verified Text");
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);

		}

	}
}
