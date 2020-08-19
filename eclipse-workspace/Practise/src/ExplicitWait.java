import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// explicit wait global
		// Explicit Wait- wait for a specific event on the site
		WebDriverWait w = new WebDriverWait(driver, 5);

		//go to site
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");

		// Find link Demo and click
		driver.findElement(By.linkText("Click to load get data via Ajax!")).click();

		//wait for the Demo Link to load
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("results")));

		//print text after demo link loaded
		System.out.println(driver.findElement(By.id("results")).getText());
	}

}
