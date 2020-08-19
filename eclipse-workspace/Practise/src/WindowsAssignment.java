import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");

				
		//Click on Multiple Windows Assignment
		driver.findElement(By.linkText("Multiple Windows")).click();
		
				
		// first window- click on 'Click Here' link
		driver.findElement(By.linkText("Click Here")).click();

		// prepare window handle
		Set<String> ids = driver.getWindowHandles();

		// prepare iterator
		Iterator<String> it = ids.iterator();

		// 1st iteration parent
		String parent_id = it.next();

		// 2nd iteration child
		String child_id = it.next();

		// switch to child
		driver.switchTo().window(child_id);

		// Print text in child window
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());

		// go back to parent
		driver.switchTo().window(parent_id);

		// Print title of parent window
		System.out.println(driver.findElement(By.xpath("//div[@class='example'] //h3")).getText());
	}

}
