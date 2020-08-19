import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Meteorologia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// ir al site anterior
		driver.get("http://www3.smn.gob.ar/");

		// definir elemento temperatura anterior
		WebElement temp_ant = (driver.findElement(By.id("temportuzar")));

		// tomar valor temperatura site anterior
		String temp_ant_text = temp_ant.getText();

		//limpieza de valores no númericos, para chequear sólo el valor de temperatura
		temp_ant_text= temp_ant_text.replaceAll("[^\\d.]", "");
		
		
		// ir al site nuevo
		driver.navigate().to("https://www.smn.gob.ar/");

		// definir elemento temperatura new
		WebElement temp_new = (driver.findElement(By.id("estado_tempDesc")));

		// tomar valor temperatura site anterior
		String temp_new_text = temp_new.getText();
		
		//limpieza de valores no númericos, para chequear sólo el valor de temperatura
		temp_new_text= temp_new_text.replaceAll("[^\\d.]", "");
		
		// imprime valor temperatura site anterior
		System.out.println(temp_ant_text);

		// imprime valor temperatura site new
		System.out.println(temp_new_text);

		// comparar temperatura site anterior con site nuevo, y frenar el test si no
		// coinciden.
		Assert.assertEquals(temp_ant_text, temp_new_text);
		
		System.out.println("funcionalidad OK");
	}

}
