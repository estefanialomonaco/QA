import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		// count of links
		List<WebElement> links = driver.findElements(By.tagName("a")); // Identify the number of Link on webpage and
		// assign into Webelement List

		int linkCount = links.size(); // Count the total Link list on Web Page

		System.out.println("Total Number of link count on webpage = " + linkCount); // Print the total count of links on
		// webpage

		// count of links in the footer section --> este va a ser el driver

		WebElement footerDriver = driver.findElement(By.id("gf-BIG")); // find footer section

		List<WebElement> footerLinks = footerDriver.findElements(By.tagName("a")); // find links with mini driver in
		// footer

			
		int footerLinksCount = footerLinks.size(); // count of links in the footer

		System.out.println("Total Number of link count on the total footer = " + footerLinksCount); // Print the total
		// count of links on
		// footer

		// count of links in fotter- left column-1st

		WebElement leftColumnDriver = driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]"));

		List<WebElement> leftColumnLinks = leftColumnDriver.findElements(By.tagName("a"));

		int leftColumnLinksCount = leftColumnLinks.size();

		System.out.println("Total Number of link count on the 1st left column of the footer = " + leftColumnLinksCount);

		// click on each link on the page and check if the pages are working

		// acá empiza en 1 la variable i, porque el link en 0 no anda- abre todas las
		// tabs el loop
		for (int i = 1; i < leftColumnLinksCount; i++) {

			// para abrir links en nuevas tabs
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			leftColumnLinks.get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000);

		}
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();

		// while me dice si hay alguna ventana abierta, if yes, cambiar a la ventana
		// abierta
		while (it.hasNext()) {
			driver.switchTo().window(it.next()); // pasar a la ventana que sigue, si es que hay
			System.out.println(driver.getTitle()); // ver si el titulo de la ventana está ok
		}

	}

}
