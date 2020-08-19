import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://accounts.google.com/signup");

		//crear elemento de link 'ayuda'
		WebElement h= driver.findElement(By.xpath("//a[contains(text(),'Ayuda')]"));
		
		//click en un link dentro de la página, otra ventana.
		h.click();
		
					
		//get all the windows, it gives the set of windows id.
		Set<String> ids= driver.getWindowHandles();
		
		//it va a ser el valor que va a estar más arriba de todo para empezar a iterar. 
		//ya está listo para iterar
		Iterator<String> it=ids.iterator();
		
		//acá ya itera 1 vez, significa que se para en el parent
		String parent_id=it.next();
		
		
		//acá se para en el child del parent, y si sigue, continúa con las próximas ventanas hijas
		String child_id=it.next();
		
		//switch to window- necesito el valor adentro de q window quiero q cambie
		driver.switchTo().window(child_id);
		
		//ver el texto de esa página que abrí
		System.out.println(driver.getTitle());
		
		//volver a ventana principal
		driver.switchTo().window(parent_id);
		
		//imprimir title de ventana principal
		System.out.println(driver.getTitle());

	}

}