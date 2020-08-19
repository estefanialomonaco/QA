import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="Estefi"; //texto que quiero ingresar en text box y validar
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys(text);
		
		driver.findElement(By.cssSelector("input#alertbtn.btn-style")).click(); //sino usar css--> //input["id='name']
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();//si salta alerta de java en la pag, la acepto

		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss(); //si salta alerta, la cancela
		
	}

}
