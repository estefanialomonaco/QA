import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calendarsTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.path2usa.com/travel-companions");
		
		WebDriverWait w = new WebDriverWait(driver, 10);

				
		//First click on date
		
		//click on calendar box
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ad_pi--open")));
		driver.findElement(By.id("travel_date")).click();


		//while true, if true, goes inside until it becomes false
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[1]/th[2]")).getText().contains("April"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
			
		}
		
		
		//take all the dates into one list
		List<WebElement> dates=driver.findElements(By.className("day"));
		
			
		int count_dates=dates.size();
		
		
		//loop in the list, and match the date i want with the one in the list
		
		for(int i=0; i< count_dates;i++)
			
		{
			String text= dates.get(i).getText(); //checks date by date, and gets the number (in text)
			if(text.equalsIgnoreCase("23")) {
				
				dates.get(i).click();
				break;
			}
		}
		
		
		
	}

}
