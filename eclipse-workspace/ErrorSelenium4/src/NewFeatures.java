import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class NewFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement nameEditBox=driver.findElement(By.cssSelector("[name='name']"));
		
		//imprime el nombre del label que está arriba del campo username- es para 
		//identificar elementos sin tener q traverse de child a parent- porque
		//username no podemos identificar uniquely
		System.out.println(driver.findElement(withTagName("label").above(nameEditBox)).getText());
		
		WebElement dateofBirth=driver.findElement(By.cssSelector("[for='dateofBirth']"));
		
		//encuentra campo debajo de label Birth of Date
		driver.findElement(withTagName("input").below(dateofBirth)).sendKeys("11/11/1984");
		

		
		WebElement icecreamLabel= driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		
		
		
		//encuentra elemento a la izquierda
		
		driver.findElement(withTagName("input").toLeftOf(icecreamLabel)).click();

	}

}